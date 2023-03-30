package POM_01_DocumentsPage;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import POM_00_BasePage.BasePage;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class DocumentsPage_ContractPage extends BasePage {

	public DocumentsPage_ContractPage(WebDriver driver) {
		super(driver);

	}

	// 남길 말 모달 텍스트 확인
	@FindBy(css = ("span[class='Linkify'] p"))
	WebElement Namgilmal_Modal_Text_Assert;

	public void Namgilmal_Modal_Text_Assert(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Namgilmal_Modal_Text_Assert)).getText();

		String getheadertext = Namgilmal_Modal_Text_Assert.getText().trim();
		Assert.assertEquals(arg1, getheadertext);
	}

	// 남길 말 모달 확인 버튼
	@FindBy(xpath = ("//button[contains(text(),'확인')]"))
	WebElement Namgilmal_Modal_btn;

	public void Namgilmal_Modal_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Namgilmal_Modal_btn)).click();
	}

	// 접근 암호 힌트 확인
	@FindBy(xpath = ("//p[contains(.,'암호 힌트 : 신준오')]"))
	WebElement PasswordHint_Text_Assert;

	public void PasswordHint_Text_Assert(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(PasswordHint_Text_Assert)).getText();

		String getheadertext = PasswordHint_Text_Assert.getText().trim();
		Assert.assertEquals(arg1, getheadertext);
	}

	// 접근 암호 입력
	@FindBy(xpath = ("//input[@placeholder='접근 암호를 입력해주세요.']"))
	WebElement Password_input;

	public void Password_input(String arg1) throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Password_input)).click();
		Wait.until(ExpectedConditions.visibilityOf(Password_input)).sendKeys(arg1);

	}

	// 접근 암호 확인 버튼
	@FindBy(xpath = ("//button[contains(text(),'암호 확인')]"))
	WebElement Password_OK_btn;

	public void Password_OK_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Password_OK_btn)).click();
	}

	// 2. 입력 화면 - [서명 시작하기] 버튼
	@FindBy(xpath = ("//button[contains(.,'서명 시작하기')]"))
	WebElement SignatureStart_btn;

	public void SignatureStart_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SignatureStart_btn)).click();
	}

	// 사인 선택하는 중인거 같은
	@FindBy(css = (".ProgressFieldSignatureMarker__box.css-pk1s35"))
	WebElement SignatureMarker_btn;

	public void SignatureMarker_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SignatureMarker_btn)).click();
	}

	// 사인 선택하는 중인거 같은
	@FindBy(css = (".ProgressFieldSignatureMarker__sub-menu.css-az90ea"))
	WebElement Signaturesub_menu_btn;

	public void Signaturesub_menu_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Signaturesub_menu_btn)).click();
	}

	// 내 사인 첫번째 이미지 선택
	@FindBy(xpath = ("(//img[@role='presentation'])[1]"))
	WebElement Mysign_image_1_btn;

	public void Mysign_image_1_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Mysign_image_1_btn)).click();
	}

	// 내 사인 선택 오케이 입력하기 버튼
	@FindBy(css = (".css-3630uk"))
	WebElement Image_confirmOK_btn;

	public void Image_confirmOK_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Image_confirmOK_btn)).click();
	}

	// 텍스트 필드 선택
	@FindBy(css = (".WritableTextFieldCore__content"))
	WebElement WritableTextFieldCore_btn;

	public void WritableTextFieldCore_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(WritableTextFieldCore_btn)).click();
	}

	// 텍스트 필드 입력
	@FindBy(css = (".TextFieldTextarea__textarea"))
	WebElement TextFieldTextarea;

	public void TextFieldTextarea_m() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(TextFieldTextarea)).click();
		Wait.until(ExpectedConditions.visibilityOf(TextFieldTextarea)).sendKeys("자동화텍스트입력");

	}

	// 2. 입력 화면 - [입력 완료] 버튼
	@FindBy(xpath = ("//button[contains(text(),'입력 완료')]"))
	WebElement InputDone_btn;

	public void InputDone_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(InputDone_btn)).click();
	}

	// 2. 입력 화면 - [확인 완료] 버튼
	@FindBy(xpath = ("//button[contains(text(),'확인 완료')]"))
	WebElement CheckDone_btn;

	public void CheckDone_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(CheckDone_btn)).click();
	}

	@FindBy(xpath = ("//button[contains(text(),'동의하고 서명 완료')]"))
	WebElement AgreeandSign_btn;

	public void AgreeandSign_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(AgreeandSign_btn)).click();
	}

	@FindBy(xpath = ("//button[contains(text(),'홈으로')]"))
	WebElement Home_btn;

	public void Home_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Home_btn)).click();
	}

	///////////////////////////////////////////////////////////////////////////

	// PDF 뷰어 캡쳐용
	@FindBy(css = (".PDFViewer__page-container"))
	WebElement PDFViewer;

	///////////////////////////////////////////////////////////////////////////

	// 서명 하고, 텍스트 입력 하고 3Page 로
	public void Step2Page_BasicinputCase_m() throws InterruptedException, IOException {
		SignatureStart_btn();

		// ElementCaptureaa();
		// SignatureMarker_btn.click();
		Signaturesub_menu_btn();
		Mysign_image_1_btn();
		Image_confirmOK_btn();

		WritableTextFieldCore_btn();
		TextFieldTextarea_m();

		InputDone_btn();
		AgreeandSign_btn();
		Home_btn();
		Thread.sleep(2000);

	}

	public void Contract_BaseScript(String arg1) throws InterruptedException {

		Wait.until(ExpectedConditions.visibilityOf(SignatureStart_btn)).click();
		// SignatureMarker_btn.click();

		Wait.until(ExpectedConditions.visibilityOf(Signaturesub_menu_btn)).click();
		Mysign_image_1_btn.click();
		Image_confirmOK_btn.click();
		WritableTextFieldCore_btn.click();
		Wait.until(ExpectedConditions.visibilityOf(TextFieldTextarea)).sendKeys(arg1);
		InputDone_btn.click();
		AgreeandSign_btn.click();
		Home_btn.click();
		Thread.sleep(2000);
	}

	public void NormalSign_Off_Case(String arg1) throws InterruptedException, IOException {

		Wait.until(ExpectedConditions.visibilityOf(SignatureStart_btn)).click();

		// ElementCaptureaa();
		// SignatureMarker_btn.click();
		Wait.until(ExpectedConditions.visibilityOf(Signaturesub_menu_btn)).click();

		Mysign_image_1_btn.click();
		Image_confirmOK_btn.click();

		WritableTextFieldCore_btn.click();
		Wait.until(ExpectedConditions.visibilityOf(TextFieldTextarea)).sendKeys(arg1);

		InputDone_btn.click();
		AgreeandSign_btn.click();
		Home_btn.click();
		Thread.sleep(2000);
	}

	public void NormalSign_On_Case(String arg1, String arg2) throws InterruptedException, IOException {
		Password_input(arg1);
		Password_OK_btn.click();

		Wait.until(ExpectedConditions.visibilityOf(SignatureStart_btn)).click();

		// ElementCaptureaa();
		// SignatureMarker_btn.click();
		Signaturesub_menu_btn.click();
		Mysign_image_1_btn.click();
		Image_confirmOK_btn.click();

		WritableTextFieldCore_btn.click();
		Wait.until(ExpectedConditions.visibilityOf(TextFieldTextarea)).sendKeys(arg1);

		InputDone_btn.click();
		AgreeandSign_btn.click();
		Home_btn.click();
		Thread.sleep(2000);

	}

	

	// 전체 스크린 캡쳐
	public void AllScreen() throws IOException, InterruptedException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\SeleniumPractice\\logos/screenshot02.png"));

		System.out.println("The Screenshot is captured.");

	}

	// 이미지 부분 캡쳐 및 이미지 자른 후 비교 
	// 어디를 캡쳐 할지 아직 안 정해서 사용 안하는 중
	public void ElementCaptureaa() throws IOException, InterruptedException {

		// Asot jqury 오류 대응 코드, 근데 Ashot 으로 이미지 캡쳐 안해서 필요는 없을 것 같지만 혹시나 해서 놔둠
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		if (!(Boolean) js.executeScript("return (typeof jQuery != \"undefined\")")) {
//			js.executeScript("var headID = document.getElementsByTagName('head')[0];"
//					+ "var newScript = document.createElement('script');" + "newScript.type = 'text/javascript';"
//					+ "newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';"
//					+ "headID.appendChild(newScript);");
//			WebDriverWait waitJQ = new WebDriverWait(driver, 30);
//			Function<WebDriver, Boolean> jQueryAvailable = WebDriver -> ((Boolean) js
//					.executeScript("return (typeof jQuery != \"undefined\")"));
//			waitJQ.until(jQueryAvailable);
//		}

		// Screenshot Screenshot = new
		// AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
		// .takeScreenshot(driver, PDFViewer);

		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		BufferedImage fullScreen = ImageIO.read(Screenshot);
		Point location = PDFViewer.getLocation();

		int width = PDFViewer.getSize().getWidth();
		int height = PDFViewer.getSize().getHeight();
		BufferedImage logo_image = fullScreen.getSubimage(location.getX(), location.getY(), 876, 530);

		// 876 x 574.22

		ImageIO.write(logo_image, "png", Screenshot);
		FileUtils.copyFile(Screenshot, new File("/Users/johnny/Desktop/Selenium_img/screenshot02.png"));
		System.out.println("Screen Capture - Success");

		BufferedImage expectedImage = ImageIO.read(new File("/Users/johnny/Desktop//Selenium_img/screenshot01.png"));
		BufferedImage actualImage = logo_image;

		Thread.sleep(2000);

		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
		if (diff.hasDiff() == true) {
			System.out.println("이미지 비교 - Fail");
			driver.quit();

		} else {
			System.out.println("이미지 비교 - Pass");
		}

	}
}
