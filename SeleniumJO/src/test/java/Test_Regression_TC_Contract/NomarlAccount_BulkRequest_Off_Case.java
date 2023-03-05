package Test_Regression_TC_Contract;

import org.testng.annotations.Test;

import Test.BaseTest;
import Testrail_client.Testrails.TestRails;


public class NomarlAccount_BulkRequest_Off_Case extends BaseTest {
	
	@TestRails (id = "")
	@Test (priority = 1)
	
	public void NomarlAccount_NormalSign_Off_Case() throws InterruptedException {

		objLoginPage.Login("joshin2@getnada.com", "tlswnsdh2@@");

		objGNB.get();
		
		objGNB.Templates_btn();
		
		objTempletePage.CreatTemplete_btn();
		
		objDomcumentUploadModal.Contract_sample_select_BulkRequest();
		
		objTempletePage_CreatTemplete.NomarlAccount_BulkRequest_Off_Case();
		
		objTempletePage.NomarlAccount_BulkRequest_Off_Case();
		
		objTempletePage_Bulkreques.NomarlAccount_BulkRequest_Off_Case();
		
	}
}

	