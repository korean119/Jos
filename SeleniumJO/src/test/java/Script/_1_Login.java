package Script;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listener.ListenerTest;
import Testrail_client.APIClient;
import Testrail_client.Testrails.TestRails;



@Listeners(ListenerTest.class)
public class _1_Login extends _0_BaseTest {
	
	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;

	@TestRails(id = "7927")
	@Test

	public void login() throws InterruptedException {

		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");

	}
}