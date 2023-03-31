package Test_BulkRequest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test.TestBase;
import Testrail_client.Testrails.TestRails;

@Ignore
public class Templete_BulkRequest_TestSend extends TestBase {

	@TestRails(id = "")
	@Test(priority = 1, invocationCount = 10, enabled = true)
	@Parameters({ "signature_requester_email" })

	public void Templete_BulkRequest_TestSend(@Optional String signature_requester_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login_m("joshinauto1@getnada.com", "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjGNB.Settings_btn();

		ObjSettingsPage_PricingPaymentPage.Remaining_Usage_Tab_btn();

		String actual = ObjSettingsPage_PricingPaymentPage.Get_Remaining_Usage_Signature_Request_Check();

		ObjGNB.Templates_btn();

		ObjTempletePage.CreatTemplete_btn();

		ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();

		ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
		ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
		ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();

		ObjTempletePage.Templete_Dropdown_BulckRequest_select();

		// 파일 너무 빨리 올리면 에러 나와서 추가 해둠
		Thread.sleep(3000);
		ObjBulkRequestPage_StartPage.BulkRequest_ExcelUpload_btn_m(
				"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.E2E_DefaultCase.xlsx");

		// 미리보기 들어간 후에 테스트 전송 까지 진행 
		ObjBulkRequestPage_SendPage.Preview_btn();
		ObjBulkRequestPage_SendPage.TestSend_btn();
		ObjBulkRequestPage_SendPage.TestSend_EmailandPhoneNumber_input_m("joshin3@getnada.com");

		ObjBulkRequestPage_SendPage.Modal_TestSend_btn();
		ObjBulkRequestPage_SendPage.Modal_TestSend_Check();
		ObjBulkRequestPage_SendPage.Modal_TestSend_Modal_btn();
		ObjBulkRequestPage_SendPage.Modal_TestSend_PageOut_btn();
		ObjBulkRequestPage_SendPage.SendPage_Out_btn();

		// 다시 설정 가서 차감 확인
		Thread.sleep(2000);

		ObjGNB.Settings_btn();

		ObjSettingsPage_PricingPaymentPage.Remaining_Usage_Tab_btn();

		String expect = ObjSettingsPage_PricingPaymentPage.Get_Remaining_Usage_Signature_Request_Check();

		Assert.assertEquals(actual, expect);

		Thread.sleep(3000);
	}

}
