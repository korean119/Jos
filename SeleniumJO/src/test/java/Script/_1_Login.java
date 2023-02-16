package Script;

import org.aspectj.bridge.AbortException;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesObject._1_LoginPage;
import PagesObject._2_MainPage;
import TestrailAPI.APIClient;
import TestrailAPI.APIException;
import TestrailAPI.TestRails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class _1_Login extends _0_Base  {
	

	_1_LoginPage objLoginPage; 
	_2_MainPage objMainPage;
	
	@TestRails (id = "7929")
	@Test(priority = 1)
	public void login() throws InterruptedException {
		
		objLoginPage = new _1_LoginPage(driver);
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		
	}
	
}