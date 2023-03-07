package POM_00_ContractPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import POM_00_BasePage.BasePage;

public class ContractSetup_Step3page extends BasePage {

	public ContractSetup_Step3page(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = (".fa-pen-to-square")) // 요
	WebElement DocumentModification_filename_edit_btn;
	// @FindBy(css = (".Btn--light"))
	// WebElement LimitedTextareaselect_btn;

	// @FindBy(css = ("textarea[placeholder='1자 이상 100자 이내']"))
	@FindBy(xpath = ("//textarea[@placeholder='1자 이상 100자 이내']")) // 요 
	WebElement DocumentModification_filename_textarea_Select;
	// 이게 갑자기 없어졌다?? 2월 26일
	// @FindBy(css = (".LimitedTextarea__textarea"))
	// WebElement LimitedTextarea;

	@FindBy(xpath = ("//button[contains(text(),'적용')]")) // 요 
	WebElement DocumentModification_filename_editdone_btn;

	// 서명 유효기간 
	@FindBy(css = (".DocumentModification__expiration-date-title"))
	WebElement DocumentModification_expiration_date_title_btn;
	
	@FindBy(css = (".CheckBox__custom-checkbox"))
	WebElement Encryption_CheckBox_btn;

	@FindBy(xpath = ("//input[@placeholder='8자 ~ 32자 이내 영문, 숫자, 특수문자']"))
	WebElement Encryption_Input;
	
	///////////////////// 첨부파일  /////////////////////
	
	///////////////////////////////////////////////////	
	

	////////////////////// 참조자 cc /////////////////////

	@FindBy(xpath = ("//button[@class='css-1mmu0eb']")) // 
	WebElement cc_btn;

	@FindBy(xpath = ("//div[@class='css-o537dh']//input[@placeholder='이메일 또는 휴대폰 번호']"))
	WebElement cc_input;

	@FindBy(css = (".css-1r6iwme"))
	WebElement ccOK_btn;

	///////////////////////////////////////////////////

	////////////////////// 남길 말 입력 /////////////////////

	@FindBy(xpath = ("//button[contains(text(),'남길 말 입력')]"))
	WebElement LeaveMessage_btn;

	@FindBy(css = (".css-16rnad"))
	WebElement LeaveMessage_input;

	///////////////////////////////////////////////////

	////////////////////// 서명자인증 수단 추가 /////////////////////

	// 서명자1 인증 수단 추가 버튼
	@FindBy(css = (".css-dsdku4"))
	WebElement AuthenticationSelection_1_;

	@FindBy(css = (".Card:nth-child(2) .css-dsdku4"))
	WebElement AuthenticationSelection_2_;

	// 인증수단 패스워드 선택
	@FindBy(css = (".css-1x5icao > .css-1pv319a"))
	WebElement AuthenticationSelection_Password_btn;

	@FindBy(xpath = ("//input[@id='ViewablePasswordInput__password']"))
	WebElement View_Password_input;

	@FindBy(xpath = ("//input[@id='ViewablePasswordInput__password-hint']"))
	WebElement View_Password_hint_input;

	@FindBy(xpath = ("//button[contains(text(),'설정하기')]"))
	WebElement View_Password_Ok_btn;

	///////////////////////////////////////////////////

	////////////////////// 완료 문서 잠금 설정 모달 /////////////////////

	@FindBy(xpath = ("//input[@id='file-open-password-modal-PDF_PASSWORD_IS_SET']"))
	WebElement modal_PDF_PASSWORD_IS_SET_checkbox;

	@FindBy(xpath = ("//input[@id='file-open-password-modal-NEED_TO_MEMO']"))
	WebElement modal_NEED_TO_MEMO_checkbox;

	@FindBy(xpath = ("//input[@id='file-open-password-modal-CANNOT_EXPORT_INPUT_VALUES']"))
	WebElement modal_CANNOT_EXPORT_INPUT_VALUES_checkbox;

	@FindBy(xpath = ("//button[contains(text(),'확인')]"))
	WebElement ContentReactModalOk_btn;

