package PagesObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _4_ContractSetup_Step1page {

	WebDriver driver;

	// 첫번째 서명자 이메일 
	@FindBy(name = ("signerEmail"))
	WebElement signerEmail;
	
	
	// 두번째 서명자 이름 
	@FindBy(css = (".css-8tn0p7:nth-child(4) .css-9ky0ym"))
	WebElement signatoryName_Btn;
	
	@FindBy(css = (".css-p0j5as > .css-wi6c9a"))
	WebElement signatoryEamli_Btn;
	
	// 두번째 서명자 이메일 입력 
	@FindBy(css = (".css-8tn0p7:nth-child(4) .css-9r9pmj"))
	WebElement signatoryEmailtextfelid_Btn;
	
	
	
	
	
	// 서명자 삭제
	@FindBy(css = (".css-8tn0p7:nth-child(4) .css-54ez61"))
	WebElement signatoryDel_Btn;

	// 서명자 삭제 컨펍 확인
	@FindBy(css = (".css-syd1y3"))
	WebElement signatoryConfirm_del_Btn;

	
	// 다음단계로 버튼 
	@FindBy(css = ("button[aria-label='다음 단계로']"))
	WebElement Next_btn;

	public _4_ContractSetup_Step1page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void signerEmail1() throws InterruptedException {;
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	signerEmail.sendKeys(Keys.BACK_SPACE);
	
	}
	
	public void signerEmail2(String arg1) throws InterruptedException {;
	signerEmail.sendKeys(arg1);


	}
	
	public void ContractSetup_signatoryName_Btn(String arg1) throws InterruptedException {
		signatoryName_Btn.sendKeys(arg1);


	}

	public void ContractSetup_signatoryEmail_Btn(String arg1) throws InterruptedException {
		signatoryEamli_Btn.click();
		signatoryEmailtextfelid_Btn.sendKeys(arg1);

	}
	
	public void Next_btn() throws InterruptedException {
		Next_btn.click();

	}
	
	

	public void ContractSetup_Step1page_Setup() throws InterruptedException {
		signatoryDel_Btn.click();
		signatoryConfirm_del_Btn.click();
		Next_btn.click();

	}
}
