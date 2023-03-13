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
import org.testng.Assert;
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

	// 대량 전송 엑셀 Validation
	// 휴대폰 번호 Validation
	@FindBy(xpath = ("(//li[@class='ExcelValidationError space-2x'])[1]"))
	WebElement Validation_Phone_Text;

	public void Validation_Phone_Text(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Validation_Phone_Text)).getText();

		String getheadertext = Validation_Phone_Text.getText().trim();
		Assert.assertEquals(arg1, getheadertext);

	}

	// 휴대폰 번호 Validation
	@FindBy(xpath = ("(//li[@class='ExcelValidationError space-2x'])[2]"))
	WebElement Validation_Name_Text;

	public void Validation_Name_Text(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Validation_Name_Text)).getText();

		String getheadertext = Validation_Name_Text.getText().trim();
		Assert.assertEquals(arg1, getheadertext);

	}

	// 법인 공동 사업자 사업자 번 Validation
	@FindBy(xpath = ("(//li[@class='ExcelValidationError space-2x'])[3]"))
	WebElement Validation_CorporationNumber_Text;

	public void Validation_CorporationNumber_Text(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Validation_CorporationNumber_Text)).getText();

		String getheadertext = Validation_CorporationNumber_Text.getText().trim();
		Assert.assertEquals(arg1, getheadertext);

	}

	// 법인 공동 사업자 이름  Validation
	@FindBy(xpath = ("(//li[@class='ExcelValidationError space-2x'])[4]"))
	WebElement Validation_CorporationName_Text;

	public void Validation_CorporationName_Text(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Validation_CorporationName_Text)).getText();

		String getheadertext = Validation_CorporationName_Text.getText().trim();
		Assert.assertEquals(arg1, getheadertext);

	}
	
	// 법인 공동 사업자 Validation
	@FindBy(xpath = ("(//li[@class='ExcelValidationError space-2x'])[5]"))
	WebElement Validation_CC_Text;

	public void Validation_CC_Text(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Validation_CC_Text)).getText();

		String getheadertext = Validation_CC_Text.getText().trim();
		Assert.assertEquals(arg1, getheadertext);

	}
}
