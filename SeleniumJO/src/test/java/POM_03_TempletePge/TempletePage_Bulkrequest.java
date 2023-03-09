package POM_03_TempletePge;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import POM_00_BasePage.BasePage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TempletePage_Bulkrequest extends BasePage {

	public TempletePage_Bulkrequest(WebDriver driver) {
		super(driver);

	}
	////////////////////// 대량전송 엑셀 업로드 화면  /////////////////////
	
	// 이건 쓸일 없을 듯
	@FindBy(xpath = ("//button[contains(text(),'3. 엑셀 업로드하기')]"))
	WebElement BulkRequest_ExcelUpload_btn;
	
	///////////////////////////////////////////////////
	
	////////////////////// 대량전송 자동화 화면 /////////////////////
	
	// 폴더 목록 선택
	@FindBy(css= ("button[class='FolderSelectBoxButton__select-btn']"))
	WebElement FolderList_btn;
	
	// 폴더 목록 첫번째 선택
	@FindBy(css = ("li:nth-child(1) button:nth-child(1)"))
	WebElement FolderList_1_btn;
	
	// 전송 시작 
	@FindBy(xpath = ("//button[contains(text(),'전송 시작')]"))
	WebElement BulkRequestStatusChange_btn;
	
	///////////////////////////////////////////////////

	
	////////////////////// 전송 시작 체크박스 모달 /////////////////////

	@FindBy(css = ("li:nth-child(1) .css-13e0nsf"))
	WebElement Checkbox_1_btn;
	
	@FindBy(css = ("li:nth-child(2) .css-13e0nsf"))
	WebElement Checkbox_2_btn;
	
	@FindBy(css = ("li:nth-child(3) .css-13e0nsf"))
	WebElement Checkbox_3_btn;
	
	@FindBy(css = ("li:nth-child(4) .css-13e0nsf"))
	WebElement Checkbox_4_btn;
	
	@FindBy(css = (".css-w49cdq"))
	WebElement BulkRequestStatusChange_confirm_btn;
	
	///////////////////////////////////////////////////
	
	


	///////////////////////////////////////////////////////////////////////////
	
	public void BulkRequest_ExcelUpload_btn_m() throws InterruptedException { 
		WebElement filepath = driver.findElement(By.cssSelector("input[type='file']"));
		//filepath.sendKeys("C:\\SeleniumPractice/sheet.xlsx");
		filepath.sendKeys("/Users/johnny/Desktop/Selenium_img/BulkRequset/bulkrequest.previous.xlsx");

	
	}
	
	
	public void BulkRequestStatusChange_confirm_m() throws InterruptedException { 
		Checkbox_1_btn.click();
		Checkbox_2_btn.click();
		Checkbox_3_btn.click();
		Checkbox_4_btn.click();
		BulkRequestStatusChange_confirm_btn.click();

		
	}
	
	public void NomarlAccount_BulkRequest_Off_Case() throws InterruptedException { 
		BulkRequest_ExcelUpload_btn_m();
		Wait.until(ExpectedConditions.visibilityOf(FolderList_btn)).click();
		FolderList_1_btn.click();
		Thread.sleep(2000);
		BulkRequestStatusChange_btn.click();
		BulkRequestStatusChange_confirm_m();
		
	}

	
}
