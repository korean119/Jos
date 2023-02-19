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

public class _5_ContractSetup_Step2page {

	WebDriver driver;

	@FindBy(css = (".css-1dgk6ra"))
	WebElement SignatureField__button;

	@FindBy(css = (".PDFSetupBusinessPage__virtual-layer"))
	WebElement PDFSreen_go_Btn;

	@FindBy(css = (".css-skfhhz"))
	WebElement TextField_btn;

	@FindBy(css = (".FieldLocator:nth-child(3) .css-skfhhz"))
	WebElement CheckboxField_btn;

	@FindBy(css = ("button[aria-label='다음 단계로']"))
	WebElement Next_btn;

	public _5_ContractSetup_Step2page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void ContractSetup_Step2page_Setup() throws InterruptedException {

		SignatureField__button.click();
		PDFSreen_go_Btn.click();
		TextField_btn.click();
		PDFSreen_go_Btn.click();
		CheckboxField_btn.click();
		PDFSreen_go_Btn.click();
		Next_btn.click();
		Thread.sleep(3000);

	}
}
