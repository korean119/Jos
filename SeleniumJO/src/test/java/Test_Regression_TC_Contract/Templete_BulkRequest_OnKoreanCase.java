package Test_Regression_TC_Contract;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

public class Templete_BulkRequest_OnKoreanCase extends _0_BaseTest {

	
	@TestRails(id = "")
	@Test (priority = 1)
	@Parameters({ "signature_requester_email" })
	public void Templete_BulkRequest_OnCase(@Optional String signature_requester_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(signature_requester_email, "tlswnsdh2@@");

		ObjGNB.get();
		
		Thread.sleep(1000);

		ObjGNB.Templates_btn();

		ObjTempletePage.CreatTemplete_btn();

		ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();

		ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
		ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
		ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();

		ObjTempletePage.Templete_Dropdown_BulckRequest_select();

		ObjBulkRequestPage_StartPage.BulkRequest_ExcelUpload_btn_m(
				"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.previous.xlsx");
				//"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.DefaultCase.xlsx");

		ObjBulkRequestPage_SendPage.BulkRequest_Send_m();

		Thread.sleep(5000);
		// 완료 모달 팝업 왜 안나오지 3/13 나올때 안올때가 있넹
		//ObjBulkRequestPage_SendPage.BulkRequest_DoneModal_confirm_btn();

		Thread.sleep(3000);

	}


	@TestRails(id = "")
	@Test (priority = 2)
	@Parameters({ "Signatory_2_email" })
	public void Templete_BulkRequest_DefaultCase_Singatory_1_(@Optional String Signatory_2_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_2_email, "tlswnsdh2@@");

		ObjGNB.get();
		
		Thread.sleep(1000);

		ObjDocumentsPage.Documents_Dropdown_1_select();
		
		ObjDocumentsPage_ContractPage.Namgilma_Modal_Text_Assert("1111");
		ObjDocumentsPage_ContractPage.Namgilma_Modal_btn();

		ObjDocumentsPage_ContractPage.PasswordHint_Text_Assert("암호 힌트 : 신준오");
		ObjDocumentsPage_ContractPage.Password_input("asasd");
		ObjDocumentsPage_ContractPage.Password_OK_btn();
		
		ObjDocumentsPage_ContractPage.Step2Page_BasicinputCase_m();
		
		Thread.sleep(2000);
		
		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage.Contract_DonePage_Password_input("12341234");
		
		
	}

}