	@FindBy(css = (".Btn--primary"))
	WebElement Settingdone_Btn;

	@FindBy(id = ("agreement-check1"))
	WebElement Agreementcheck1_checkbox;
	
	@FindBy(id = ("agreement-check2"))
	WebElement Agreementcheck2_checkbox;

	// 서명 요청하기
	@FindBy(xpath = ("//button[contains(text(),'서명 요청하기')]"))
	WebElement Requestsignature_btn;

	@FindBy(xpath = (".Btn:nth-child(3)"))
	WebElement done2;

	//////////////////////// Assert //////////////////////

	@FindBy(xpath = ("(//div[@class='css-68xf6m'][contains(text(),'BaseScript_1 생성')])[1]"))
	WebElement Assert;

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	public void DocumentModification_filename_Textarea_Clearandinput(String arg1) {
		DocumentModification_filename_textarea_Select.clear();
		DocumentModification_filename_textarea_Select.sendKeys(arg1);

	}

	public void Encryption_input(String arg1) {
		Encryption_Input.click();
		Encryption_Input.sendKeys(arg1);

	}

	public void cc_input(String arg1) {
		cc_input.click();
		cc_input.sendKeys(arg1);

	}

	public void LeaveMessage_input(String arg1) {
		LeaveMessage_input.click();
		LeaveMessage_input.sendKeys(arg1);
	}

	public void View_Password_input(String arg1) {
		View_Password_input.click();
		View_Password_input.sendKeys(arg1);
	}

	public void View_Password_hint_input(String arg1) {
		View_Password_hint_input.click();
		View_Password_hint_input.sendKeys(arg1);
	}

	public void modal_checkbox() {
		modal_PDF_PASSWORD_IS_SET_checkbox.click();
		modal_NEED_TO_MEMO_checkbox.click();
		modal_CANNOT_EXPORT_INPUT_VALUES_checkbox.click();
		ContentReactModalOk_btn.click();

	}

// OnCase 전용
	public void ContractDone() {
		// Settingdone_Btn.click();
		Agreementcheck1_checkbox.click();
		Agreementcheck2_checkbox.click();
		Requestsignature_btn.click();

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	public void ContractSetup_Step3page_Setup_Quick(String arg1) throws InterruptedException {
		DocumentModification_filename_edit_btn.click();

		DocumentModification_filename_Textarea_Clearandinput(arg1);

		DocumentModification_filename_editdone_btn.click();
		Settingdone_Btn.click();
		Agreementcheck1_checkbox.click();
		Agreementcheck2_checkbox.click();
		Requestsignature_btn.click();

		Thread.sleep(3000);
	}

	public void NomarlAccount_NormalSign_Off_Case() throws InterruptedException {
		Settingdone_Btn.click();
		Agreementcheck1_checkbox.click();
		Agreementcheck2_checkbox.click();
		Requestsignature_btn.click();

		Thread.sleep(3000);
	}

	public void NomarlAccount_NormalSign_On_Case(String arg1, String arg2, String arg3, String arg4, String arg5)
			throws InterruptedException {
		DocumentModification_filename_edit_btn.click();
		DocumentModification_filename_Textarea_Clearandinput(arg1);
		DocumentModification_filename_editdone_btn.click();

		Encryption_CheckBox_btn.click();
		Encryption_input(arg2);

		cc_btn.click();
		cc_input(arg3);
		ccOK_btn.click();

		LeaveMessage_btn.click();
		LeaveMessage_input(arg4);

		AuthenticationSelection_1_.click();
		AuthenticationSelection_Password_btn.click();
		View_Password_input("1234");
		View_Password_hint_input("1234");
		View_Password_Ok_btn.click();

		AuthenticationSelection_2_.click();
		AuthenticationSelection_Password_btn.click();
		View_Password_input("1234");
		View_Password_hint_input("1234");
		View_Password_Ok_btn.click();

		Settingdone_Btn.click();

		modal_checkbox();
		ContractDone();

		Thread.sleep(3000);
	}
}
