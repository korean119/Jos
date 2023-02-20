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


public class _4_ContractSetup_Step1page {

	WebDriver driver;
	
	 @FindBy(css = (".css-8tn0p7:nth-child(4) .css-54ez61"))
	 WebElement signatoryDel_Btn;
	 
	 @FindBy(css = (".css-syd1y3"))
	 WebElement signatoryConfirm_del_Btn;
	 
	 @FindBy(css = ("button[aria-label='다음 단계로']"))
	 WebElement Next_btn;
	 

	public _4_ContractSetup_Step1page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void ContractSetup_Step1page_Setup() throws InterruptedException {
		 signatoryDel_Btn.click();
		 signatoryConfirm_del_Btn.click();
		 Next_btn.click();
		

		

	}
}
