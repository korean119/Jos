package POM_03_TempletePge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import POM_00_BasePage.BasePage;

public class TempletePage_CreateTempleteStep1Page extends BasePage {

	public TempletePage_CreateTempleteStep1Page(WebDriver driver) {
		super(driver);

	}

	// 1. 서명자 설정 화면
	// 순서대로 서명 radio 버튼.
	@FindBy(xpath = ("(//input[@type='radio'])[1]"))
	WebElement Order_radiobtn;

	public void Ordrer_radiobtn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Order_radiobtn)).click();

	}

	// 순서없이 서명 radio 버튼.
	@FindBy(xpath = ("(//input[@type='radio'])[2]"))
	WebElement AnyOrder_radiobtn;

	public void AnyOrder_radiobtn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(AnyOrder_radiobtn)).click();

	}

	// 첫번째 서명자 역할
	@FindBy(xpath = ("//input[@placeholder='역할']"))
	WebElement Signatory_1_role_input;

	public void Signatory_1_role_input_m(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Signatory_1_role_input)).click();
		Wait.until(ExpectedConditions.visibilityOf(Signatory_1_role_input)).clear();
		Wait.until(ExpectedConditions.visibilityOf(Signatory_1_role_input)).sendKeys(arg1);
	}

	// 다음단계 버튼
	@FindBy(xpath = ("//button[contains(text(),'다음 단계로 >')]"))
	WebElement Next_btn;

	public void Next_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Next_btn)).click();

	}

/////////////////////////////////////////////////////////////////////////
	
	
	public void Templete_Request_Step1Page_Case(String arg1) throws InterruptedException {
		Signatory_1_role_input.click();
		Next_btn();

	}

}