package PagesObjectModel;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class _0_BasePage extends LoadableComponent<_0_BasePage> {

	public WebDriver driver;
	public WebDriverWait Wait;

	public _0_BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Wait = new WebDriverWait(driver,30);
	}
	
	
	private String url = "https://stage-app.modusign.co.kr/documents";
	private String title = "모두싸인 내 문서";

	
	@Override
	protected void load() {
		this.driver.get(url);
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		assertTrue(driver.getTitle().equals(title));
		
		//SoftAssert a = new SoftAssert();  
		//a.assertTrue(driver.getTitle().equals(title));


		// TODO Auto-generated method stub
		
	}
}
