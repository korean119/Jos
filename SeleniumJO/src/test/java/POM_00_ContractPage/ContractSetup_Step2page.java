package POM_00_ContractPage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM_00_BasePage.BasePage;

public class ContractSetup_Step2page extends BasePage {

	public ContractSetup_Step2page(WebDriver driver) {
		super(driver);
	}



	// 추가 내용 입력하기 - 텍스트 
	@FindBy(xpath = ("//button[contains(text(),'+ 텍스트 입력하기')]"))
	WebElement Signature_Requester_Textinput_btn;
	
	

	@FindBy(xpath = ("(//textarea[@placeholder='추가할 내용을 입력하세요.'])[3]"))
	WebElement Signature_Requester_Textinput_input;

	public void Signature_Requester_Textinput_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Signature_Requester_Textinput_btn)).click();

	}

	@FindBy(xpath = ("//button[contains(text(),'+ 체크박스 입력하기')]"))
	WebElement Signature_Requester_Checkboxinput_btn;

	public void Signature_Requester_Checkboxinput_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Signature_Requester_Checkboxinput_btn)).click();
	}

	// 이미지 일단 안 만듬

	///////////////////////////////////////////////////

	////////////////////// 서명자 1 /////////////////////

	@FindBy(css = (".css-w07yg0 .css-1dgk6ra"))
	WebElement SignatureField_1_btn;
	
	public void SignatureField_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SignatureField_1_btn)).click();
	}

	@FindBy(css = (".css-skfhhz"))
	WebElement TextField_1_btn;
	
	public void TextField_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(TextField_1_btn)).click();
	}

	@FindBy(css = (".css-w07yg0 .FieldLocator:nth-child(3) > .css-skfhhz"))
	WebElement CheckboxField_1_btn;
	
	public void CheckboxField_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(CheckboxField_1_btn)).click();
	}

	@FindBy(css = (".css-w07yg0 .AddAttachFileRequestButton__button-container"))
	WebElement AddAttachFileRequest_1_btn;
	
	public void AddAttachFileRequest_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(AddAttachFileRequest_1_btn)).click();
	}

	// 서명자 2도 같이 씀
	@FindBy(xpath = ("//input[@id='AttachmentRequestCard-0-attachment-type']"))
	WebElement AddAttachFiletype_input;
	
	public void AddAttachFiletype_input() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(AddAttachFiletype_input)).click();
	}


	@FindBy(xpath = ("//button[contains(text(),'설정하기')]"))
	WebElement SetupOk_btn;
	
	
	public void SetupOk_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SetupOk_btn)).click();
	}


	////////////////////// 서명자 2 /////////////////////

	@FindBy(css = (".css-h6sr04 .css-1dgk6ra"))
	WebElement SignatureField_2_btn;
	
	public void SignatureField_2_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SignatureField_2_btn)).click();
	}


	@FindBy(css = (".css-h6sr04 .FieldLocator:nth-child(2) > .css-skfhhz"))
	WebElement TextField_2_btn;
	
	public void TextField_2_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(TextField_2_btn)).click();
	}


	@FindBy(css = (".css-h6sr04 .FieldLocator:nth-child(3) > .css-skfhhz"))
	WebElement CheckboxField_2_btn;
	
	public void CheckboxField_2_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(CheckboxField_2_btn)).click();
	}


	@FindBy(css = (".css-h6sr04 .AddAttachFileRequestButton__button-container"))
	WebElement AddAttachFileRequest_2_btn;

	public void AddAttachFileRequest_2_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(AddAttachFileRequest_2_btn)).click();
	}
	///////////////////////////////////////////////////

	// PDF 클릭 = pdf에 항목들이 올라감
	@FindBy(css = (".PDFSetupBusinessPage__virtual-layer"))
	WebElement PDFSreen_go_Btn;

	public void PDFSreen_go_Btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(PDFSreen_go_Btn)).click();
	}

	@FindBy(css = (".RequesterFieldBusinessPage__virtual-layer.css-1xi4blx"))
	WebElement PDFSreen_go_Btn2;

	public void PDFSreen_go_Btn2() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(PDFSreen_go_Btn2)).click();

	}
	

	@FindBy(css = (".Btn--primary"))
	WebElement Next_btn;
	
	public void Next_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Next_btn)).click();

	}

	// 서명 없는 팝업 컨펌
	@FindBy(css = (".css-1r6iwme"))
	WebElement yes_btn;
	
	public void yes_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(yes_btn)).click();

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	public void AddAttachFiletype_1_input_m(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(AddAttachFiletype_input)).click();
		Wait.until(ExpectedConditions.visibilityOf(AddAttachFiletype_input)).sendKeys(arg1);

	}

	public void ContractSetup_Step2page_Setup_BaseScript() throws InterruptedException {

		SignatureField_1_btn();
		PDFSreen_go_Btn();

		TextField_1_btn();
		PDFSreen_go_Btn();

		CheckboxField_1_btn();
		PDFSreen_go_Btn();

		SignatureField_2_btn();
		PDFSreen_go_Btn();

		TextField_2_btn();
		PDFSreen_go_Btn();

		CheckboxField_2_btn();
		PDFSreen_go_Btn();

		Next_btn();

	}

	public void NormalSign_Off_Case() throws InterruptedException {

		SignatureField_1_btn();
		PDFSreen_go_Btn();

		TextField_1_btn();
		PDFSreen_go_Btn();

		CheckboxField_1_btn();
		PDFSreen_go_Btn();

		SignatureField_2_btn();
		PDFSreen_go_Btn();

		TextField_2_btn();
		PDFSreen_go_Btn();

		CheckboxField_2_btn();
		PDFSreen_go_Btn();

		Next_btn();

	}

	public void NormalSign_On_Case(String arg1) throws InterruptedException {

		SignatureField_1_btn();
		PDFSreen_go_Btn();

		TextField_1_btn();
		PDFSreen_go_Btn();

		CheckboxField_1_btn();
		PDFSreen_go_Btn();

		// AddAttachFileRequest_1_btn.click();
		// AddAttachFiletype_1_input_m(arg1);
		// SetupOk_btn.click();

		SignatureField_2_btn();
		PDFSreen_go_Btn();

		TextField_2_btn();
		PDFSreen_go_Btn();

		CheckboxField_2_btn();
		PDFSreen_go_Btn();

		// AddAttachFileRequest_2_btn.click();
		// AddAttachFiletype_1_input_m(arg1);
		// SetupOk_btn.click();

		Next_btn();

	}

	
	// 소니 맞춤 자동화
	// 아마 스마트 필드에서 매크로와 같은 용도로 사용 하실 듯
	public void SonnyCase() throws InterruptedException {

		for (int i = 1; i < 101; i++) {

			Signature_Requester_Textinput_btn();
			
			// 샌드키로 바꾸고 좌표를 변수로 바꾸면 좌표별로 100개 찍힐 듯
			PDFSreen_go_Btn2();
		}

		for (int x = 1; x < 101; x++) {
			driver.findElement(By.xpath("(//textarea[@placeholder='추가할 내용을 입력하세요.'])[" + x + "]")).sendKeys("텍스트 입력");
		}
	}

	public void NormalSign_On_Case_Sonny2() throws InterruptedException {

		for (int i = 0; i < 100; i++) {

			Signature_Requester_Checkboxinput_btn();
			PDFSreen_go_Btn2();

		}

		// EnhancedToolTip 인거 같은디
		// new Actions(driver).moveToElement(element).moveByOffset(dx,
		// dy).click().perform();

	}
}
