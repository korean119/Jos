package PagesObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class _0_HomePage extends _0_BasePage {

	public _0_HomePage(WebDriver driver) {
		super(driver);
	}

	String baseURL = "https://stage-app.modusign.co.kr";

	public _0_HomePage Homepageopen() {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return this;
	}

}
