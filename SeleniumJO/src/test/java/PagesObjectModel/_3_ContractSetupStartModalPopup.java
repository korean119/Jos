package PagesObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class _3_ContractSetupStartModalPopup extends _0_BasePage {

	public _3_ContractSetupStartModalPopup(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(name = ("CLOUD_DRIVE"))
	WebElement CLOUD_DRIVE_Btn;

	@FindBy(xpath = ("//button[normalize-space()='Google Drive']"))
	WebElement CLOUD_DRIVE_btn_OK;

	@FindBy(name = ("LOCAL"))
	WebElement LOCAL_Btn;

	@FindBy(xpath = ("//button[contains(text(),'파일 찾기')]"))
	WebElement LOCAL_Btn_OK;

	@FindBy(name = ("SAMPLE_DOCUMENTS"))
	WebElement SAMPLE_DOCUMENTS_Btn;

	@FindBy(css = (".UpLoadModalSampleDocuments__title:nth-child(2) > .UpLoadModalSampleDocuments__button"))
	WebElement SAMPLE_DOCUMENTSUploadDoc_btn;

	@FindBy(css = (".css-1uzrp8i"))
	WebElement SAMPLE_DOCUMENTSUploadModal_Btn;

	@FindBy(css = (".css-elq43k"))
	WebElement CheckandStart_Btn;

	
	public void Modal() throws InterruptedException {
		CLOUD_DRIVE_Btn.click();
		Thread.sleep(1000);
		String getheadertext = CLOUD_DRIVE_btn_OK.getText().trim();
		assertEquals("Google Drive", getheadertext);

		LOCAL_Btn.click();
		Thread.sleep(1000);
		String getheadertext2 = LOCAL_Btn_OK.getText().trim();
		assertEquals("파일 찾기", getheadertext2);

		SAMPLE_DOCUMENTS_Btn.click();

		SAMPLE_DOCUMENTSUploadDoc_btn.click();

		SAMPLE_DOCUMENTSUploadModal_Btn.click();

		CheckandStart_Btn.click();

	}
	
	public void Modal_BascScript() throws InterruptedException {
		SAMPLE_DOCUMENTS_Btn.click();

		SAMPLE_DOCUMENTSUploadDoc_btn.click();

		SAMPLE_DOCUMENTSUploadModal_Btn.click();

		CheckandStart_Btn.click();
	}
}