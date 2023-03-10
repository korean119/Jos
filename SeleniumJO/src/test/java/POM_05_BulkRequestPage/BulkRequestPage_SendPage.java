package POM_05_BulkRequestPage;

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

public class BulkRequestPage_SendPage extends BasePage {

	public BulkRequestPage_SendPage(WebDriver driver) {
		super(driver);

	}
	

	// 폴더 목록 선택
	@FindBy(css= ("button[class='FolderSelectBoxButton__select-btn']"))
	WebElement FolderList_btn;
	
	public void FolderList_btn() throws InterruptedException { 
		Wait.until(ExpectedConditions.visibilityOf(FolderList_btn)).click();
	
	}
	
	// 폴더 목록 첫 번째 선택
	@FindBy(css = ("li:nth-child(1) button:nth-child(1)"))
	WebElement FolderList_1_Select;
	
	public void FolderList_1_Select() throws InterruptedException { 
		Wait.until(ExpectedConditions.visibilityOf(FolderList_1_Select)).click();
	
	}
	
	// 전송 시작 버튼 
	@FindBy(xpath = ("//button[contains(text(),'전송 시작')]"))
	WebElement BulkRequestStatusChange_btn;
	
	public void BulkRequestStatusChange_btn() throws InterruptedException { 
		Wait.until(ExpectedConditions.visibilityOf(BulkRequestStatusChange_btn)).click();
	
	}
	
	// 전송 시작 모달 
	@FindBy(css = ("li:nth-child(1) .css-13e0nsf"))
	WebElement Checkbox_1_btn;
	
	@FindBy(css = ("li:nth-child(2) .css-13e0nsf"))
	WebElement Checkbox_2_btn;

	@FindBy(css = ("li:nth-child(3) .css-13e0nsf"))
	WebElement Checkbox_3_btn;

	@FindBy(css = ("li:nth-child(4) .css-13e0nsf"))
	WebElement Checkbox_4_btn;

	public void Checkbox_checkbox_m() throws InterruptedException { 
		Wait.until(ExpectedConditions.visibilityOf(Checkbox_1_btn)).click();
		Wait.until(ExpectedConditions.visibilityOf(Checkbox_2_btn)).click();
		Wait.until(ExpectedConditions.visibilityOf(Checkbox_3_btn)).click();
		Wait.until(ExpectedConditions.visibilityOf(Checkbox_4_btn)).click();

	}
	
	// 대량 전송 시작하기 확인 버튼.
	@FindBy(css = (".css-w49cdq"))
	WebElement BulkRequest_StatusChange_confirm_btn;
	
	public void BulkRequest_StatusChange_confirm_btn() throws InterruptedException { 
		Wait.until(ExpectedConditions.visibilityOf(BulkRequest_StatusChange_confirm_btn)).click();
	}
	

	
	// 대량전송 시작 되었습니다 모달 컨펌 버튼.
	@FindBy(css = ("button[class='Btn Btn--bold Btn--primary']"))
	WebElement BulkRequest_StartModal_confirm_btn;
	
	public void BulkRequest_Start_confirm_btn() throws InterruptedException { 
		Wait.until(ExpectedConditions.visibilityOf(BulkRequest_StartModal_confirm_btn)).click();
	}
	
	// 대량전송 완료 되었습니다 모달 컨펌 버튼.
	@FindBy(css = (".css-1r6iwme"))
	WebElement BulkRequest_DoneModal_confirm_btn;
	
	public void BulkRequest_DoneModal_confirm_btn() throws InterruptedException { 
		Wait.until(ExpectedConditions.visibilityOf(BulkRequest_DoneModal_confirm_btn)).click();
	}
	
	
///////////////////////////////////////////////////////////////////////////////
	

	public void BulkRequest_Send_m() throws InterruptedException { 
		FolderList_btn();
		FolderList_1_Select();
		
		// 동적 버튼이라 바로 찾지 말고 상태가 변경 되면 입력 되어야 해서 그냥 시간을 둠 
		Thread.sleep(1000);
		BulkRequestStatusChange_btn();
		
		Checkbox_checkbox_m();		
		BulkRequest_StatusChange_confirm_btn();
		
		
		BulkRequest_Start_confirm_btn();
		
		BulkRequest_DoneModal_confirm_btn();
		
	}

	
}
