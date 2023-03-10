package POM_03_TempletePge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import POM_00_BasePage.BasePage;

public class TempletePage_CreateTempleteStep3Page extends BasePage {

	public TempletePage_CreateTempleteStep3Page(WebDriver driver) {
		super(driver);

	}

	// 3. 기타 설정 화면
	// 템플릿 이름
	@FindBy(xpath = ("//input[@id='templateName']"))
	WebElement Template_Name_input;
	
	public void Template_Name_input_m(String arg1) throws InterruptedException {
		Template_Name_input.clear();
		Template_Name_input.click();
		Template_Name_input.sendKeys(arg1);
	}


	@FindBy(xpath = ("//button[contains(text(),'템플릿 저장 >')]"))
	WebElement Templat_Save_btn;

	public void Template_Save_btn() throws InterruptedException {
		Templat_Save_btn.click();

	}

	public void Templete_Request_Step3Page_Off_Case() throws InterruptedException {
		Template_Save_btn();
	}

	public void Templete_Request_Step3Page_On_Case(String arg1) throws InterruptedException {
		Template_Name_input_m(arg1);
		Template_Save_btn();
	}

}
