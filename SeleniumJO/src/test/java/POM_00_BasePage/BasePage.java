package POM_00_BasePage;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

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

public class BasePage extends LoadableComponent<BasePage> {

	public WebDriver driver;
	public WebDriverWait Wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		//요소가 페이지의 DOM에 있고 표시 되는지 확인하는 데 사용됩니다. 
		//By호출 가능한 함수가 있는 객체 대신 객체를 사용하여 WebElement해당 요소를 먼저 찾은 다음 
		//요소가 표시되는지 여부를 확인한다는 의미입니다.
     	Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

