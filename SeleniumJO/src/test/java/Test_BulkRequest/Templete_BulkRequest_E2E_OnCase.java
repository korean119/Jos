package Test_BulkRequest;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

public class Templete_BulkRequest_E2E_OnCase extends _0_BaseTest {

	@TestRails(id = "")
	@Test(priority = 1, enabled = true)
	@Parameters({ "signature_requester_email" })
	public void Templete_BulkRequest_E2E_OnCase(@Optional String signature_requester_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(signature_requester_email, "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjGNB.Templates_btn();

		ObjTempletePage.CreatTemplete_btn();

		ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();

		ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
		ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
		ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();

		Thread.sleep(3000);

		driver.navigate().refresh();
		ObjTempletePage.Templete_Dropdown_BulckRequest_select();

		// 파일 너무 빨리 올리면 에러 나와서 추가 해둠
		Thread.sleep(2000);
		ObjBulkRequestPage_StartPage.BulkRequest_ExcelUpload_btn_m(
				"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.E2E_OnCase.xlsx");

		ObjBulkRequestPage_SendPage.BulkRequest_Send_m();

		ObjBulkRequestPage_SendPage.BulkRequest_StatusDone_Check();

		Thread.sleep(3000);
		// 완료 모달 팝업 왜 안나오지 3/13 나올때 안올때가 있넹
		// ObjBulkRequestPage_SendPage.BulkRequest_DoneModal_confirm_btn();

	}

	@TestRails(id = "")
	@Test(priority = 2, enabled = true)
	@Parameters({ "Signatory_1_email" })
	public void Templete_BulkRequest_E2E_OnCase_Singatory_1_(@Optional String Signatory_1_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_1_email, "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage_ContractPage.Namgilmal_Modal_Text_Assert("E2E 한국어 확인 남길말");
		ObjDocumentsPage_ContractPage.Namgilmal_Modal_btn();

		ObjDocumentsPage_ContractPage.PasswordHint_Text_Assert("암호 힌트 : 신준오");
		ObjDocumentsPage_ContractPage.Password_input("1111");
		ObjDocumentsPage_ContractPage.Password_OK_btn();

		ObjDocumentsPage_ContractPage.Step2Page_BasicinputCase_m();

		Thread.sleep(3000);

		driver.navigate().refresh();

		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage.Contract_DonePage_Password_input("12341234");

		ObjDocumentsPage.Contract_DonePage_Password_Done_btn();

	}

	@TestRails(id = "")
	@Test(priority = 3, enabled = true)
	@Parameters({ "Signatory_2_email" })
	public void Templete_BulkRequest_E2E_OnCase_Singatory_2_(@Optional String Signatory_2_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_2_email, "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage_ContractPage.Namgilmal_Modal_Text_Assert("E2E 영어 확인 남길말");
		ObjDocumentsPage_ContractPage.Namgilmal_Modal_btn();

		ObjDocumentsPage_ContractPage.PasswordHint_Text_Assert("암호 힌트 : 신준오");
		ObjDocumentsPage_ContractPage.Password_input("1111");
		ObjDocumentsPage_ContractPage.Password_OK_btn();

		ObjDocumentsPage_ContractPage.Step2Page_BasicinputCase_m();

		Thread.sleep(3000);

		driver.navigate().refresh();

		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage.Contract_DonePage_Password_input("12341234");

		ObjDocumentsPage.Contract_DonePage_Password_Done_btn();

	}

}