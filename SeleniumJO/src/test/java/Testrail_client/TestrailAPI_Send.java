package Testrail_client;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

public class TestrailAPI_Send {

	APIClient client = null;
	String PROJECT_ID = "17";


	// 아래는 Testail API, 원래 _0_BaseTest에 포함 되어 있었는데 보기 불편해서 잠깐 떨어트려놓았음
	// 근데 _0_BaseTest가 왜 이 클래스를 상속 받으면 작동 하는지 Testng 프레임워크 자체가 이해가 안가긴 하는데.. 
	// 나중에 다른 api 연동 시킬 때 문제가 될거지만 일단 되니까 놔둠;
	
	@BeforeSuite
	public void createSuite(ITestContext ctx) throws Exception {
		client = new APIClient("https://modusign.testrail.io");
		client.setUser("jo.shin@modusign.co.kr");
		client.setPassword("1120319sA!");

		Map data = new HashMap();
		data.put("include_all", true);
		data.put("name", "리그레이션 TC 자동화 - 서명");
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

					+ "< 대표적인 오류 >\n"
					+ "1.NoSuchWindowException = NoSuch 에러는 항목(Element, window등 ..) 을 찾지 못했다. \n"
					+ "2.InvalidSelectorException = xpath, css 양식을 준수하지 못했다. = 스크립트 오류다 \n "

					+ result.getThrowable().toString());
		}

		String caseId = (String) ctx.getAttribute("caseId");
		Long suiteId = (Long) ctx.getAttribute("suiteId");

		client.sendPost("add_result_for_case/" + suiteId + "/" + caseId, data);

		System.out.print("축하축하 Testrail Result update 근데 여기 나중에 수정해야합니다~ \n");
	}

}