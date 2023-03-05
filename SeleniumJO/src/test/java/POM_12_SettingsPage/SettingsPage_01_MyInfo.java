package POM_12_SettingsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import POM_00_BasePage.BasePage;

public class SettingsPage_01_MyInfo extends BasePage {

	public SettingsPage_01_MyInfo(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = ("//button[contains(text(),'비밀번호 변경하기')]"))
	WebElement PasswordChange_btn;

	@FindBy(css = ("#curPassword"))
	WebElement curPassword_btn;

	@FindBy(css = ("#newPassword"))
	WebElement newPassword_btn;

	@FindBy(css = ("#rePassword"))
	WebElement rePassword_btn;
	
	@FindBy(css = ("button[type='submit']"))
	WebElement PasswordChange_submit_btn;
	
////////////////////////////////////////////////////////////////////////////////

	public void PasswordChange_btn() throws InterruptedException {
		PasswordChange_btn.click();
	}

	
	public void curPassword_btn(String arg1) throws InterruptedException {
		curPassword_btn.clear();
		curPassword_btn.sendKeys(arg1);
	}
	
	public void newPassword_btn(String arg1) throws InterruptedException {
		newPassword_btn.clear();
		newPassword_btn.sendKeys(arg1);
	}

	public void rePassword_btn(String arg1) throws InterruptedException {
		rePassword_btn.clear();
		rePassword_btn.sendKeys(arg1);

	}

	
	public void PasswordChange_m(String arg1, String arg2, String arg3 ) throws InterruptedException {
		PasswordChange_btn();
		curPassword_btn(arg1);
		newPassword_btn(arg2);
		rePassword_btn(arg3);
		PasswordChange_submit_btn.click();

	}
	
}
