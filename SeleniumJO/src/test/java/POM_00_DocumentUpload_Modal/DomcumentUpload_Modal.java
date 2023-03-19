package POM_00_DocumentUpload_Modal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM_00_BasePage.BasePage;


public class DomcumentUpload_Modal extends BasePage {

	public DomcumentUpload_Modal(WebDriver driver) {
		super(driver);

	}
	
	
	// 클라우드 저장소 
	// 문서 업로드 모달 > 클라우드 저장 버튼 
	@FindBy(name = ("CLOUD_DRIVE"))
	WebElement CLOUD_DRIVE_Btn;
	
	public void CLOUD_DRIVE_Btn() throws InterruptedException {
			Wait.until(ExpectedConditions.visibilityOf(CLOUD_DRIVE_Btn)).click();
		}
		

	// 클라우드 저장소 > 구글 드라이브 버튼 
	@FindBy(xpath = ("//button[normalize-space()='Google Drive']"))
	WebElement CLOUD_DRIVE_btn_Confirm;
	
	public void CLOUD_DRIVE_btn_Confirm() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(CLOUD_DRIVE_btn_Confirm)).click();
	
	}
	

	// 내 컴퓨터 
	// 문서 업로드 모달 > 내 컴퓨터 버튼 
	@FindBy(name = ("LOCAL"))
	WebElement Local_Btn;
	
	public void LOCAL_Btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Local_Btn)).click();
	
	}

	// 내 컴퓨터 버튼 > 파일 찾기 버튼 
	@FindBy(xpath = ("//button[contains(text(),'파일 찾기')]"))
	WebElement Local_FileSearch_btn;

	public void Local_FileSearch() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(Local_FileSearch_btn)).click();
	
	}

	// 계약서 샘플 버튼 
	@FindBy(name = ("SAMPLE_DOCUMENTS"))
	WebElement SampleDocuments_Btn;

	public void Sample_Documents_Btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SampleDocuments_Btn)).click();
	
	}

	// 계약서 샘플 > 첫 번째 문서 
	@FindBy(css = (".UpLoadModalSampleDocuments__title:nth-child(2) > .UpLoadModalSampleDocuments__button"))
	WebElement SapmleDocuments_UploadDoc_1_btn;

	public void Sapmle_DocumentsUploadDoc_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SapmleDocuments_UploadDoc_1_btn)).click();
	
	}

	
	// 계약서 샘플 > [업로드] 버튼
	@FindBy(css = (".css-1uzrp8i"))
	WebElement SampleDocuments_Upload_btn;

	public void SampleDocuments_Upload_btn() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(SampleDocuments_Upload_btn)).click();
	
	}

	
/////////////////////////////////////////////////////////////////////

	// 서명 요청 시작하기 모달 
	// 서명 요청 시작하기 모달 > [확인하고 시작하기] 버튼 
	@FindBy(css = (".css-elq43k"))
	WebElement ContractStart_CheckandStart;

	public void ContractStart_CheckandStart() throws InterruptedException {
		Wait.until(ExpectedConditions.visibilityOf(ContractStart_CheckandStart)).click();
	
	}

	
/////////////////////////////////////////////////////////////////////
	

		
	// 거의 대부분의 계약서 생성에 사용
	public void Contract_SampleDoc_select() throws InterruptedException {
		SampleDocuments_Btn.click();
		SapmleDocuments_UploadDoc_1_btn.click();
		SampleDocuments_Upload_btn();
		ContractStart_CheckandStart();
		
	}
	
	// 템플릿 생성에 사용 
	public void Templete_Contract_SampleDocselect() throws InterruptedException {
		SampleDocuments_Btn.click();
		SapmleDocuments_UploadDoc_1_btn.click();
		SampleDocuments_Upload_btn.click();
		
	}
}