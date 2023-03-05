package POM_00_ContractPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import POM_00_BasePage.BasePage;

public class ContractSetup_Step1page extends BasePage {

	public ContractSetup_Step1page(WebDriver driver) {
		super(driver);
	}

	////////////////////// 서명자 1 /////////////////////
	// 첫번째 서명자 이메일,카카오톡,전화번호 초기화
	@FindBy(xpath = ("//input[@placeholder='이메일 주소']"))
	WebElement Signatory_1_email_input;

	// 첫번째 서명자 이메일/카카오톡
	@FindBy(xpath = ("//button[@aria-label='clear']"))
	WebElement Signatory_1_email_del_btn;

	///////////////////////////////////////////////////

	////////////////////// 서명자 2 /////////////////////
	// 두번째 서명자 이름
	//@FindBy(css = (".css-8tn0p7:nth-child(4) .css-9ky0ym"))  ----> 이걸로 왜 안 잡힐때가 있지?
	@FindBy(css = (".css-1baxk43"))
	WebElement Signatory_2_name_btn;

	// 두번째 서명자 이메일 선택
	@FindBy(css = (".css-p0j5as > .css-wi6c9a"))
	WebElement Signatory_2_email_btn;

	// 두번째 서명자 이메일 입력
	//@FindBy(css = (".css-8tn0p7:nth-child(4) .css-9r9pmj")) ----> 이걸로 왜 안 잡힐때가 있지?
	@FindBy(xpath = ("(//input[@placeholder='이메일 주소'])[2]"))
	WebElement Signatory_2_emailtextfelid_input;

	// 서명자 삭제
	@FindBy(css = (".css-8tn0p7:nth-child(4) .css-54ez61"))
	WebElement Signatory_2_del_btn;

	// 서명자 삭제 컨펍 확인
	@FindBy(css = (".css-syd1y3"))
	WebElement Signatory_2_confirm_del_btn;

	///////////////////////////////////////////////////

	// 다음단계로 버튼
	@FindBy(css = ("button[aria-label='다음 단계로']"))
	WebElement Next_btn;

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	public void Signatory1_email_input_clearandinput(String arg1) throws InterruptedException {
		Signatory_1_email_input.sendKeys(arg1);

	}

	// POM initElements() 도 피하는 항목... 동적 버튼 이라 DOM에서 사라지는걸 의미하는게 아닌가 싶음
	// https://www.softwaretestingmaterial.com/stale-element-reference-exception-selenium-webdriver/
	//public void Signgatory1_email_del() {
	//	Wait.until(ExpectedConditions.visibilityOf(Signatory_1_email_del_btn)).click();

	//}

	public void Signatory_2_name_input(String arg1) throws InterruptedException {
		Signatory_2_name_btn.click();
		Signatory_2_name_btn.sendKeys(arg1);

	}

	public void Signatory_2_email_btn() {
		Signatory_2_email_btn.click();

	}

	public void Signatory_2_email_input(String arg1) throws InterruptedException {
		Signatory_2_emailtextfelid_input.click();
		Signatory_2_emailtextfelid_input.sendKeys(arg1);

	}


	public void ContractSetup_Step1page_Setup() throws InterruptedException {
		Signatory_2_del_btn.click();
		Signatory_2_confirm_del_btn.click();
		Next_btn.click();

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	public void ContractSetup_Step1page_Setup_Quick(String arg1, String arg2, String arg3) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Signatory_1_email_del_btn)).click();
		Signatory_1_email_input.sendKeys(arg1);
		Signatory_2_name_btn.sendKeys(arg2);
		Signatory_2_email_btn.click();
		Signatory_2_emailtextfelid_input.sendKeys(arg3);
		Next_btn.click();
	}

	public void NomarlAccount_NormalSign_OnandOff_Case(String arg1, String arg2, String arg3) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Signatory_1_email_del_btn)).click();
		Signatory_1_email_input.sendKeys(arg1);
		
		Signatory_2_name_btn.sendKeys(arg2);
		Signatory_2_email_btn.click();
		Signatory_2_email_input(arg3);
		Next_btn.click();

	}
	


}
