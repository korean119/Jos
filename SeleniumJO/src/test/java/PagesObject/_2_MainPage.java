package PagesObject;

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

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class _2_MainPage extends _0_BasePage {

	@FindBy(css = (".tagGNBContractSetupStartBtn"))
	WebElement ContractSetupStartBtn;

	@FindBy(css = (".css-u15r74"))
	WebElement DocumentListItem;

	@FindBy(css = (".css-1eegufe"))
	WebElement DropdownMenuRow;

	@FindBy(css = (".PDFTextLayer"))
	WebElement PDFLayer;

	public _2_MainPage(WebDriver driver) {
		super(driver);

	}

	public void EnterContractSetupStart() {
		ContractSetupStartBtn.click();

	}

	public void DocumentListItem() {
		DocumentListItem.click();

	}

	public void DropdownMenuRow() {
		DropdownMenuRow.click();

	}
	

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

		//WebElement PDFLayers = driver.findElement(By.cssSelector(".PDFTextLayer"));

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

		//WebElement PDFLayers = driver.findElement(By.cssSelector(".PDFTextLayer"));

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
}