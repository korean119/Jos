package Test_Contract_6Status;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;
import junit.framework.Assert;

public class BaseScript_3_CancelSign extends _0_BaseTest {
	
	// 서명자(본인), 서명 요청자 에게 서명 요청 
	@Test (priority = 1)
	public void BaseScript() throws InterruptedException {

		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		
		objGNB.get();

		objGNB.ContractSetupStart_btn();
		
		objContractSetupStartModal.Modal_BascScript();
		
		
		// 서명자1 이메일, 서명자2 이름 , 서명자2 이메일
		objContractSetup_Step1page.ContractSetup_Step1page_Setup_Quick("joshin4@getnada.com", "조니4", "joshin5@getnada.com");
		
		
		objContractSetup_Step2page.ContractSetup_Step2page_Setup_BaseScript();
		
		// 문서 이름
		objContractSetup_Step3page.ContractSetup_Step3page_Setup_Quick("BaseScript_1 생성");
		
		Thread.sleep(3000);
		
		objGNB.get();	
	}

//	// 서명자 서명 후 서명 취소 
//	@Test(priority = 2)
//	public void BaseScript2() throws InterruptedException, IOException {
//
//		objLoginPage.Login("joshin4@getnada.com", "tlswnsdh2@@");
//
//		objDocumentsPage.Doucment_Dropdown_BaseScript();
//
//		objContractPage.Contract_BaseScript("BaseScript");
//		
//		objDocumentsPage.Doucment_Dropdown_BaseScript2("자동화 서명 취소");
//
//	}

//	// 서명 요청자 서명
//	@Test(priority = 3)
//	public void BaseScript3() throws InterruptedException, IOException {
//
//		objLoginPage.Login("joshin5@getnada.com", "tlswnsdh2@@");
//
//		objDocumentsPage.Doucment_Dropdown_BaseScript();
//
//		objContractPage.Contract_BaseScript("BaseScript");
//
//	}
//}
}
