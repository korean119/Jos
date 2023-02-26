package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Testrail_client.Testrails.TestRails;

public class Testclass  extends _0_BaseTest {
		
		@TestRails (id = "7928")
		@Test 
		public void EnterContractSetupStart() throws InterruptedException, IOException {
			objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
			objGNB.ContractSetupStart_btn();
			
			objContractSetupStartModalPopup.Modal();
			
			objContractSetup_Step1page.Signertory1_email_del();
			
			objContractSetup_Step1page.Signatory1_email_input_clearandinput("johnny5@getnada.com");
			
			objContractSetup_Step1page.Signatory2_name_input("조니4");
			
			objContractSetup_Step1page.Signatory2_email_btn();
			
			objContractSetup_Step1page.Signatory2_email_input("joshin4@getnada.com");
			
			objContractSetup_Step1page.Next_btn();
			
			objContractSetup_Step2page.ContractSetup_Step2page_Setup_BaseScript();
			
			objContractSetup_Step3page.DocumentModification__filename_edit_btn();
	
			objContractSetup_Step3page.DocumentModification__filename_Textarea_Clearandinput("Automation_Test");
			
			objContractSetup_Step3page.DocumentModification_filename_editdone();
			
			objContractSetup_Step3page.Settingdone_btn();
			
			objContractSetup_Step3page.Agreementcheck1_checkbox();
		
			objContractSetup_Step3page.Agreementcheck2_checkbox();
			
			objContractSetup_Step3page.Requestsignature_btn();
			
			}
}


	



