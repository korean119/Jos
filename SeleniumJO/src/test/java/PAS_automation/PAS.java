package PAS_automation;



import org.aspectj.bridge.AbortException;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
			  
	  public static final int TEST_CASE_PASSED_STATUS = 1;
	  public static final int TEST_CASE_FAILED_STATUS = 5;
	  
	  
	  JavascriptExecutor js;
	  
	  @BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	    
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  }
	  
	  
	  @BeforeSuite
	  public void createSuite(ITestContext ctx) throws IOException, AbortException, APIException {
		  client = new APIClient("https://entbc.testrail.io");
		  client.setUser("joshin@ent-bc.com");
		  client.setPassword("Qood1234!");
		  
		  Map data = new HashMap();
		  data.put("include_all",true);
		  data.put("name","PAS_Selenium IDE 자동화 테스트"+System.currentTimeMillis());
		  
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
		  
	  
	  @AfterMethod
	  public void afterTest(ITestResult result, ITestContext ctx) throws IOException, APIException {
		  
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

	  }
	  

	  @AfterClass
	  public void tearDown() {
		  driver.close();
	    driver.quit();
	    
	  }

	  
	  @TestRails(id = "114041")
	  @Test
	  public void Dashboard() throws InterruptedException {
			// 로그인
			    driver.get("https://admin.stg.p3.ent-bc.com//login");
			    driver.manage().window().setSize(new Dimension(1936, 1048));
			    driver.findElement(By.name("partnerId")).click();
			    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
			    driver.findElement(By.cssSelector(".jkQpPZ")).click();
			    driver.findElement(By.name("adminUserId")).click();
			    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
			    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
			    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

			// 홈 화면 진입
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
			    
			// 내 프로필 보기 버튼 클릭
			    driver.findElement(By.cssSelector(".Drawerstyled__StyledDrawerButton-sc-19dm0a4-2 > span > img")).click();
			    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
			    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(2)")).click();
			    
			// 제휴사 상세보기 화면 진입
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
			
			    // 로그아웃
			    driver.findElement(By.cssSelector(".bCthFi")).click();
			  }
			
	  @TestRails(id = "115772")
	  @Test
	  public void PointcodeManager2() throws InterruptedException {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.manage().window().setSize(new Dimension(1936, 1048));
	    driver.findElement(By.name("partnerId")).click();
	    driver.findElement(By.name("partnerId")).sendKeys("QC_QOOD");
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	    driver.findElement(By.name("adminUserId")).sendKeys("jw5kimqood");
	    driver.findElement(By.name("password")).sendKeys("@@Kk384024");
	    driver.findElement(By.name("adminUserId")).click();
	    driver.findElement(By.cssSelector(".jkQpPZ")).click();
	// 로그인
	// 홈 화면 진입
	    driver.findElement(By.linkText("포인트")).click();
	    driver.findElement(By.linkText("•  포인트 코드 관리")).click();
	// 포인트 코드 관리 화면 진입
	    driver.findElement(By.cssSelector(".bCthFi:nth-child(1)")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".bCthFi:nth-child(1)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(1)")).click();
	// {검색바} 조건 검색:검색 조건 추가 하기 클릭
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.id("search-input-pointName")).click();
	    driver.findElement(By.id("search-input-pointName")).sendKeys("QOOD_2");
	    driver.findElement(By.id("search-input-pointCode")).click();
	    driver.findElement(By.id("search-input-pointCode")).sendKeys("QOOD_2_S");
	    driver.findElement(By.cssSelector(".cirFxe")).click();
	// 조회하기 버튼 클릭
	// 마우스 오버
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	// 마우스 아웃
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2) > svg")).click();
	// 조건 초기화 버튼 클릭
	    {
	      WebElement element = driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	// 햄버거 버튼 클릭
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
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	    driver.findElement(By.cssSelector(".kEWnMS")).click();
	// 햄버거 버튼 왼쪽 저장 버튼 클릭
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	// 햄버거 버튼 클릭
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .Buttonstyled__StyledButton-sc-8yo8rr-0 > span > img")).click();
	// 상태 오른쪽 메뉴 버튼 클릭
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
	    driver.findElement(By.cssSelector(".kEWnMS")).click();
	// 햄버거 버튼 왼쪽 수정 버튼 클릭
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
	    driver.findElement(By.cssSelector(".kEWnMS")).click();
	    
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
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1)")).click();
	    
	// (햄버거 버튼 클릭 후 드롭다운 리스트 1번 클릭)
	    driver.findElement(By.cssSelector(".mxlwL")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(2) > span")).click();
	// (햄버거 버튼 클릭 후 드롭다운 리스트 2번 클릭)
	    driver.findElement(By.linkText("포인트 코드 관리")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".bCthFi:nth-child(1)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
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
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(3)")).click();
	// (햄버거 버튼 클릭 후 드롭다운 리스트 3번 클릭)
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
	// 아니오 버튼 클릭
	    driver.findElement(By.cssSelector(".UserThumbnailstyled__StyledThumbnail-sc-32whse-0")).click();
	    driver.findElement(By.cssSelector(".ProfileDropdownstyled__StyledProfileMenuItem-sc-1qogqiz-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".Modalstyled__StyledModalBottom-sc-qrf4of-6 > .Buttonstyled__StyledButton-sc-8yo8rr-0")).click();
	  }

	  
	  @TestRails(id = "115773")
	  @Test
	  public void ViewPointpublishextinctionhistory() throws InterruptedException {
	    driver.get("https://admin.stg.p3.ent-bc.com/login");
	    driver.findElement(By.name("partnerId")).click();
	    
	    WebElement partnerId = driver.findElement(By.name("partnerId"));
	    partnerId.sendKeys("QC_QOOD");
	  
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
	// 로그인
	    driver.findElement(By.linkText("포인트")).click();
	    driver.findElement(By.linkText("•  포인트 발행/소멸 내역 조회")).click();
	// 포인트 발행/소멸 내역 조회 화면 진입
	    driver.findElement(By.cssSelector(".Searchstyled__StyledSearchedCondition-sc-r8kiet-3")).click();
	// 검색창 클릭 후 항목 2,3,4 클릭
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".SearchContentstyled__StyledSearchTab-sc-qesebl-2:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".jBjyId")).click();
	    driver.findElement(By.cssSelector(".SearchCalendar__StyledDateInput-sc-85houc-1 > span > img")).click();
	// 날짜 클릭
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
	// 항목 내용 입력
	    driver.findElement(By.cssSelector(".IDNZW")).click();
	    driver.findElement(By.id("search-input-issueNid")).click();
	    driver.findElement(By.id("search-input-issueNid")).sendKeys("4820");
	    driver.findElement(By.id("search-input-customerId")).click();
	    driver.findElement(By.id("search-input-customerId")).sendKeys("dgham");
	    driver.findElement(By.id("search-input-pointName")).click();
	    driver.findElement(By.id("search-input-pointName")).sendKeys("QOOD_2");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("search-input-pointCode")).click();
	    driver.findElement(By.id("search-input-pointCode")).sendKeys("QOOD_2_P");
	    driver.findElement(By.cssSelector(".cirFxe:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Buttonstyled__StyledButton-sc-8yo8rr-0:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".Hamburger__StyledHamburger-sc-omsdk9-0 > span > img")).click();
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2:nth-child(1) > span")).click();
	// 햄버거 버튼 클릭 후 드롭다운리스트 항목 1 클릭
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
	// 햄버거 버튼 클릭 후 드롭다운리스트 항목 2 클릭
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
	// 포인트 발행 항목 5번 상태 옆 메뉴 버튼 클릭 ( 5번 : 소멸시키기 활성화 되어있는 항목 )
	    driver.findElement(By.cssSelector(".Dropdownstyled__StyledDropdownItem-sc-1krro1d-2")).click();
	// 포인트 소멸 시키기 클릭
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
	}


