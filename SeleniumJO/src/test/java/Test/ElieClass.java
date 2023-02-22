package Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Testrail_client.Testrails.TestRails;

@Listeners(Listener.ListenerTest.class)

public class ElieClass extends _0_BaseTest {

	@Test
	public void ruru() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		objMainPage.EnterContractSetupStart();
		objContractSetupStartModalPopup.Modal();
		
		
		objContractSetup_Step1page.ContractSetup_signatoryName_Btn("조니");
		objContractSetup_Step1page.ContractSetup_signatoryEmail_Btn("joshin5@getnada.com");
		Thread.sleep(2000);
		objContractSetup_Step1page.signerEmail1();
		objContractSetup_Step1page.signerEmail2("joshin4@getnada.com");
		
		objContractSetup_Step1page.Next_btn();
		objContractSetup_Step2page.ContractSetup_Step2page_Setup();
		objContractSetup_Step3page.ContractSetup_Step3page_Setup();
		
	}
	
}
