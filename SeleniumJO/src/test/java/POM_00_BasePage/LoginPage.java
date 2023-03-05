package POM_00_BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;



public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = ("email"))
	WebElement Email;

	@FindBy(css = (".css-1tfdvyr"))
	WebElement Email_Validation;

	@FindBy(name = ("password"))
	WebElement Password;

	@FindBy(css = ("div[class='css-1xi4blx'] p[class='css-1tfdvyr']"))
	WebElement Password_Validation;

	@FindBy(xpath = ("//button[contains(text(),'로그인')]"))
	WebElement Loginbutton;

	@FindBy(css = (".Btn.Btn--primary.Btn--bold-mobile"))
	WebElement NotFindUser_ModalOk_btn;

	// assert 실험용
	@FindBy(css = ("div[class='css-19p29i2'] span[class='css-1kr9snj']"))
	WebElement MainPageOK;

/////////////////////////////////////////////////////////////////////////////////

	public void Email_input(String arg1) {
		Email.clear();
		Email.sendKeys(arg1);
	}

	public String Email_Validation() {
		return Email_Validation.getText();
	}

	/*
	 * public void Email_Validation(String arg1) { String gettext =
	 * Email_Validation.getText(); System.out.printf(gettext, arg1);
	 * Assert.assertEquals(arg1, gettext);
	 * 
	 * }
	 */

	public void Password(String arg2) {
		Password.clear();
		Password.sendKeys(arg2);

	}

	public String Password_Validation() {
		return Password_Validation.getText();
		
	}

	

	public void Loginbutton() {
		// Loginbutton.click();
		Wait.until(ExpectedConditions.visibilityOf(Loginbutton)).click();

	}

	public void NotFindUser_ModalOk_btn() {
		// Loginbutton.click();
		NotFindUser_ModalOk_btn.click();

	}

	// 대표 시나리오 작성
	// 이메일 입력 > 패스워드 입력 > 로그인 버튼 입력
	public void Login(String arg1, String arg2) throws InterruptedException {
		Email.sendKeys(arg1);
		Password.sendKeys(arg2);
		Loginbutton.click();

		String getheadertext = MainPageOK.getText().trim();
		Assert.assertEquals("문서함", getheadertext);

	}
}