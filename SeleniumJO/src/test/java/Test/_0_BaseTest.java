package Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
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

import PagesObjectModel.GNB;
import PagesObjectModel._1_LoginPage;
import PagesObjectModel_Contract.ContractSetup_Step1page;
import PagesObjectModel_Contract.ContractSetup_Step2page;
import PagesObjectModel_Contract.ContractSetup_Step3page;
import PagesObjectModel_DocumentUploadModal.DomcumentUploadModal;
import PagesObjectModel.DocumtetsPage_ContractPage;
import PagesObjectModel.DocumentsPage;
import Testrail_client.APIClient;
import Testrail_client.TestrailAPI_Send;
import Testrail_client.Testrails.TestRails;

public class _0_BaseTest extends TestrailAPI_Send  {

	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;

	public static WebDriver driver;

	protected _1_LoginPage objLoginPage;
	
	protected DomcumentUploadModal objContractSetupStartModal;
	protected ContractSetup_Step1page objContractSetup_Step1page;
	protected ContractSetup_Step2page objContractSetup_Step2page;
	protected ContractSetup_Step3page objContractSetup_Step3page;
	
	protected DocumtetsPage_ContractPage objDocumtetsPage_ContractPage;
	
	protected DocumtetsPage_ContractPage objContractPage;
	protected DocumentsPage objDocumentsPage;
	protected GNB objGNB;

	@BeforeMethod
	public void initializeWebDriver() throws IOException { //
		 //System.setProperty("webdriver.chrome.driver", //
		 //"/Users/johnny/Downloads/chromedriver_mac64/chromedriver");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tncls\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://stage-app.modusign.co.kr");
		// 브라우저 위치/크기 
		driver.manage().window().setPosition(new Point(2000, 1)); 
		driver.manage().window().maximize();
		

		objLoginPage = new _1_LoginPage(driver);
		
		objContractSetupStartModal = new DomcumentUploadModal(driver);
		objContractSetup_Step1page = new ContractSetup_Step1page(driver);
		objContractSetup_Step2page = new ContractSetup_Step2page(driver);
		objContractSetup_Step3page = new ContractSetup_Step3page(driver);
		
		
		objGNB = new GNB(driver);
		
		objDocumentsPage = new DocumentsPage(driver);
		objDocumtetsPage_ContractPage = new DocumtetsPage_ContractPage(driver);


		
	}

	@AfterMethod
	public void tearDown() {

		//driver.quit();
	}
}
