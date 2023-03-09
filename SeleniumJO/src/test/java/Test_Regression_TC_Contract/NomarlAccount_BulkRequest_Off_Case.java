package Test_Regression_TC_Contract;

import java.io.IOException;

import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;


public class NomarlAccount_BulkRequest_Off_Case extends _0_BaseTest {
	
	@TestRails (id = "")
	@Test (priority = 1)
	public void NomarlAccount_BulkRequest_Off_Case() throws InterruptedException {

		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");

		objGNB.get();
		
		Thread.sleep(2000);
		
		objGNB.Templates_btn();
		
		objTempletePage.CreatTemplete_btn();
		
		objDomcumentUploadModal.Contract_sample_select_BulkRequest();
		
		objTempletePage_CreatTemplete.NomarlAccount_BulkRequest_Off_Case();
		
		objTempletePage.NomarlAccount_BulkRequest_Off_Case();
		
		objTempletePage_Bulkreques.NomarlAccount_BulkRequest_Off_Case();
		
		Thread.sleep(3000);
		
	}
}

	
//	@Test 
//	public void NomarlAccount_BulkRequest_Off_Case2() throws InterruptedException, IOException {
//
//		objLoginPage.Login("joshin6@getnada.com", "tlswnsdh2@@");
//
//		objGNB.get();
//
//		objDocumentsPage.Doucment_Dropdown_BaseScript();
//		
//		objDocumentsPage_ContractPage.Namgilmal_btn();
//		
//		
//		objDocumentsPage_ContractPage.password_input("1234");
//		
//		// 아씨 뭐얌 여기 확인하는거 아직 안 넣었넹 
//	}
//}

	