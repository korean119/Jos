package PagesObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SingInPage {
	 protected WebDriver driver;
	 
	 @FindBy(name = ("email"))
	 WebElement Email;

	 @FindBy(name = ("password"))
	 WebElement Password;

	 @FindBy(css = (".css-1r6iwme"))
	 WebElement Loginbutton;

	 public SingInPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 
	 }
	 
	 public void entermyEmail(String arg1) {
		 //driver.findElement(Email).sendKeys(arg1);
		 Email.sendKeys(arg1);
	 }
	 
	 public void entermyPasswrod(String arg2) {
		 //driver.findElement(Password).sendKeys(arg2);
		 Password.sendKeys(arg2);
		 
	 }
	 
	 public void loginbutton() {
		 Loginbutton.click();
		 
	 }

	 // 대표 시나리오 작성 
	 
	 // 이메일 입력 > 패스워드 입력 > 로그인 버튼 입력 
	 public void login(String arg1, String arg2) {
		 //driver.findElement(Email).sendKeys(arg1);
		 //driver.findElement(Password).sendKeys(arg2);
		 
		 Email.sendKeys(arg1);
		 Password.sendKeys(arg2);
		 Loginbutton.click();

		 
	 }
}