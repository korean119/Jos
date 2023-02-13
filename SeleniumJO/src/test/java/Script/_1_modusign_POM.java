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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesObject.HomePage;
import PagesObject.SingInPage;
import TestrailAPI.APIClient;
import TestrailAPI.APIException;
import TestrailAPI.TestRails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class _1_modusign_POM {

	protected WebDriver driver;

	HomePage objHomePage;
	SingInPage objSingInPage; 

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		// 이전에는 여기다 선언 했었음 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@BeforeTest
	public void lauchdriver() {
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/johnny/Downloads/chromedriver_mac64/chromedriver");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tncls\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");

	}
	@AfterClass
	public void tearDown() {
		//driver.close();
		//driver.quit();

	}

	@Test(priority = 1) // 홈페이지 접속 
	public void Homepage() {
		driver.get("https://stage-app.modusign.co.kr");
		driver.manage().window().setSize(new Dimension(1920, 1080));

	}
	
	@Test(priority = 2) // 홈페이지 접속 
	public void login() {
		objSingInPage = new SingInPage(driver);
		objSingInPage.login("joshin1@getnada.com", "tlswnsdh2@@");
	
	}
}