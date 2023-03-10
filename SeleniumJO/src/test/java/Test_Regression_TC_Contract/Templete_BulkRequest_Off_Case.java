package Test_Regression_TC_Contract;

import java.io.IOException;

import org.testng.annotations.Test;

import POM_05_BulkRequestPage.BulkRequestPage_StartPage;
import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;


public class Templete_BulkRequest_Off_Case extends _0_BaseTest {
	
	@TestRails (id = "")
	@Test (priority = 1)
	public void NomarlAccount_BulkRequest_Off_Case() throws InterruptedException {

		ObjLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");

		ObjGNB.get();
		
		Thread.sleep(2000);
		
		ObjGNB.Templates_btn();
		
		ObjTempletePage.CreatTemplete_btn();
		
		ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();
		
		ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
		ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
		ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();
		
		Thread.sleep(2000);
		
		ObjTempletePage.Templete_Dropdown_select();
		
		ObjBulkRequestPage_StartPage.NomarlAccount_BulkRequest_Off_Case();
		
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

	