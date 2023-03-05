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
import org.openqa.selenium.edge.EdgeDriver;
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
import org.testng.annotations.Parameters;

import POM_00_BasePage.GNB;
import POM_00_BasePage.LoginPage;
import POM_00_ContractPage.ContractSetup_Step1page;
import POM_00_ContractPage.ContractSetup_Step2page;
import POM_00_ContractPage.ContractSetup_Step3page;
import POM_01_DocumentUploadModal.DomcumentUploadModal;
import POM_01_DocumentsPage.DocumentsPage;
import POM_01_DocumentsPage.DocumtetsPage_ContractPage;
import POM_03_TempletePage.TempletePage_01_Main;
import POM_03_TempletePage.TempletePage_03_Bulkrequest;
import POM_12_SettingsPage.SettingsPage_01_MyInfo;
import POM_03_TempletePage.TempletePage_02_CreatTemplete;
import Testrail_client.APIClient;
import Testrail_client.TestrailAPI_Send;
import Testrail_client.Testrails.TestRails;

public class BaseTest  {

	public WebDriver driver;

	protected LoginPage objLoginPage;
	
	protected DomcumentUploadModal objDomcumentUploadModal;
	protected ContractSetup_Step1page objContractSetup_Step1page;
	protected ContractSetup_Step2page objContractSetup_Step2page;
	protected ContractSetup_Step3page objContractSetup_Step3page;
	
	protected GNB objGNB;
	protected DocumentsPage objDocumentsPage;
	protected DocumtetsPage_ContractPage objDocumtetsPage_ContractPage;

	
	protected TempletePage_01_Main objTempletePage;
	protected TempletePage_02_CreatTemplete objTempletePage_CreatTemplete;
	protected TempletePage_03_Bulkrequest objTempletePage_Bulkreques;
	
	protected SettingsPage_01_MyInfo objSettingsPage_01_MyInfo;

	@BeforeMethod
	@Parameters("browser")
	public void initializeWebDriver(String browser) throws IOException { //
		 //System.setProperty("webdriver.chrome.driver", //
		 //"/Users/johnny/Downloads/chromedriver_mac64/chromedriver");

		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Automation_Driver\\chromedriver_win32 (1)/chromedriver.exe");
			driver = new ChromeDriver();
			
			}
			else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Automation_Driver\\edgedriver_win64/msedgedriver.exe");
			driver = new EdgeDriver();
			
			}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://stage-app.modusign.co.kr");
		
		// 브라우저 위치/크기 
		driver.manage().window().setPosition(new Point(2000, 1)); 
		driver.manage().window().maximize();
		

		objLoginPage = new LoginPage(driver);
		
		objDomcumentUploadModal = new DomcumentUploadModal(driver);
		objContractSetup_Step1page = new ContractSetup_Step1page(driver);
		objContractSetup_Step2page = new ContractSetup_Step2page(driver);
		objContractSetup_Step3page = new ContractSetup_Step3page(driver);
		
		
		objGNB = new GNB(driver);
		objDocumentsPage = new DocumentsPage(driver);
		objDocumtetsPage_ContractPage = new DocumtetsPage_ContractPage(driver);
		
		objTempletePage = new TempletePage_01_Main(driver);
		objTempletePage_CreatTemplete = new TempletePage_02_CreatTemplete(driver);
		objTempletePage_Bulkreques = new TempletePage_03_Bulkrequest(driver);
		
		
		objSettingsPage_01_MyInfo = new SettingsPage_01_MyInfo(driver);
	

	}

	@AfterMethod
	public void tearDown() {

		driver.close();
		driver.quit();
	}
}
