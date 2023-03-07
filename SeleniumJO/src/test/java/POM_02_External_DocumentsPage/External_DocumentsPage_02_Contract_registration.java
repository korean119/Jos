package POM_02_External_DocumentsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import POM_00_BasePage.BasePage;

public class External_DocumentsPage_02_Contract_registration extends BasePage {

	public External_DocumentsPage_02_Contract_registration(WebDriver driver) {
		super(driver);

}
	
	@FindBy(xpath = ("//button[contains(text(),'+ 계약 등록')]"))
	WebElement ExternalDocument_Upload_btn;
	
	@FindBy(xpath = ("//div[@class='css-1f3z775']//section[2]"))
	WebElement External_info_Open_btn;
	
	
	@FindBy(xpath = ("//input[@placeholder='1자 이상 100자 이내']"))
	WebElement External_ContractTitle_input;
	
	
	@FindBy(xpath = ("//button[@class='css-1lk8z19']"))
	WebElement External_ContractCategory_Open_btn;
	
	
	@FindBy(xpath = ("//li[@value='d059cc70-ab76-11ed-b034-ed91fba36d28']"))
	WebElement External_ContractCategory_Select;
	
	public void External_ContractTitle_input(String arg1) throws InterruptedException {
		External_ContractTitle_input.click();
		External_ContractTitle_input.sendKeys(arg1);

	}


}

