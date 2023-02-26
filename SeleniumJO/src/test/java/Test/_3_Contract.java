package Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Testrail_client.Testrails.TestRails;



public class _3_Contract extends _0_BaseTest {

	
	@TestRails (id = "7929")
	@Test
	public void Contract() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		objGNB.ContractSetupStart_btn();
		objContractSetupStartModalPopup.Modal();
		objContractSetup_Step1page.ContractSetup_Step1page_Setup();
		objContractSetup_Step2page.ContractSetup_Step2page_Setup_BaseScript();
		objContractSetup_Step3page.ContractSetup_Step3page_Setup_Quick("자동화 테스트 입니다.");
			
		
	}
}
