package PagesObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class _2_MainPage {

	 WebDriver driver;
	
	 @FindBy(css = (".tagGNBContractSetupStartBtn"))
	 WebElement ContractSetupStartBtn;
	 
	 public _2_MainPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 
	 }

	 public void EnterContractSetupStart() {
		 ContractSetupStartBtn.click();
		 
	 }
}
	
	

