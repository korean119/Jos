package PagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _6_ContractSetup_Step3page {

	WebDriver driver;

	@FindBy(css = (".Btn--light"))
	WebElement LimitedTextareaselect;

	
	@FindBy(css = (".LimitedTextarea__textarea"))
	WebElement LimitedTextarea;

	@FindBy(xpath = ("//button[contains(.,'수정 완료')]"))
	WebElement Editdone;
	
	@FindBy(css = (".Btn--primary"))
	WebElement Settingdone;
	
	@FindBy(id = ("agreement-check1"))
	WebElement agreementcheck1;
	
	@FindBy(id = ("agreement-check2"))
	WebElement agreementcheck2;
	
	
	@FindBy(css = (".css-1r6iwme"))
	WebElement done;
	
	
	@FindBy(css = (".Btn:nth-child(3)"))
	WebElement done2;

	

	public _6_ContractSetup_Step3page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void LimitedTextareaedit(String arg1) {
		// driver.findElement(Email).sendKeys(arg1);
		LimitedTextarea.sendKeys(arg1);
	}

	public void ContractSetup_Step3page_Setup() throws InterruptedException {
		LimitedTextareaselect.click();
		LimitedTextarea.click();
		Editdone.click();
		Settingdone.click();
		agreementcheck1.click();
		agreementcheck2.click();
		done.click();
		done2.click();
		
	

	}
}

	