package Test;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Testrail_client.Testrails.TestRails;

@Listeners(Listener.ListenerTest.class)

public class Contract extends _0_BaseTest {

	@TestRails(id = "12562")
	@Test (priority = 1)
	public void Signature_request() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		objGNB.ContractSetupStart_btn();
		objContractSetupStartModalPopup.Modal();
		
		
		objContractSetup_Step1page.Signatory2_name_input("조니");
		
		objContractSetup_Step1page.Signatory2_email_input("joshin5@getnada.com");
		Thread.sleep(2000);
		objContractSetup_Step1page.Signatory1_email_input_clearandinput("joshin4@getnada.com");
		
		objContractSetup_Step1page.Next_btn();
		objContractSetup_Step2page.ContractSetup_Step2page_Setup_BaseScript();
		objContractSetup_Step3page.ContractSetup_Step3page_Setup_Quick("자동화 테스트 입니다.");
		
	}
	
	@Test (priority = 2, description = "서명 요청자 A가 서멍자 B,C 에게 서명 요청 후 서명자 B,C 서명 진행")
	public void Signatory1_Sign() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin4@getnada.com", "tlswnsdh2@@");

		objDocumentsPage.DocumentListItem1();
		
		objDocumentsPage.DropdownMenuRow();
		
		objContractPage.SignatureStart_btn();
		
		objContractPage.ElementCapture();
		
		objContractPage.Signaturesub_menu_btn();
		
		objContractPage.Mysign_image_1_btn();
		
		objContractPage.Image_confirmOK_btn();
		
		objContractPage.WritableTextFieldCore_btn();
		
		objContractPage.TextFieldTextarea("테스트입니다");
		
		objContractPage.InputDone_btn();
		
		objContractPage.AgreeandSign_btn();
		
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 3)
	public void Signatory2_Sign() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin5@getnada.com", "tlswnsdh2@@");

		objDocumentsPage.DocumentListItem1();
		
		objDocumentsPage.DropdownMenuRow();
		
		objContractPage.SignatureStart_btn();
		
		objContractPage.CheckDone_btn();
		
		objContractPage.AgreeandSign_btn();
		
		Thread.sleep(2000);
		
	}
}