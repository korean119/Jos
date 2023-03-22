package Test_BulkRequest;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_05_BulkRequestPage.BulkRequestPage_StartPage;
import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

public class Templete_BulkRequest_E2E_DefaultCase extends _0_BaseTest {

	@TestRails(id = "")
	@Test(priority = 1, enabled = true)
	@Parameters({ "signature_requester_email" })

	public void Templete_BulkRequest_E2E_DefaultCase(@Optional String signature_requester_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(signature_requester_email, "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjGNB.Templates_btn();

		ObjTempletePage.CreatTemplete_btn();

		ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();

		ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
		ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
		ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();

		ObjTempletePage.Templete_Dropdown_BulckRequest_select();

		// 파일 너무 빨리 올리면 에러 나와서 추가 해둠
		Thread.sleep(2000);
		ObjBulkRequestPage_StartPage.BulkRequest_ExcelUpload_btn_m(
				"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.E2E_DefaultCase.xlsx");

		ObjBulkRequestPage_SendPage.BulkRequest_Send_m();

		ObjBulkRequestPage_SendPage.BulkRequest_StatusDone_Check();

		// ObjBulkRequestPage_SendPage.BulkRequest_DoneModal_confirm_btn();

	}

	@TestRails(id = "")
	@Test(priority = 2, enabled = false)
	@Parameters({ "Signatory_1_email" })
	public void Templete_BulkRequest_E2E_DefaultCase_Singatory_1_(@Optional String Signatory_1_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_1_email, "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage_ContractPage.NomarlAccount_NormalSign_Off_Case("텍스트 입력 필드");

	}

}
