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

	// 미리보기 첫번째 항목
	@FindBy(xpath = ("(//button[@type='button'][contains(text(),'미리보기')])[1]"))
	WebElement Preview_btn;

	public void Preview_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Preview_btn)).click();

	}

	// 테스트 전송 화면
	// 테스트 전송 화면 테스트 전송하기 버튼
	@FindBy(xpath = ("//button[contains(text(),'테스트 전송하기')]"))
	WebElement TestSend_btn;

	public void TestSend_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(TestSend_btn)).click();
	}

	// 테스트 전송하기 이메일/전화번호
	@FindBy(xpath = ("//input[@placeholder='이메일 또는 휴대폰 번호']"))
	WebElement TestSend_EmailandPhoneNumber_input;

	public void TestSend_EmailandPhoneNumber_input_m() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(TestSend_EmailandPhoneNumber_input)).click();
		Wait.until(ExpectedConditions.visibilityOf(TestSend_EmailandPhoneNumber_input)).sendKeys("joshin1@getnada.com");

	}

	// 테스트 전송하기 모달 btn
	@FindBy(css = (".css-1r6iwme"))
	WebElement Modal_TestSend_btn;

	public void Modal_TestSend_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Modal_TestSend_btn)).click();

	}

	// 테스트 전송하기 완료 모달 확인
	@FindBy(xpath = ("//strong[contains(text(),'테스트 전송 성공')]"))
	WebElement Modal_TestSend_Check;

	public void Modal_TestSend_Check() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Modal_TestSend_Check)).click();

	}

	// 테스트 전송하기 완료 모달 확인 버튼
	@FindBy(xpath = ("//button[contains(text(),'확인')]"))
	WebElement Modal_TestSend_Modal_btn;

	public void Modal_TestSend_Modal_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Modal_TestSend_Modal_btn)).click();

	}
	
	
	// 테스트 전송 페이지 나가기 버튼 
	@FindBy(xpath = ("(//button[contains(text(),'나가기')])[1]"))
	WebElement Modal_TestSend_PageOut_btn;

	public void Modal_TestSend_PageOut_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Modal_TestSend_PageOut_btn)).click();

	}
	
	
	// 일단 여기도 나가자 
	@FindBy(xpath = ("(//button[@class='BulkRequestHeader__left-btn'])[1]"))
	WebElement SendPage_Out_btn;

	public void SendPage_Out_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SendPage_Out_btn)).click();

	}
	

	
	
	
	
	

	// 폴더 목록 선택
	@FindBy(css = ("button[class='FolderSelectBoxButton__select-btn']"))
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
	@FindBy(xpath = ("(//input[@type='checkbox'])[1]"))
	WebElement Checkbox_1_btn;

	@FindBy(xpath = ("(//input[@type='checkbox'])[2]"))
	WebElement Checkbox_2_btn;

	public void Checkbox_checkbox_m() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Checkbox_1_btn)).click();
		Wait.until(ExpectedConditions.visibilityOf(Checkbox_2_btn)).click();
	}

	// 대량 전송 시작하기 확인 버튼.
	@FindBy(xpath = ("//button[contains(text(),'확인 및 전송 시작')]"))
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

	// 대량전송 완료상태 체크
	@FindBy(xpath = ("//p[@class='BulkRequestStatusBar__status BulkRequestStatusBar__status--done css-konzta']"))
	WebElement BulkRequest_StatusDone_Check;

	public void BulkRequest_StatusDone_Check() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(BulkRequest_StatusDone_Check)).isDisplayed();
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

		Thread.sleep(3000);

		// BulkRequest_DoneModal_confirm_btn();

	}

}
