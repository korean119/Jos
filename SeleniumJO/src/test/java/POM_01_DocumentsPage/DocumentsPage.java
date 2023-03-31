package POM_01_DocumentsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Function;

import POM_00_BasePage.BasePage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class DocumentsPage extends BasePage {

	public DocumentsPage(WebDriver driver) {
		super(driver);

	}

	// 0329
	// 문서함 첫번째 리스트 "내 서명 필요 확인"
	// 화면이 바로 갱신 되지 않는 이슈? 경우? 가 있음 (특히 프리뷰에서)
	// 때문에 간혹 멈추는 경우가 있어 임시로 넣어둠 효과 없으면 삭제 예정
	// fail 이 나더라도 멈추지 않고 Fail 상태확인 할 수 있게 두었음 
	
	// 0331
	// 문서가 생각보다 더 늦게 만들어지는 경우가 있는듯(서명을 뭔가 대량으로 발생 시켰을 경우? 프리뷰  경우?) 
	// 문서 ID 와 같은 걸로 100%매칭 시킬 필요가 있지 않을까도 싶음 
	@FindBy(xpath = (("(//li[@display='flex'])[1]")))
	WebElement ContractStatus_Check;

	public void ContractStatus_Check() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			try {
				if (Wait.until(ExpectedConditions.visibilityOf(ContractStatus_Check)).getText().equals("내 서명 필요")) {

				} else {
					
					System.out.println("내 서명 필요 상태가 아님");
					driver.navigate().refresh();
					
					i++;

				}
			} catch (NoSuchElementException e) {
				System.out.println(e);
			}
		}
	}

	public void ContractStatus_Check2() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			try {
				if (Wait.until(ExpectedConditions.visibilityOf(ContractStatus_Check)).getText().equals("완료된 문서")) {

				} else {
					
					System.out.println("완료된 문서 상태가 아님");

					driver.navigate().refresh();
					i++;

				}
			} catch (NoSuchElementException e) {
				System.out.println(e);
			}
		}
	}

	// 문서함 > 리스트 첫 번째(내용 확인하고 서명)
	@FindBy(css = ("div:nth-child(1) > .DocumentListItem"))
	WebElement DocumentListItem1;

	public void DocumentListItem1() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(DocumentListItem1)).click();

	}

	// 문서함 > 리스트 두 번째
	@FindBy(css = ("div:nth-child(2) > .DocumentListItem"))
	WebElement DocumentListItem2;

	public void DocumentListItem2() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(DocumentListItem2)).click();

	}

	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(1)"))
	WebElement DropdownMenuRow1;

	public void DropdownMenuRow1() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(DropdownMenuRow1)).click();

	}

	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(2)"))
	WebElement DropdownMenuRow2;

	public void DropdownMenuRow2() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(DropdownMenuRow2)).click();

	}

	// 거절 팝업 텍스트 입력
	@FindBy(name = ("comment"))
	WebElement Refusetosign_modal_text_area;

	public void Refusetosign_modal_text_area(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Refusetosign_modal_text_area)).click();
		Wait.until(ExpectedConditions.visibilityOf(Refusetosign_modal_text_area)).sendKeys(arg1);
	}

	@FindBy(xpath = ("//button[contains(text(),'거절하기')]"))
	WebElement Refusetosign_modal_refuse_btn;

	public void Refusetosign_modal_refuse_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Refusetosign_modal_refuse_btn)).click();

	}

	@FindBy(xpath = ("//button[contains(text(),'서명 취소하기')]"))
	WebElement Refusetosign_modal_signcancle_btn;

	public void Refusetosign_modal_signcancle_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Refusetosign_modal_signcancle_btn)).click();

	}

	@FindBy(xpath = ("//button[contains(text(),'확인')]"))
	WebElement Refusetosign_card_btn;

	public void Refusetosign_card_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Refusetosign_card_btn)).click();

	}

	// 완료 된 문서 패스워드
	@FindBy(xpath = ("//input[@placeholder='8자 ~ 32자 이내']"))
	WebElement Contract_DonePage_Password_input;

	public void Contract_DonePage_Password_input(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Contract_DonePage_Password_input)).click();
		Wait.until(ExpectedConditions.visibilityOf(Contract_DonePage_Password_input)).sendKeys(arg1);

	}

	// 완료 된 문서패스워드 확인 버튼.
	@FindBy(xpath = ("//button[contains(text(),'확인')]"))
	WebElement Contract_DonePage_Password_Done_btn;

	public void Contract_DonePage_Password_Done_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Contract_DonePage_Password_Done_btn)).click();

	}

	// 6Stauts 에서 사용하려고 임시로 만들어둠
	public void Doucment_Dropdown_BaseScript_m() throws InterruptedException {
		DocumentListItem1();
		DropdownMenuRow1();

	}

	public void Doucment_Dropdown_BaseScript2_m(String arg1) throws InterruptedException {
		DocumentListItem1();
		DropdownMenuRow2();
		Refusetosign_modal_text_area(arg1);
		Refusetosign_modal_refuse_btn();
		Refusetosign_card_btn();

	}

	public void Doucment_Dropdown_BaseScript3_m(String arg1) throws InterruptedException {
		DocumentListItem1();
		DropdownMenuRow2();
		Refusetosign_modal_text_area(arg1);
		Refusetosign_modal_signcancle_btn();
		Refusetosign_card_btn();

	}

	// 문서 선택에 대부분 공통적으로 사용 됨
	public void Documents_Dropdown_1_select_m() throws InterruptedException {
		DocumentListItem1();
		DropdownMenuRow1();

	}

	//////////////////// 캡쳐 /////////////////////////

	// 캡쳐용 PDFLayer 영역
	@FindBy(css = (".PDFTextLayer"))
	WebElement PDFLayer;

	public void AllScreen() throws IOException, InterruptedException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\SeleniumPractice\\logos/screenshot02.png"));

		System.out.println("The Screenshot is captured.");

	}

	public void ElementCapture() throws IOException, InterruptedException {

		// Asot jqury 오류 대응 코드, 근데 Ashot 으로 이미지 캡쳐 안해서 필요는 없을 것 같지만 혹시나 해서 놔둠
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (!(Boolean) js.executeScript("return (typeof jQuery != \"undefined\")")) {
			js.executeScript("var headID = document.getElementsByTagName('head')[0];"
					+ "var newScript = document.createElement('script');" + "newScript.type = 'text/javascript';"
					+ "newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';"
					+ "headID.appendChild(newScript);");
			WebDriverWait waitJQ = new WebDriverWait(driver, Duration.ofSeconds(30));
			Function<WebDriver, Boolean> jQueryAvailable = WebDriver -> ((Boolean) js
					.executeScript("return (typeof jQuery != \"undefined\")"));
			waitJQ.until(jQueryAvailable);
		}

		// WebElement PDFLayers = driver.findElement(By.cssSelector(".PDFTextLayer"));

		Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver, PDFLayer);

		ImageIO.write(Screenshot.getImage(), "png", new File("C:\\SeleniumPractice\\logos/screenshot01.png"));

		System.out.println("스크린 캡쳐 성공");

	}

	public void ElementCapture2() throws IOException, InterruptedException {

		// jqury 오류 대응 코드, 이게 뭔지는 나도 잘 모름
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (!(Boolean) js.executeScript("return (typeof jQuery != \"undefined\")")) {
			js.executeScript("var headID = document.getElementsByTagName('head')[0];"
					+ "var newScript = document.createElement('script');" + "newScript.type = 'text/javascript';"
					+ "newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';"
					+ "headID.appendChild(newScript);");
			WebDriverWait waitJQ = new WebDriverWait(driver, Duration.ofSeconds(30));
			Function<WebDriver, Boolean> jQueryAvailable = WebDriver -> ((Boolean) js
					.executeScript("return (typeof jQuery != \"undefined\")"));
			waitJQ.until(jQueryAvailable);
		}

		// WebElement PDFLayers = driver.findElement(By.cssSelector(".PDFTextLayer"));

		Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver, PDFLayer);

		// ImageIO.write(Screenshot.getImage(), "png", new
		// File("C:\\SeleniumPractice\\logos/screenshot02.png"));
		ImageIO.write(Screenshot.getImage(), "png", new File("/Users/johnny/Desktop/Selenium_img/screenshot02.png"));

		System.out.println("스크린 캡쳐 성공");

		// BufferedImage expectedImage = ImageIO.read(new
		// File("C:\\SeleniumPractice\\logos/screenshot01.png"));
		BufferedImage expectedImage = ImageIO.read(new File("/Users/johnny/Desktop/Selenium_img/screenshot01.png"));

		BufferedImage actualImage = Screenshot.getImage();

		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
		if (diff.hasDiff() == true) {
			System.out.println("이미지 Fail");
		} else {
			System.out.println("이미지 Pass");
		}

	}
}