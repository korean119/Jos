package POM_08_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import POM_00_BasePage.BasePage;

public class SettingsPage_PricingPaymentPage extends BasePage {

	public SettingsPage_PricingPaymentPage(WebDriver driver) {
		super(driver);

	}

	// 설정 - 요금제/결제 탭 버튼 클릭
	@FindBy(xpath = ("//button[contains(text(),'요금제/결제')]"))
	WebElement Remaining_Usage_Tab_btn;

	public void Remaining_Usage_Tab_btn() throws InterruptedException {

		Wait.until(ExpectedConditions.visibilityOf(Remaining_Usage_Tab_btn)).click();

	}

	// 설정 - 요금제/결제 화면
	@FindBy(xpath = ("(//li[@class='css-17wdz8e'])[1]"))
	WebElement Remaining_Usage_Signature_Request_Check;

	// 서명요청 건수 가져와보자
	public void Remaining_Usage_Signature_Request_Check() throws InterruptedException {

		String Remaining_Usage_Signature_Request_Check_Text1 = Wait
				.until(ExpectedConditions.visibilityOf(Remaining_Usage_Signature_Request_Check)).getText().trim();

		System.out.println(Remaining_Usage_Signature_Request_Check_Text1);

	}

	public String Get_Remaining_Usage_Signature_Request_Check() {

		String getText = Wait.until(ExpectedConditions.visibilityOf(Remaining_Usage_Signature_Request_Check)).getText().trim();

		System.out.println(getText);

		return getText;

	}

}
