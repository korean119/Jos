package Test;

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

import Testrail_client.APIClient;
import Testrail_client.Testrails.TestRails;




public class _1_Login extends _0_BaseTest {

	@TestRails(id = "7927")
	@Test

	public void login() throws InterruptedException {

		ObjLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");

	}
}