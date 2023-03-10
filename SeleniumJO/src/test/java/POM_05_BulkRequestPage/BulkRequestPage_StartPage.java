package POM_05_BulkRequestPage;

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

public class BulkRequestPage_StartPage extends BasePage {

	public BulkRequestPage_StartPage(WebDriver driver) {
		super(driver);

	}

	// 대량 전송 엑셀 업로드 화면 
	// 엑셀 파일 업로드 이건 쓸일 없을 듯
	@FindBy(xpath = ("//button[contains(text(),'3. 엑셀 업로드하기')]"))
	WebElement BulkRequest_ExcelUpload_btn;

	// 엑셀 파일 업로드. 버튼 입력과 업로드 동시에 동작함 
	public void BulkRequest_ExcelUpload_btn_m(String arg1) throws InterruptedException {
		WebElement filepath = driver.findElement(By.cssSelector("input[type='file']"));
		filepath.sendKeys(arg1);

		// filepath.sendKeys("/Users/johnny/Desktop/Selenium_img/BulkRequset/bulkrequest.automation.xlsx");

	}
}