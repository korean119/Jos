package PagesObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TempletePage_CreatTemplete extends _0_BasePage {

	public TempletePage_CreatTemplete(WebDriver driver) {
		super(driver);

	}

	////////////////////// 템플릿 1. 서명자 설정 화면 /////////////////////

	// 첫번째 서명자
	@FindBy(xpath = ("//input[@placeholder='역할']"))
	WebElement Signatory_1_role_btn;

	@FindBy(xpath = ("//button[contains(text(),'다음 단계로 >')]"))
	WebElement Next_btn;

	///////////////////////////////////////////////////

	////////////////////// 템플릿 2. 입력 설정 화면 /////////////////////

	@FindBy(css = (".css-w07yg0 .css-1dgk6ra"))
	WebElement SignatureField_1_btn;

	@FindBy(css = (".css-skfhhz"))
	WebElement TextField_1_btn;

	@FindBy(css = (".css-w07yg0 .FieldLocator:nth-child(3) > .css-skfhhz"))
	WebElement CheckboxField_1_btn;

	@FindBy(css = (".css-w07yg0 .AddAttachFileRequestButton__button-container"))
	WebElement AddAttachFileRequest_1_btn;

	// PDF 클릭 = pdf에 항목들이 올라감
	@FindBy(css = (".PDFTemplateBusinessPage__virtual-layer"))
	WebElement PDFSreen_go_Btn;

	@FindBy(xpath = ("//button[contains(text(),'다음 단계로 >')]"))
	WebElement Next_Btn;

	///////////////////////////////////////////////////

	////////////////////// 템플릿 3. 기타 설정 화면 /////////////////////

	@FindBy(xpath = ("//input[@id='templateName']"))
	WebElement TemplateName_btn;

	@FindBy(xpath = ("//button[contains(text(),'템플릿 저장 >')]"))
	WebElement TemplatSave_btn;

	///////////////////////////////////////////////////////////////////////////

	public void Signatory_1_role_btn_m() throws InterruptedException {
		Signatory_1_role_btn.click();
		Signatory_1_role_btn.sendKeys("자동화 서명자1");
	}

	public void TemplateName_btn_m() throws InterruptedException {
		TemplateName_btn.click();
		TemplateName_btn.clear();
		TemplateName_btn.sendKeys("자동화 템플릿 생성");
	}

	public void NomarlAccount_BulkRequest_Off_Case() throws InterruptedException {
		Signatory_1_role_btn_m();
		Next_btn.click();

		SignatureField_1_btn.click();
		PDFSreen_go_Btn.click();
		TextField_1_btn.click();
		PDFSreen_go_Btn.click();
		CheckboxField_1_btn.click();
		PDFSreen_go_Btn.click();
		Next_Btn.click();

		TemplateName_btn_m();
		TemplatSave_btn.click();
		
		Thread.sleep(2000);
	}
}