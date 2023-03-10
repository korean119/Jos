package Test_Regression_TC_Contract;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_05_BulkRequestPage.BulkRequestPage_StartPage;
import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

public class Templete_BulkRequest_DefaultCase extends _0_BaseTest {

	@TestRails(id = "")
	@Test
	@Parameters({ "signature_requester_email" })

	public void Templete_BulkRequest_DefaultCase(@Optional String signature_requester_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(signature_requester_email, "tlswnsdh2@@");

		ObjGNB.get();
		
		Thread.sleep(1000);

		ObjGNB.Templates_btn();

//		ObjTempletePage.CreatTemplete_btn();

//		ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();
//
//		ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
//		ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
//		ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();

		ObjTempletePage.Templete_Dropdown_BulckRequest_select();

		ObjBulkRequestPage_StartPage.BulkRequest_ExcelUpload_btn_m(
				"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.previous.xlsx");
				//"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.DefaultCase.xlsx");

		ObjBulkRequestPage_SendPage.BulkRequest_Send_m();

		ObjBulkRequestPage_SendPage.BulkRequest_DoneModal_confirm_btn();

		Thread.sleep(3000);

	}

	@TestRails(id = "")
	@Test
	@Parameters({ "Signatory_2_email" })
	public void Templete_BulkRequest_DefaultCase_Singatory_1_(@Optional String Signatory_2_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_2_email, "tlswnsdh2@@");

		ObjGNB.get();
		
		Thread.sleep(1000);

		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage_ContractPage.NomarlAccount_NormalSign_Off_Case("텍스트 입력 필드");

		Thread.sleep(2000);
	}

}
