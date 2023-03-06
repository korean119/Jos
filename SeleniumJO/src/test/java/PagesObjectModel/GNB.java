package PagesObjectModel;

import static org.testng.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import POM_00_BasePage.BasePage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class GNB extends BasePage {

	public GNB(WebDriver driver) {
		super(driver);
	}
	
	private String url = "https://stage-app.modusign.co.kr/documents";
	private String title = "모두싸인 내 문서";
	
	@Override
	protected void load() {
		this.driver.get(url);
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		
		assertTrue(driver.getTitle().equals(title));
		// TODO Auto-generated method stub
		
	}
	 //public final void reload() {
	 //       this.load();
	  //  }

	// 서명 요청 버튼
	@FindBy(css = (".tagGNBContractSetupStartBtn.css-5p265p"))
	WebElement ContractSetupStart_btn;

	@FindBy(xpath = ("//a[@href='/documents']//div[@class='css-1xc9aey']"))
	WebElement Documents_btn;

	@FindBy(xpath = ("//a[@href='/external-documents/folders']//div[@class='css-1xc9aey']"))
	WebElement Externaldocuments_btn;

	@FindBy(xpath = ("//a[@href='/templates']//div[@class='css-1xc9aey']"))
	WebElement Templates_btn;

	@FindBy(xpath = ("//a[@href='/archived-documents']//div[@class='css-1xc9aey']"))
	WebElement Archived_documents_btn;

	@FindBy(xpath = ("//a[@href='/bulk-requests']//div[@class='css-1xc9aey']"))
	WebElement Bulkrequests_btn;

	@FindBy(xpath = ("//a[@href='/links']//div[@class='css-1xc9aey']"))
	WebElement Linksignature_btn;

	@FindBy(xpath = ("//a[@href='/approvals']//div[@class='css-1xc9aey']"))
	WebElement Approvals_btn;

	@FindBy(xpath = ("//a[@href='/editing-documents']//div[@class='css-1xc9aey']"))
	WebElement Editing_documents_btn;

	@FindBy(xpath = ("//a[@href='/signatures']//div[@class='css-1xc9aey']"))
	WebElement Signatures_btn;

	@FindBy(xpath = ("//a[@href='/drafts']//div[@class='css-1xc9aey']"))
	WebElement Drafts_btn;

	@FindBy(xpath = ("//a[@target='_blank']//div[@class='css-1xc9aey']"))
	WebElement Blank_btn;

	@FindBy(xpath = ("//a[@href='/settings']//div[@class='css-1xc9aey']"))
	WebElement Settings_btn;

	
	
	
	public void ContractSetupStart_btn() {
		// ContractSetupStartBtn.click();
		Wait.until(ExpectedConditions.visibilityOf(ContractSetupStart_btn)).click();

	}
	
	public void Documents_btn() {
		Documents_btn.click();
	}

	public void Externaldocuments_btn() {
		Externaldocuments_btn.click();
	}

	public void Templates_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Templates_btn)).click();
	}

	public void Archived_documents_btn() {
		Archived_documents_btn.click();
	}

	public void Bulkrequests_btn() {
		Bulkrequests_btn.click();
	}

	public void Linksignature_btn() {
		Linksignature_btn.click();

	}

	public void Approvals_btn() {
		Approvals_btn.click();

	}

	public void Editing_documents_btn() {
		Editing_documents_btn.click();

	}

	public void Signatures_btn() {
		Signatures_btn.click();

	}

	public void Drafts_btn() {
		Drafts_btn.click();

	}

	public void Blank_btn() {
		Blank_btn.click();

	}

	public void Settings_btn() {
		Settings_btn.click();

	}
}