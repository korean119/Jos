package PagesObjectModel_Contract;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PagesObjectModel._0_BasePage;

public class ContractSetup_Step2page extends _0_BasePage  {

	public ContractSetup_Step2page (WebDriver driver) {
        super(driver);
    }

	@FindBy(css = (".css-w07yg0 .css-1dgk6ra"))
	WebElement SignatureField_1_btn;
	
	@FindBy(css = (".css-h6sr04 .css-1dgk6ra"))
	WebElement SignatureField_2_btn;

	@FindBy(css = (".css-skfhhz"))
	WebElement TextField_1_btn;
	
	@FindBy(css = (".css-h6sr04 .FieldLocator:nth-child(2) > .css-skfhhz"))
	WebElement TextField_2_btn;
	
	@FindBy(css = (".css-w07yg0 .FieldLocator:nth-child(3) > .css-skfhhz"))
	WebElement CheckboxField_1_btn;
	
	@FindBy(css = (".css-h6sr04 .FieldLocator:nth-child(3) > .css-skfhhz"))
	WebElement CheckboxField_2_btn;


	@FindBy(css = (".PDFSetupBusinessPage__virtual-layer"))
	WebElement PDFSreen_go_Btn;


	@FindBy(css = (".Btn--primary"))
	WebElement Next_btn;
	
	// 서명 없는 팝업 컨펌 
	@FindBy(css = (".css-1r6iwme"))
	WebElement yes_btn;

	public void ContractSetup_Step2page_Setup_BaseScript() throws InterruptedException {

		SignatureField_1_btn.click();
		PDFSreen_go_Btn.click();
		
		TextField_1_btn.click();
		PDFSreen_go_Btn.click();
		
		CheckboxField_1_btn.click();
		PDFSreen_go_Btn.click();
		
		SignatureField_2_btn.click();
		PDFSreen_go_Btn.click();
		
		TextField_2_btn.click();
		PDFSreen_go_Btn.click();
		
		CheckboxField_2_btn.click();
		PDFSreen_go_Btn.click();
		
		Next_btn.click();

	}
}