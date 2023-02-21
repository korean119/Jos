package Test;
//package Script;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Dimension;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import TestrailAPI.TestRails;
//import org.openqa.selenium.Keys;
//import java.util.*;
//
//
//public class modusign extends _0_TestBase {
//	
//
//	@TestRails(id = "7634")
//	@Test(priority = 1) // 홈페이지 접속 
//	public void Homepage() {
//		driver.get("https://stage-app.modusign.co.kr");
//		driver.manage().window().setSize(new Dimension(1920, 1080));
//
//	}
//
//	@TestRails(id = "7629")
//	@Test(priority = 2) // 이메일 입력 
//	public void Login_email() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
//		driver.findElement(By.name("email")).click();
//		driver.findElement(By.name("email")).sendKeys("joshin1@getnada.com");
//
//
//	}
//
//	@TestRails(id = "7630")
//	@Test(priority = 3) // 패스워드 입력 
//	public void Login_Password() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//		driver.findElement(By.name("password")).click();
//		driver.findElement(By.name("password")).sendKeys("tlswnsdh2@@");
//
//
//	}
//
//	@TestRails(id = "7631") // [로그인] 버튼 입력 
//	@Test(priority = 4)
//	public void Login_btn() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1r6iwme")));
//		driver.findElement(By.cssSelector(".css-1r6iwme")).click();
//		
//	}
//
//	@TestRails(id = "7615") // [서명 요청] 버튼 입력
//	@Test(priority = 5)
//	public void ContractSetupStart_btn() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tagGNBContractSetupStartBtn")));
//		driver.findElement(By.cssSelector(".tagGNBContractSetupStartBtn")).click();
//
//	}
//
//
//	@TestRails(id = "7621") // [클라우드 저장소] 버튼 입력 
//	@Test(priority = 6)
//	public void CLOUD_DRIVE_btn() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("CLOUD_DRIVE")));
//		driver.findElement(By.name("CLOUD_DRIVE")).click();
//	}
//	
//	
//	@TestRails(id = "7615") // [내 컴퓨터] 버튼 입력 
//	@Test(priority = 7)
//	public void LOCAL_btn() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("LOCAL")));
//		driver.findElement(By.name("LOCAL")).click();
//	}
//	
//	@TestRails(id = "7626") // [계약서 샘플] 버튼 입력 SAMPLE_DOCUMENTS_btn
//	@Test(priority = 8)
//	public void SAMPLE_DOCUMENTS_btn() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("SAMPLE_DOCUMENTS")));
//		driver.findElement(By.name("SAMPLE_DOCUMENTS")).click();
//		
//		// 샘플 문서 선택 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".UpLoadModalSampleDocuments__title:nth-child(2) > .UpLoadModalSampleDocuments__button")));
//		driver.findElement(By.cssSelector(".UpLoadModalSampleDocuments__title:nth-child(2) > .UpLoadModalSampleDocuments__button")).click();
//		
//		// 업로드 버튼 입력 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1uzrp8i"))); 
//		driver.findElement(By.cssSelector(".css-1uzrp8i")).click();
//		 
//		// 서묭 요청 시작하기 컨펌 팝업
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-elq43k"))); 
//		driver.findElement(By.cssSelector(".css-elq43k")).click();
//		
//	}
//	
//	@TestRails(id = "7638")
//	@Test(priority = 9) // 서명자 설정 화면 > 삭제하기 
//	public void StepProgressBar_stepname1() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		// 두번째 사용자 삭제 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-8tn0p7:nth-child(4) .css-54ez61")));
//		driver.findElement(By.cssSelector(".css-8tn0p7:nth-child(4) .css-54ez61")).sendKeys(Keys.ENTER);
//		
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-syd1y3")));
//		driver.findElement(By.cssSelector(".css-syd1y3")).click();
//	
//	}
//	
//	@TestRails(id = "7639")
//	@Test(priority = 10) // 서명자 설정 화면 > 추가하기 
//	public void StepProgressBar_stepname2() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		// 두번째 사용자 추가
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1uskaei")));
//		driver.findElement(By.cssSelector(".css-1uskaei")).sendKeys(Keys.ENTER);
//				  
//	}
//
//	@TestRails(id = "7641") 
//	@Test(priority = 11) // 서명자 설정 화면 > 서명자 입력 
//	public void StepProgressBar_stepname3() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		// 서명자 입력
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-8tn0p7:nth-child(4) .css-9ky0ym")));
//	    driver.findElement(By.cssSelector(".css-8tn0p7:nth-child(4) .css-9ky0ym")).click();
//	    driver.findElement(By.cssSelector(".css-8tn0p7:nth-child(4) .css-9ky0ym")).sendKeys("johnny");
//		
//	}
//	
//	@TestRails(id = "7643") 
//	@Test(priority = 12) // 서명자 설정 화면 > 서명자 이메일 선택/입력
//	public void StepProgressBar_stepname5() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-8tn0p7:nth-child(4) .css-6ov3ys")));
//	    driver.findElement(By.cssSelector(".css-8tn0p7:nth-child(4) .css-6ov3ys")).click();
//	    
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("smartPhone")));
//	    driver.findElement(By.name("smartPhone")).click();
//	    driver.findElement(By.name("smartPhone")).sendKeys("56953394");
//		
//	}
//	
//	@TestRails(id = "7640")
//	@Test(priority = 13)
//	public void StepProgressBar_stepname6() throws InterruptedException { // 서명자 설정 화면 > 다음단계
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		// 다음단계로
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='다음 단계로']"))); 
//		driver.findElement(By.xpath("//button[@aria-label='다음 단계로']")).click();
//				 
//	}
//	
//	@TestRails(id = "7644")
//	@Test(priority = 14) // 사인 도장 선택 
//	public void StepProgressBar_stepname2_sign() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
// 
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1dgk6ra")));
//		  driver.findElement(By.cssSelector(".css-1dgk6ra")).click();
//		
//		
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".PDFSetupBusinessPage__virtual-layer")));
//		  driver.findElement(By.cssSelector(".PDFSetupBusinessPage__virtual-layer")).click();
//	
//				 
//	}
//	
//	@TestRails(id = "7645")
//	@Test(priority = 15) // 텍스트 선택
//	public void StepProgressBar_stepname2_text() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
// 
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-skfhhz"))); 
//		  driver.findElement(By.cssSelector(".css-skfhhz")).click();
//				  
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".PDFSetupBusinessPage__virtual-layer")));
//		  driver.findElement(By.cssSelector(".PDFSetupBusinessPage__virtual-layer")).
//		  click();
//				 
//	}
//	
//	@TestRails(id = "7646")
//	@Test(priority = 16) // 체크박스
//	public void StepProgressBar_stepname2_checkbox() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
// 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".FieldLocator:nth-child(3) .css-skfhhz")));
//		driver.findElement(By.cssSelector(".FieldLocator:nth-child(3) .css-skfhhz")).click();
//		  
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".PDFSetupBusinessPage__virtual-layer")));
//		driver.findElement(By.cssSelector(".PDFSetupBusinessPage__virtual-layer")).click();
//				 
//	}
//	
//	@TestRails(id = "7650")
//	@Test(priority = 17) // [다음 단계로] 버튼 입력 후 [계속 진행] 버튼 입력 
//	public void StepProgressBar_stepname2_next_btn() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
// 
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='다음 단계로']")));
//		driver.findElement(By.xpath("//button[@aria-label='다음 단계로']")).click();
//
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1r6iwme")));
//		driver.findElement(By.cssSelector(".css-1r6iwme")).click();
//						 
//	}
//	
//	
//	@TestRails(id = "7647")
//	@Test(priority = 18) // 기타설정 화면 > 문서 이름 수정 버튼 입력 
//	public void StepProgressBar_stepname3_nameeidt_btn() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
// 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,' 문서 이름 수정')]")));
//		driver.findElement(By.xpath("//button[contains(.,' 문서 이름 수정')]")).click();
//		  
//	}
//	
//	@TestRails(id = "7648")
//	@Test(priority = 19) // 기타설정 화면 > 문서 이름 수정 텍스트 입력 
//	public void StepProgressBar_stepname3_nameeidt_input() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
// 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".LimitedTextarea__textarea")));
//		driver.findElement(By.cssSelector(".LimitedTextarea__textarea")).click();
//		
//	    driver.findElement(By.cssSelector(".LimitedTextarea__textarea")).sendKeys("TEST");
//						 
//	}
//	
//	@TestRails(id = "7649")
//	@Test(priority = 20) // 기타설정 화면 > 문서 이름 수정 완료 버튼
//	public void StepProgressBar_stepname3_nameedidt_done() throws InterruptedException { 
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//						 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'수정 완료')]")));
//		driver.findElement(By.xpath("//button[contains(.,'수정 완료')]")).click();
//		
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
//				  ".Btn--primary")));
//				  driver.findElement(By.cssSelector(".Btn--primary")).click();
//				  
//				  // 동의 1 
//				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
//			  "agreement-check1"))); driver.findElement(By.id("agreement-check1")).click();
//			  Thread.sleep(1000);
//			  
//			  
//			  // 동의 2 
//			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
//			  "agreement-check2"))); driver.findElement(By.id("agreement-check2")).click();
//			  Thread.sleep(1000);
//			  
//			  
//			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1r6iwme"))); 
//			  driver.findElement(By.cssSelector(".css-1r6iwme")).click();
//	
//			  
//			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-tb-test-id='basic-modal-cancel-button']"))).click();
//
//			  
//
//				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'취소')]")));
//				//driver.findElement(By.xpath("//button[contains(.,'취소')]")).click();
//		
//
//	}
//	
//
//}
