package POM_00_BasePage;

import static org.testng.Assert.assertEquals;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class LoginPage extends BasePage  {

	public LoginPage (WebDriver driver) {
        super(driver);
    }

	@FindBy(name = ("email"))
	WebElement Email;

	@FindBy(name = ("password"))
	WebElement Password;

	@FindBy(xpath = ("//button[contains(text(),'로그인')]"))
	WebElement Loginbutton;

	@FindBy(css = ("div[class='css-19p29i2'] span[class='css-1kr9snj']"))
	WebElement MainPageOK;


	public void EntermyEmail(String arg1) {
		// driver.findElement(Email).sendKeys(arg1);
		Email.sendKeys(arg1);
	}

	public void EntermyPasswrod(String arg2) {
		Password.sendKeys(arg2);
		
	}

	public void LoginbuttonClick() {
		//Loginbutton.click();
		 Wait.until(ExpectedConditions.visibilityOf(Loginbutton)).click();
	
	}
	

	
	// 이메일 입력 > 패스워드 입력 > 로그인 버튼 입력
	public void Login_m(String arg1, String arg2) throws InterruptedException {
		EntermyEmail(arg1);
		EntermyPasswrod(arg2);
		Loginbutton.click();

		String getheadertext = MainPageOK.getText().trim();
		Assert.assertEquals("문서함", getheadertext);

	}
}