package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestrailAPI.TestRails;

public class _2_modusign_temple extends _1_modusign {

	@TestRails(id = "7650")
	@Test(priority = 21) // 기타설정 화면 > 문서 이름 수정 완료 버튼
	public void StepProgressBar_step123123() throws InterruptedException { 
		WebDriverWait wait = new WebDriverWait(driver, 10);
						 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1kr9snj")));
				  driver.findElement(By.cssSelector(".css-1kr9snj")).click();
				  
			  
}
}

