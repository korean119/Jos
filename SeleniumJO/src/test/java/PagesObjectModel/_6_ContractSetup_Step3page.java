package PagesObjectModel;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _6_ContractSetup_Step3page extends _0_BasePage  {

	public _6_ContractSetup_Step3page (WebDriver driver) {
        super(driver);
    }

	@FindBy(xpath = ("//button[contains(.,'문서 이름 수정')]"))
	WebElement DocumentModification_filename_edit_btn;
	// @FindBy(css = (".Btn--light"))
	// WebElement LimitedTextareaselect_btn;

	@FindBy(css = ("textarea[placeholder='1자 이상 100자 이내']"))
	WebElement DocumentModification_filename_textarea_Select;
	// 이게 갑자기 없어졌다?? 2월 26일
	// @FindBy(css = (".LimitedTextarea__textarea"))
	// WebElement LimitedTextarea;

	@FindBy(xpath = ("//button[contains(.,'수정 완료')]"))
	WebElement DocumentModification_filename_editdone_btn;

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


	public void DocumentModification__filename_edit_btn() {
		// driver.findElement(Email).sendKeys(arg1);
		DocumentModification_filename_edit_btn.click();
	}

	public void DocumentModification__filename_Textarea_Select() {
		DocumentModification_filename_textarea_Select.click();

	}

	public void DocumentModification__filename_Textarea_Clearandinput(String arg1) {
		DocumentModification_filename_textarea_Select.clear();
		DocumentModification_filename_textarea_Select.sendKeys(arg1);

	}

	public void DocumentModification_filename_editdone() {
		DocumentModification_filename_editdone_btn.click();

	}

	public void Settingdone_btn() {
		Settingdone_Btn.click();

	}

	public void Agreementcheck1_checkbox() {
		Agreementcheck1_checkbox.click();

	}

	public void Agreementcheck2_checkbox() {
		Agreementcheck2_checkbox.click();

	}

	public void Requestsignature_btn() {
		Requestsignature_btn.click();
	
	}
	
	public void ContractSetup_Step3page_Setup_Quick(String arg1) throws InterruptedException {
		DocumentModification_filename_edit_btn.click();
		DocumentModification_filename_textarea_Select.click();
		DocumentModification_filename_textarea_Select.clear();
		DocumentModification_filename_textarea_Select.sendKeys(arg1);
		DocumentModification_filename_editdone_btn.click();
		Settingdone_Btn.click();
		Agreementcheck1_checkbox.click();
		Agreementcheck2_checkbox.click();
		Requestsignature_btn.click();
		
		Thread.sleep(3000);
	}

}
