package POM_03_TempletePge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import POM_00_BasePage.BasePage;

public class TempletePage_CreateTempleteStep2Page extends BasePage {

	public TempletePage_CreateTempleteStep2Page(WebDriver driver) {
		super(driver);

	}

	// 2. 입력 설정 화면
	// +텍스트 입력하기.
	
	
	// .체크박스 입력하기.
	
	// +이미지 입력하기.
	
	
	// 첫 번째 서명자 사인/도장.
	@FindBy(css = (".css-w07yg0 .css-1dgk6ra"))
	WebElement SignatureField_1_btn;
	
	public void SignatureField_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SignatureField_1_btn)).click();

	}
	
	// 첫 번째 서명자 텍스트 필드.
	@FindBy(css = (".css-skfhhz"))
	WebElement TextField_1_btn;
	
	public void TextField_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(TextField_1_btn)).click();

	}
	
	// 첫 번째 서명자 체크박스 선택.
	@FindBy(css = (".css-w07yg0 .FieldLocator:nth-child(3) > .css-skfhhz"))
	WebElement CheckboxField_1_btn;
	
	public void CheckboxField_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(CheckboxField_1_btn)).click();

	}
	

	// 첨부파일 요청 
	@FindBy(css = (".css-w07yg0 .AddAttachFileRequestButton__button-container"))
	WebElement AddAttachFileRequest_1_btn;

	public void AddAttachFileRequest_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(AddAttachFileRequest_1_btn)).click();

	}
	
	// PDF 클릭 = pdf에 항목들이 올라감
	@FindBy(css = (".PDFTemplateBusinessPage__virtual-layer"))
	WebElement PDFSreen_go_Btn;
	
	public void PDFSreen_go_Btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(PDFSreen_go_Btn)).click();

	}
	

	@FindBy(xpath = ("//button[contains(text(),'다음 단계로 >')]"))
	WebElement Next_Btn;
	
	public void Next_Btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Next_Btn)).click();

	}
	
//////////////////////////////////////////////////////////////////////////

	public void Templete_Request_Step2Page_Off_Case() throws InterruptedException {

		SignatureField_1_btn.click();
		PDFSreen_go_Btn.click();
		TextField_1_btn.click();
		PDFSreen_go_Btn.click();
		CheckboxField_1_btn.click();
		PDFSreen_go_Btn.click();
		Next_Btn.click();

	}
}
