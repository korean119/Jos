package Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.bridge.AbortException;
import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import TestrailAPI.APIClient;
import TestrailAPI.APIException;
import TestrailAPI.TestRails;

public class Testrail extends _1_modusign {
	
	APIClient client = null;
	String PROJECT_ID = "13";
	
	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;
	
	@BeforeSuite
	public void createSuite(ITestContext ctx) throws IOException, AbortException, APIException {
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

	}

	@BeforeMethod
	public void beforeTest(ITestContext ctx, Method method) throws NoSuchMethodException {
		Method m = _1_modusign.class.getMethod(method.getName());

		if (m.isAnnotationPresent(TestRails.class)) {
			TestRails ta = m.getAnnotation(TestRails.class);
			System.out.println(ta.id());
			ctx.setAttribute("caseId", ta.id());

		}
	}


	@AfterMethod
	public void afterTest(ITestResult result, ITestContext ctx) throws IOException, APIException {

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

		//System.out.println("스투이트 아이디" + suiteId + "케이스 아이디" + caseId);

		client.sendPost("add_result_for_case/" + suiteId + "/" + caseId, data);
	}
}


