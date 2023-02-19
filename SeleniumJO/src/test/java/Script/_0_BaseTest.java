package Script;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.aspectj.bridge.AbortException;
import org.aspectj.lang.annotation.Before;
import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PagesObject._1_LoginPage;
import PagesObject._2_MainPage;
import PagesObject._3_ContractSetupStartModalPopup;
import PagesObject._4_ContractSetup_Step1page;
import PagesObject._5_ContractSetup_Step2page;
import PagesObject._6_ContractSetup_Step3page;
import Testrail_client.APIClient;
import Testrail_client.Testrails.TestRails;

public class _0_BaseTest {

	APIClient client = null;
	String PROJECT_ID = "15";

	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;

	public static WebDriver driver;

	_1_LoginPage objLoginPage;
	_2_MainPage objMainPage;
	_3_ContractSetupStartModalPopup objContractSetupStartModalPopup;
	_4_ContractSetup_Step1page objContractSetup_Step1page;
	_5_ContractSetup_Step2page objContractSetup_Step2page;
	_6_ContractSetup_Step3page objContractSetup_Step3page;

	@BeforeClass
	public void initializeWebDriver() throws IOException { //
		// System.setProperty("webdriver.chrome.driver", //
		// "/Users/johnny/Downloads/chromedriver_mac64/chromedriver");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tncls\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stage-app.modusign.co.kr");

		objLoginPage = new _1_LoginPage(driver);
		objMainPage = new _2_MainPage(driver);
		objContractSetupStartModalPopup = new _3_ContractSetupStartModalPopup(driver);
		objContractSetup_Step1page = new _4_ContractSetup_Step1page(driver);
		objContractSetup_Step2page = new _5_ContractSetup_Step2page(driver);
		objContractSetup_Step3page = new _6_ContractSetup_Step3page(driver);

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

	// 아래는 Testail API. 왜 인지 모르겠지만 클래스 분리가 안되서 일단 합쳐 놓음
	
	@BeforeSuite
	public void createSuite(ITestContext ctx) throws Exception {
		client = new APIClient("https://modusign.testrail.io");
		client.setUser("jo.shin@modusign.co.kr");
		client.setPassword("1120319sA!");

		Map data = new HashMap();
		data.put("include_all", true);
		data.put("name", "Selenium 자동화 테스트 진행");
		// data.put("name","Selenium" + System.currentTimeMillis());

		JSONObject c = null;
		c = (JSONObject) client.sendPost("add_run/" + PROJECT_ID, data);

		Long suite_id = (Long) c.get("id");
		ctx.setAttribute("suiteId", suite_id);

		System.out.print("Testrail Testsuite : " + suite_id);

	}

	@BeforeMethod
	public void beforeTest(ITestResult result, ITestContext ctx, Method method) throws NoSuchMethodException {

		Method m = result.getMethod().getConstructorOrMethod().getMethod();

		if (m.isAnnotationPresent(TestRails.class)) {
			TestRails ta = m.getAnnotation(TestRails.class);
			System.out.println("Testrail Testcase id : " + ta.id());
			ctx.setAttribute("caseId", ta.id());

		}
	}

	@AfterMethod
	public void afterMethod(ITestResult result, ITestContext ctx) throws Exception {
		
		client = new APIClient("https://modusign.testrail.io");
		client.setUser("jo.shin@modusign.co.kr");
		client.setPassword("1120319sA!");

		Map data = new HashMap();
		if (result.isSuccess()) {
			data.put("status_id", 1);
			data.put("comment", "Pass");

		} else {
			data.put("status_id", 5);
			data.put("comment", "Fail_log\n\n"

					+ "< 대표적인 오류 >\n" + "1.NoSuchWindowException = NoSuch 에러는 항목(Element, window등 ..) 을 찾지 못했다. \n"
					+ "2.또 뭐있더라\n\n"

					+ result.getThrowable().toString());
		}

		String caseId = (String) ctx.getAttribute("caseId");
		Long suiteId = (Long) ctx.getAttribute("suiteId");

		client.sendPost("add_result_for_case/" + suiteId + "/" + caseId, data);

		System.out.print("축하축하 Testrail Result update 근데 여기 나중에 수정해야합니다~");
	}

}