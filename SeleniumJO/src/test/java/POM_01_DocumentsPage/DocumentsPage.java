package POM_01_DocumentsPage;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

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

	// 문서함 > 리스트 첫 번째(내용 확인하고 서명)
	@FindBy(css = ("div:nth-child(1) > .DocumentListItem .css-2q6pdu"))
	WebElement DocumentListItem1;

	// 문서함 > 리스트 두 번째
	@FindBy(css = ("div:nth-child(2) > .DocumentListItem .css-2q6pdu"))
	WebElement DocumentListItem2;

	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(1)"))
	WebElement DropdownMenuRow1;
	
	@FindBy(css = (".DropdownWrapper--opened .DropdownMenuRow:nth-child(2)"))
	WebElement DropdownMenuRow2;
	

	// 거절 팝업 텍스트 입력 
	@FindBy(name = ("comment"))
	WebElement Refusetosign_modal_text_area;
	
	
	@FindBy(xpath = ("//button[contains(text(),'거절하기')]"))
	WebElement Refusetosign_modal_refuse_btn;
	
	@FindBy(xpath = ("//button[contains(text(),'서명 취소하기')]"))
	WebElement Refusetosign_modal_signcancle_btn;
	
	
	
	@FindBy(xpath = ("//button[contains(text(),'확인')]"))
	WebElement Refusetosign_card_btn;
	
	
	

	
	
	//////////////////// 캡쳐용인데 나중에 어디다 쓸거 같은뎅 /////////////////////////

	@FindBy(css = (".PDFTextLayer"))
	WebElement PDFLayer;

	//////////////////// 캡쳐용인데 나중에 어디다 쓸거 같은뎅 /////////////////////////

	
	public void DocumentListItem1() {
		DocumentListItem1.click();

	}

	public void DropdownMenuRow() {
		DropdownMenuRow1.click();

	}

	public void Doucment_Dropdown_BaseScript() {
		DocumentListItem1.click();
		DropdownMenuRow1.click();
		
	}

	public void Doucment_Dropdown_BaseScript2(String arg1) throws IOException {
		DocumentListItem1.click();
		DropdownMenuRow2.click();
		Refusetosign_modal_text_area.click();
		Refusetosign_modal_text_area.sendKeys(arg1);
		Refusetosign_modal_refuse_btn.click();
		Refusetosign_card_btn.click();
		
	}
	
	
	public void Doucment_Dropdown_BaseScript3(String arg1) throws IOException {
		DocumentListItem1.click();
		DropdownMenuRow2.click();
		Refusetosign_modal_text_area.click();
		Refusetosign_modal_text_area.sendKeys(arg1);
		Refusetosign_modal_signcancle_btn.click();
		Refusetosign_card_btn.click();
		
	}
	
	
	public void NomarlAccount_NormalSign_OnandOff_Case_Singatory() throws IOException {
		DocumentListItem1.click();
		DropdownMenuRow1.click();
		
	}

	
	
	
	
	//////////////////// 캡쳐용인데 나중에 어디다 쓸거 같은뎅 /////////////////////////
	
	public void AllScreen() throws IOException, InterruptedException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\SeleniumPractice\\logos/screenshot02.png"));

		System.out.println("The Screenshot is captured.");

	}

	public void ElementCapture() throws IOException, InterruptedException {

		// jqury 오류 대응 코드, 이게 뭔지는 나도 잘 모름
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (!(Boolean) js.executeScript("return (typeof jQuery != \"undefined\")")) {
			js.executeScript("var headID = document.getElementsByTagName('head')[0];"
					+ "var newScript = document.createElement('script');" + "newScript.type = 'text/javascript';"
					+ "newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';"
					+ "headID.appendChild(newScript);");
			WebDriverWait waitJQ = new WebDriverWait(driver, 30);
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
			WebDriverWait waitJQ = new WebDriverWait(driver, 30);
			Function<WebDriver, Boolean> jQueryAvailable = WebDriver -> ((Boolean) js
					.executeScript("return (typeof jQuery != \"undefined\")"));
			waitJQ.until(jQueryAvailable);
		}

		// WebElement PDFLayers = driver.findElement(By.cssSelector(".PDFTextLayer"));

		Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver, PDFLayer);

		ImageIO.write(Screenshot.getImage(), "png", new File("C:\\SeleniumPractice\\logos/screenshot02.png"));
		System.out.println("스크린 캡쳐 성공");

		BufferedImage expectedImage = ImageIO.read(new File("C:\\SeleniumPractice\\logos/screenshot01.png"));

		BufferedImage actualImage = Screenshot.getImage();

		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
		if (diff.hasDiff() == true) {
			System.out.println("이미지 Fail");
		} else {
			System.out.println("이미지 Pass");
		}

	}
	
	//////////////////// 캡쳐용인데 나중에 어디다 쓸거 같은뎅 /////////////////////////
}