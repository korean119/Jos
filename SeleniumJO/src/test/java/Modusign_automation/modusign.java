package Modusign_automation;



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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class modusign {
	
	  private WebDriver driver;
	  private String URL = "https://admin.stg.p3.ent-bc.com/login";
	  private Map<String, Object> vars;
	  	  
	  String PROJECT_ID = "13";
	  APIClient client = null;
			  
	  public static final int TEST_CASE_PASSED_STATUS = 1;
	  public static final int TEST_CASE_FAILED_STATUS = 5;

	  JavascriptExecutor js;
	  
	  @BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	    

	    // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  }
	  
	  
	  @BeforeSuite
	  public void createSuite(ITestContext ctx) throws IOException, AbortException, APIException {
		  client = new APIClient("https://modusign.testrail.io");
		  client.setUser("jo.shin@modusign.co.kr");
		  client.setPassword("1120319sA!");
		  
		  Map data = new HashMap();
		  data.put("include_all",true);
		  data.put("name","Selenium 자동화 테스트 진행");
		  //data.put("name","Selenium" + System.currentTimeMillis());
		  
		 JSONObject c = null; 
		  c = (JSONObject) client.sendPost("add_run/" + PROJECT_ID, data);
		  
		
		  Long suite_id = (Long) c.get("id");
		  ctx.setAttribute("suiteId", suite_id);
		  
	    }
	 
	  
		@BeforeMethod
		public void beforeTest(ITestContext ctx,Method method) throws NoSuchMethodException {
			Method m = modusign.class.getMethod(method.getName());

			if (m.isAnnotationPresent(TestRails.class)) {
				TestRails ta = m.getAnnotation(TestRails.class);
				System.out.println(ta.id());
				ctx.setAttribute("caseId",ta.id());
				
			}
		}
		
		
		  @BeforeTest
		  public void lauchweb() { 
			  System.setProperty("webdriver.chrome.driver", "/Users/johnny/Downloads/chromedriver_mac64/chromedriver"); 
		        
		  }
		  
	  
	  @AfterMethod
	  public void afterTest(ITestResult result, ITestContext ctx) throws IOException, APIException {
		  
	      Map data = new HashMap();
	      if(result.isSuccess()) {
	          data.put("status_id",1);
	          data.put("comment", "Pass");;
	          
	      }
	      else{
	          data.put("status_id",5);
	          data.put("comment", "Fail_log\n\n"
	        		  
	          		+ "< 대표적인 오류 >\n"
	          		+ "1.NoSuchWindowException = NoSuch 에러는 항목(Element, window등 ..) 을 찾지 못했다. \n"
	          		+ "2.또 뭐있더라\n\n" 
	          		
	          		+ result.getThrowable().toString());
	          }
	      
	    
	     
	     String caseId = (String)ctx.getAttribute("caseId");
	     Long suiteId = (Long)ctx.getAttribute("suiteId");
	     
	     System.out.println("스투이트 아이디" + suiteId + "케이스 아이디" + caseId);
	     
	    client.sendPost("add_result_for_case/"+suiteId+"/"+caseId,data);

	  }
	  

	  @AfterClass
	  public void tearDown() {
		  driver.close();
	    driver.quit();
	    
	  }

	  
	  @TestRails(id = "7615")
	  @Test
	  public void Dashboard() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	  	   
	    driver.get("https://stage-app.modusign.co.kr/authentication/signin?redirectTo=%2Fdocuments");
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));

	  
	    
	    driver.manage().window().setSize(new Dimension(1792, 1043));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("joshin1@getnada.com");
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("tlswnsdh2@@");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    
	    /*
	    // 이게 뭘 클릭 하는거지?
	    driver.findElement(By.cssSelector(".css-p6mhyl > .css-l82s7l:nth-child(2) .css-373z2j")).click();
	    driver.findElement(By.cssSelector(".css-p6mhyl > .css-l82s7l:nth-child(3) .css-373z2j")).click();
	    */
	    
	    /*
	    // 이게 뭐람?
	    {
	      WebElement element = driver.findElement(By.cssSelector(".css-p6mhyl > .css-l82s7l:nth-child(3) .css-373z2j"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    */
	    
	    /*
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-p6mhyl > .css-l82s7l:nth-child(4) .css-373z2j")));
	    driver.findElement(By.cssSelector(".css-p6mhyl > .css-l82s7l:nth-child(4) .css-373z2j")).click();
	    
	    // 문서함을 왜누르지
	    
	    */
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tagGNBContractSetupStartBtn")));
	    driver.findElement(By.cssSelector(".tagGNBContractSetupStartBtn")).click();
	    
	    driver.findElement(By.cssSelector(".css-1uzrp8i")).click();
	    
	    
	    //문서 업로드 팝업 > [계약서 샘플] 버튼 입력 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("SAMPLE_DOCUMENTS")));
	    driver.findElement(By.name("SAMPLE_DOCUMENTS")).click();
	    
	  
	    // 문서 업로드 팝업 > 계약서 샘플 >[샘플]서명요청체험문서 버튼 입력
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".UpLoadModalSampleDocuments__title:nth-child(2) > .UpLoadModalSampleDocuments__button")));
	    driver.findElement(By.cssSelector(".UpLoadModalSampleDocuments__title:nth-child(2) > .UpLoadModalSampleDocuments__button")).click();
	    
	    Thread.sleep(1000); 
	    // 업로드 하기 
	    driver.findElement(By.cssSelector(".css-1uzrp8i")).click();
	    
	    // 확인하고 시작하 버튼 
	    Thread.sleep(1000); 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-elq43k")));
	    driver.findElement(By.cssSelector(".css-elq43k")).click();

	    

	    // 첫번째 지우기 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-8tn0p7 .css-54ez61")));
	    driver.findElement(By.cssSelector(".css-8tn0p7 .css-54ez61")).click();
	    
	    
	    

	    /*
	    
	    {
	      WebElement element = driver.findElement(By.cssSelector(".css-8tn0p7:nth-child(4) .css-54ez61"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    
	    
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    
	    */
	    
	    // 삭제 하기 
	    driver.findElement(By.cssSelector(".css-syd1y3")).click();
	    
	    
	   // driver.findElement(By.cssSelector(".Btn--primary")).click();
	   
	    
		driver.findElement(By.xpath("//button[@aria-label='다음 단계로']"));
	    Thread.sleep(2000); 

	    /*
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Btn--primary > span"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    */
	    
	    //js.executeScript("window.scrollTo(0,0)");
	    
	    driver.findElement(By.cssSelector(".Btn:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".RequesterFieldBusinessPage__virtual-layer")).click();
	    driver.findElement(By.cssSelector(".Btn--primary")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Btn--primary"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".css-1r6iwme")).click();
	    
	    
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".Btn--primary")).click();
	    
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("agreement-check1")));
	    driver.findElement(By.id("agreement-check1")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("agreement-check2")));
	    driver.findElement(By.id("agreement-check2")).click();

	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/div[7]/div/div/div/div/div[5]/div/button"))));
	    driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[5]/div/button")).click();

	
	  }
	}

	    