package POM_02_External_DocumentsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import POM_00_BasePage.BasePage;

public class External_DocumentsPage_01_Main extends BasePage {

	public External_DocumentsPage_01_Main(WebDriver driver) {
		super(driver);

}
	
	@FindBy(xpath = ("//button[contains(text(),'계약 등록')]"))
	WebElement ExternalDocument_Upload_btn;
	
	@FindBy(xpath = ("//button[contains(text(),'계약 관리')]"))
	WebElement ExternalDocument_management_btn;
	
	
	@FindBy(xpath = ("//input[@type='checkbox']"))
	WebElement Favorites_Checkbox;

	
	}






