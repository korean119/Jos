package PAS_automation;



import org.aspectj.bridge.AbortException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PAS {

	  private WebDriver driver;
	  private String URL = "https://admin.stg.p3.ent-bc.com/login";
	  private Map<String, Object> vars;
	  
	  String PROJECT_ID = "11";
	  String TEST_RUN_ID = "422";
	  String testCaseId= "111966";
	  String TESTRAIL_MILESTONEID = "23";
			  
	  public static final int TEST_CASE_PASSED_STATUS = 1;
	    public static final int TEST_CASE_FAILED_STATUS = 5;
	  
	  
	  
	  APIClient client = null;
	  
	  JavascriptExecutor js;
	  
	  @BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	    
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  }
	  
	  @BeforeSuite
	  public void createSuite(ITestContext ctx) throws IOException, AbortException, APIException {
		  client = new APIClient("https://entbc.testrail.io");
		  client.setUser("joshin@ent-bc.com");
		  client.setPassword("Qood1234!");
		  
		  String testRunId = TEST_RUN_ID;
		  
		  Map data = new HashMap();
		  data.put("include_all",true);
		  data.put("name","신준오"+System.currentTimeMillis());
		  
		  
	        data.put("status_id", 1);
	        data.put("status_id", 5);
	        data.put("comment", "Test Executed - Status updated automatically from Selenium test automation.");
	        client.sendPost("add_result_for_case/"+testRunId+"/"+testCaseId+"",data );

	    }

	
			/*
			 * JSONObject c = null; c = (JSONObject)client.sendPost("add_run/"+
			 * PROJECT_ID,data);
			 */
		  
		  
		  
	  
	  
	  
	  @AfterClass
	  public void tearDown() {
	    driver.quit();
	    
	  }
	  
	  
	  @BeforeTest
	  public void lauchweb() { 
		  System.setProperty("webdriver.chrome.driver", "c:/selenium/chromedriver_win321/chromedriver.exe"); 
	         
	  }
	  
	  @TestRails(id="T4874918")
	  @Test
	  public void HI() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("고객")).click();
	    driver.findElement(By.linkText("•  고객 관리")).click();
	    driver.findElement(By.cssSelector(".bCthFi > span")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".bCthFi > span"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2")).click();
	    driver.findElement(By.id("search-input-customerIdLike")).click();
	    driver.findElement(By.id("search-input-customerIdLike")).sendKeys("1207테스트");
	    driver.findElement(By.cssSelector(".cirFxe")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.linkText("고객 관리")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector("tr:nth-child(4) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector("tr:nth-child(4) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	    
	    Assert.assertTrue(true);
	  }
}
	  
	/*  }
	  
	  @Test
	  public void HI1() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("구성원 관리")).click();
	    driver.findElement(By.cssSelector(".bCthFi > span")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".bCthFi > span"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2")).click();
	    driver.findElement(By.id("search-input-adminUserName")).click();
	    driver.findElement(By.id("search-input-adminUserName")).sendKeys("test");
	    driver.findElement(By.cssSelector(".cirFxe")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    driver.findElement(By.cssSelector(".kEWnMS")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.linkText("구성원 관리")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }
	  
	  @Test
	  public void HI2() {
	    driver.get("https://admin.stg.p3.ent-bc.com//login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.get("https://admin.stg.p3.ent-bc.com//");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.cssSelector(".kKcgJU")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".kKcgJU"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Drawerstyled__StyledDrawerButton-sc-19dm0a4-2 > span > img")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".kEWnMS")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.linkText("홈")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".bCthFi")).click();
	  }
	  @Test
	  public void HI3() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("근거 자산")).click();
	    driver.findElement(By.linkText("•  자산 관리")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".kEWnMS"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".kEWnMS")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.linkText("자산 관리")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".bCthFi")).click();
	  }
	  
	  @Test
	  public void HI4() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("제휴사 관리")).click();
	    driver.findElement(By.cssSelector(".bCthFi > span")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.id("search-input-partnerName")).click();
	    driver.findElement(By.id("search-input-partnerName")).sendKeys("요긱");
	    driver.findElement(By.id("search-input-mainManagerName")).click();
	    driver.findElement(By.id("search-input-mainManagerName")).sendKeys("손한비");
	    driver.findElement(By.id("search-input-mainPhoneNumber")).click();
	    driver.findElement(By.id("search-input-mainPhoneNumber")).sendKeys("01048805341");
	    driver.findElement(By.cssSelector(".cirFxe")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    driver.findElement(By.cssSelector(".kEWnMS")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".kEWnMS"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.linkText("제휴사 관리")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("form")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }
	  @Test
	  public void HI5() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("포인트")).click();
	    driver.findElement(By.linkText("•  포인트 코드 관리")).click();
	    driver.findElement(By.cssSelector(".bCthFi > span")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.id("search-input-pointName")).click();
	    driver.findElement(By.id("search-input-pointName")).sendKeys("QOOD_2");
	    driver.findElement(By.id("search-input-pointCode")).click();
	    driver.findElement(By.id("search-input-pointCode")).sendKeys("QOOD_2_S");
	    driver.findElement(By.cssSelector(".cirFxe")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.linkText("포인트 코드 관리")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("포인트 코드 관리")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }
	  @Test
	  public void HI6() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("근거 자산")).click();
	    driver.findElement(By.linkText("•  거래 내역 조회")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".jjPbNj > span > img")).click();
	    driver.findElement(By.cssSelector(".AssetHistoryDrawer__StyledDateInput-sc-1m260fi-4 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".rdrMonth:nth-child(1) .rdrDay:nth-child(5)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".IDNZW")).click();
	    driver.findElement(By.cssSelector(".AssetHistoryBox__StyledAssetHistoryBox-sc-acuort-0:nth-child(35)")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".bCthFi")).click();
	  }
	  @Test
	  public void HI7() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("고객")).click();
	    driver.findElement(By.linkText("•  결제 내역 조회")).click();
	    driver.findElement(By.cssSelector(".bCthFi:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.cssSelector(".SearchCalendar__StyledDateInput-sc-85houc-1 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".SearchCalendar__StyledDateInput-sc-85houc-1 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".IDNZW")).click();
	    driver.findElement(By.id("search-input-orderNumber")).click();
	    driver.findElement(By.id("search-input-orderNumber")).sendKeys("2020121912312");
	    driver.findElement(By.cssSelector(".cirFxe:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".StatusButton__StyledStatusButton-sc-zyjrzg-0"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".dCAtv")).click();
	    driver.findElement(By.cssSelector(".fbieoe")).click();
	    driver.findElement(By.cssSelector(".kKcgJU")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".kKcgJU"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    driver.findElement(By.cssSelector(".Drawerstyled__StyledDrawerButton-sc-19dm0a4-2 > span > img")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }
	  @Test
	  public void HI8() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("포인트")).click();
	    driver.findElement(By.linkText("•  포인트 발행/소멸 내역 조회")).click();
	    driver.findElement(By.cssSelector(".Searchstyled__StyledSearchedCondition-sc-r8kiet-3")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.cssSelector(".SearchCalendar__StyledDateInput-sc-85houc-1 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".rdrMonth:nth-child(2) .rdrDay:nth-child(6)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".IDNZW")).click();
	    driver.findElement(By.id("search-input-issueNid")).click();
	    driver.findElement(By.id("search-input-issueNid")).sendKeys("4820");
	    driver.findElement(By.id("search-input-customerId")).click();
	    driver.findElement(By.id("search-input-customerId")).sendKeys("dgham");
	    driver.findElement(By.id("search-input-pointName")).click();
	    driver.findElement(By.id("search-input-pointName")).sendKeys("QOOD_2");
	    driver.findElement(By.id("search-input-pointCode")).click();
	    driver.findElement(By.id("search-input-pointCode")).sendKeys("QOOD_2_P");
	    driver.findElement(By.cssSelector(".cirFxe:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1) > span")).click();
	    driver.findElement(By.cssSelector(".Inputstyled__StyledInput-sc-1unydu2-1")).click();
	    driver.findElement(By.cssSelector(".ComboBoxstyled__StyledComboBoxListItem-sc-curvxw-4:nth-child(1) > .ComboBoxstyled__StyledComboBoxWithSub-sc-curvxw-5")).click();
	    driver.findElement(By.linkText("포인트 발행/소멸 내역 조회")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(5) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }
	  @Test
	  public void HI9() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.cssSelector(".FormItemWrapperstyled__StyledFormItemWrapper-sc-fd1n3x-0:nth-child(2)")).click();
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("고객")).click();
	    driver.findElement(By.linkText("•  고객 지갑 관리")).click();
	    driver.findElement(By.cssSelector(".bCthFi > span")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.id("search-input-customerId")).click();
	    driver.findElement(By.id("search-input-customerId")).sendKeys("dgham");
	    driver.findElement(By.id("search-input-balance")).click();
	    driver.findElement(By.id("search-input-balance")).sendKeys("0");
	    driver.findElement(By.name("endBalance")).click();
	    driver.findElement(By.name("endBalance")).sendKeys("100000");
	    driver.findElement(By.id("search-input-availableBalance")).click();
	    driver.findElement(By.id("search-input-availableBalance")).sendKeys("0");
	    driver.findElement(By.name("endAvailableBalance")).click();
	    driver.findElement(By.name("endAvailableBalance")).sendKeys("100000");
	    driver.findElement(By.cssSelector(".cirFxe")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }
	  
	  @Test
	  public void HI10() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("포인트")).click();
	    driver.findElement(By.linkText("•  포인트 전송 내역 조회")).click();
	    driver.findElement(By.cssSelector(".Searchstyled__StyledSearchedCondition-sc-r8kiet-3")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Searchstyled__StyledSearchedCondition-sc-r8kiet-3"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.cssSelector(".SearchCalendar__StyledDateInput-sc-85houc-1 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".rdrMonth:nth-child(2) .rdrDay:nth-child(21)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".IDNZW")).click();
	    driver.findElement(By.id("search-input-pointTransferNid")).click();
	    driver.findElement(By.id("search-input-pointTransferNid")).sendKeys("3488");
	    driver.findElement(By.cssSelector(".cirFxe:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".Drawerstyled__StyledDrawerButton-sc-19dm0a4-2 > span > img")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".fbieoe")).click();
	    driver.findElement(By.linkText("•  포인트 전송 내역 조회")).click();
	    driver.findElement(By.linkText("20221219P98626457")).click();
	    driver.findElement(By.cssSelector(".fbieoe")).click();
	    driver.findElement(By.cssSelector(".Drawerstyled__StyledDrawerButton-sc-19dm0a4-2 > span > img")).click();
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }
	}


*/