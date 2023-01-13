package PAS_automation;



import org.aspectj.bridge.AbortException;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PAS {

	  private WebDriver driver;
	  private String URL = "https://admin.stg.p3.ent-bc.com/login";
	  private Map<String, Object> vars;
	  
	  String PROJECT_ID = "11";
	  APIClient client = null;
	  //Long SUITE_ID = (long) 28;
	  //String TEST_RUN_ID = "461";
	  //String testCaseId = "111966";
	  //String TESTRAIL_MILESTONEID = "42";
			  
	  public static final int TEST_CASE_PASSED_STATUS = 1;
	  public static final int TEST_CASE_FAILED_STATUS = 5;
	  

	  JavascriptExecutor js;
	  
	  @BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	    
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  }
	  
	  
	  // 런 생성해 
	  @BeforeSuite
	  public void createSuite(ITestContext ctx) throws IOException, AbortException, APIException {
		  client = new APIClient("https://entbc.testrail.io");
		  client.setUser("joshin@ent-bc.com");
		  client.setPassword("Qood1234!");
		  
		  Map data = new HashMap();
		  data.put("include_all",true);
		  data.put("name","신준오"+System.currentTimeMillis());
		  
		 JSONObject c = null; 
		  c = (JSONObject) client.sendPost("add_run/" + PROJECT_ID, data);
		  
		
		  Long suite_id = (Long) c.get("id");
		  ctx.setAttribute("suiteId", suite_id);
		  

			 
			
	    }
	 
	  
		@BeforeMethod
		public void beforeTest(ITestContext ctx,Method method) throws NoSuchMethodException {
			Method m = PAS.class.getMethod(method.getName());

			if (m.isAnnotationPresent(TestRails.class)) {
				TestRails ta = m.getAnnotation(TestRails.class);
				System.out.println(ta.id());
				ctx.setAttribute("caseId",ta.id());
			}
		}
		
		
		  @BeforeTest
		  public void lauchweb() { 
			  System.setProperty("webdriver.chrome.driver", "c:/selenium/chromedriver_win321/chromedriver.exe"); 
		         
		  }
		  
	  
		  
		  // 테스트 결과를 생성한 런 아이디에 넣어
	  @AfterMethod
	  public void afterTest(ITestResult result, ITestContext ctx) throws IOException, APIException {
		  //String testRunId = TEST_RUN_ID;
		  
	      Map data = new HashMap();
	      if(result.isSuccess()) {
	          data.put("status_id",1);
	          
	      }
	      else{
	          data.put("status_id",5);
	          data.put("comment", result.getThrowable().toString());
	          }
	      
	     data.put("comment", "자동화 테스트 입니다.");;
	     
	    

	     
	     String caseId = (String)ctx.getAttribute("caseId");
	     Long suiteId = (Long)ctx.getAttribute("suiteId");
	     
	     
	     System.out.println("스투이트 아이디" + suiteId + "케이스 아이디" + caseId);
	     
	    client.sendPost("add_result_for_case/"+suiteId+"/"+caseId,data);
	     //client.sendPost("add_result_for_case/"+caseId,data);

	  }
	  

	  @AfterClass
	  public void tearDown() {
		  driver.close();
	    driver.quit();
	    
	  }

	  
	  @TestRails(id = "114041")
	  @Test
	  public void qwdqwd() {
		    driver.get("https://admin.stg.p3.ent-bc.com/login");
		    driver.manage().window().setSize(new Dimension(1936, 1056));
		    driver.findElement(By.name("partnerId")).click();
		    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
		    driver.findElement(By.cssSelector(".jkQpPZ")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.name("adminUserId")).click();
		    driver.findElement(By.name("adminUserId")).sendKeys("joshinqood");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("Qood1234!");
		    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
		    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
		    driver.findElement(By.cssSelector(".bCthFi")).click();
		    Assert.assertTrue(true);
		  }
		
	  @TestRails(id = "115772")
	  @Test
	  public void qwdqwd1() {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".jkQpPZ"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("joshinqood");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("Qood1234!");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".bCthFi")).click();
	    Assert.assertTrue(true);
	  }
	}


