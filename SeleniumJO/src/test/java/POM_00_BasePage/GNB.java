package POM_00_BasePage;

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
	// public final void reload() {
	// this.load();
	// }

	// 서명 요청 버튼
	@FindBy(css = (".tagGNBContractSetupStartBtn"))
	WebElement ContractSetupStart_btn;

	public void ContractSetupStart_btn() {
		// ContractSetupStartBtn.click();
		Wait.until(ExpectedConditions.visibilityOf(ContractSetupStart_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/documents']"))
	WebElement Documents_btn;

	public void Documents_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Documents_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/external-documents/folders']"))
	WebElement Externaldocuments_btn;

	public void Externaldocuments_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Externaldocuments_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/templates']//div[@class='css-1xc9aey']"))
	WebElement Templates_btn;

	public void Templates_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Templates_btn)).click();
	}

	@FindBy(xpath = ("//a[@href='/archived-documents']"))
	WebElement Archived_documents_btn;

	public void Archived_documents_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Archived_documents_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/bulk-requests']"))
	WebElement Bulkrequests_btn;

	public void Bulkrequests_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Bulkrequests_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/links']"))
	WebElement Linksignature_btn;

	public void Linksignature_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Linksignature_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/approvals']"))
	WebElement Approvals_btn;

	public void Approvals_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Approvals_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/editing-documents']"))
	WebElement Editing_documents_btn;

	public void Editing_documents_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Editing_documents_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/signatures']"))
	WebElement Signatures_btn;

	public void Signatures_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Signatures_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/drafts']"))
	WebElement Drafts_btn;

	public void Drafts_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Drafts_btn)).click();

	}

	@FindBy(xpath = ("//a[@target='_blank']"))
	WebElement Blank_btn;

	public void Blank_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Blank_btn)).click();

	}

	@FindBy(xpath = ("//a[@href='/settings']"))
	WebElement Settings_btn;

	public void Settings_btn() {
		Wait.until(ExpectedConditions.visibilityOf(Settings_btn)).click();

	}
}