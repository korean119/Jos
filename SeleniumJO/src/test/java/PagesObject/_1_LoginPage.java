package PagesObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _1_LoginPage {

	WebDriver driver;

	@FindBy(name = ("email"))
	WebElement Email;

	@FindBy(name = ("password"))
	WebElement Password;

	@FindBy(xpath = ("//button[contains(text(),'로그인')]"))
	WebElement Loginbutton;

	@FindBy(css = ("div[class='css-19p29i2'] span[class='css-1kr9snj']"))
	WebElement MainPageOK;

	public _1_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void EntermyEmail(String arg1) {
		// driver.findElement(Email).sendKeys(arg1);
		Email.sendKeys(arg1);
	}

	public void EntermyPasswrod(String arg2) {
		// driver.findElement(Password).sendKeys(arg2);
		Password.sendKeys(arg2);

	}

	public void LoginbuttonClick() {
		Loginbutton.click();

	}

	// 대표 시나리오 작성
	// 이메일 입력 > 패스워드 입력 > 로그인 버튼 입력
	public void Login(String arg1, String arg2) throws InterruptedException {
		Email.sendKeys(arg1);
		Password.sendKeys(arg2);
		Loginbutton.click();

		String getheadertext = MainPageOK.getText().trim();
		assertEquals("문서함", getheadertext);

	}
}