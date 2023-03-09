package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POM_00_BasePage.GNB;
import POM_00_BasePage.LoginPage;
import POM_00_ContractPage.ContractSetup_Step1page;
import POM_00_ContractPage.ContractSetup_Step2page;
import POM_00_ContractPage.ContractSetup_Step3page;
import POM_00_DocumentUploadModal.DomcumentUploadModal;
import POM_01_DocumentsPage.DocumentsPage;
import POM_01_DocumentsPage.DocumentsPage_ContractPage;
import POM_03_TempletePge.TempletePage;
import POM_03_TempletePge.TempletePage_Bulkrequest;
import POM_03_TempletePge.TempletePage_CreatTemplete;

public class _0_BaseTest {

	public WebDriver driver;

	protected LoginPage objLoginPage;

	protected DomcumentUploadModal objDomcumentUploadModal;
	protected ContractSetup_Step1page objContractSetup_Step1page;
	protected ContractSetup_Step2page objContractSetup_Step2page;
	protected ContractSetup_Step3page objContractSetup_Step3page;

	protected GNB objGNB;
	protected DocumentsPage_ContractPage objDocumentsPage_ContractPage;
	protected DocumentsPage objDocumentsPage;

	protected TempletePage objTempletePage;
	protected TempletePage_CreatTemplete objTempletePage_CreatTemplete;
	protected TempletePage_Bulkrequest objTempletePage_Bulkreques;

	@BeforeMethod
	@Parameters("browser")
	public void initializeWebDriver(String browser) throws IOException {

		if (browser.equalsIgnoreCase("Chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Automation_Driver\\chromedriver_win32 (1)/chromedriver.exe");
			// driver = new ChromeDriver();

			System.setProperty("webdriver.chrome.driver",
					"/Users/johnny/Desktop/Selenium_img/driver/chromedriver_mac64/chromedriver");
			driver = new ChromeDriver();

		}

		// else if(browser.equalsIgnoreCase("Edge")){
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Automation_Driver\\edgedriver_win64/msedgedriver.exe");
		// driver = new EdgeDriver();
		// }

		else if (browser.equalsIgnoreCase("Safari")) {
	        SafariOptions options = new SafariOptions();
	        driver = new SafariDriver(options);

		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "/Users/johnny/Desktop/Selenium_img/driver/geckodriver-v0.32.2-macos");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://stage-app.modusign.co.kr/");

		// 페이지로드 타임아웃 효과가 있는지잘 모르겠음. 없는거 같기도..
		// https://www.browserstack.com/guide/understanding-selenium-timeouts
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

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
		objDocumentsPage_ContractPage = new DocumentsPage_ContractPage(driver);

		objTempletePage = new TempletePage(driver);
		objTempletePage_CreatTemplete = new TempletePage_CreatTemplete(driver);
		objTempletePage_Bulkreques = new TempletePage_Bulkrequest(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
