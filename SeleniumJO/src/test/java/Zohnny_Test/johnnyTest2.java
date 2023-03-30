package Zohnny_Test;

import java.io.IOException;
import java.lang.annotation.Repeatable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

public class johnnyTest2 {

	public class _1_Login extends _0_BaseTest {

		@TestRails(id = "")
		@Test(priority = 1, invocationCount = 1, enabled = false)
		@Parameters({ "signature_requester_email" })

		public void Zo2hhny2(@Optional String signature_requester_email) throws InterruptedException, IOException {

			ObjLoginPage.Login(signature_requester_email, "tlswnsdh2@@");

			Thread.sleep(2000);

			ObjGNB.Templates_btn();

//			ObjTempletePage.CreatTemplete_btn();
//
//			ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();
//
//			ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
//			ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
//			ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();

			ObjTempletePage.Templete_Dropdown_BulckRequest_select();

			// 파일 너무 빨리 올리면 에러 나와서 추가 해둠
			Thread.sleep(2000);
			ObjBulkRequestPage_StartPage.BulkRequest_ExcelUpload_btn_m(
					"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.E2E_OnCase.xlsx");

			ObjBulkRequestPage_SendPage.Preview_btn();

			ObjBulkRequestPage_SendPage.TestSend_btn();

			ObjBulkRequestPage_SendPage.TestSend_EmailandPhoneNumber_input_m();

			ObjBulkRequestPage_SendPage.Modal_TestSend_btn();

			ObjBulkRequestPage_SendPage.Modal_TestSend_Check();

		}

	}

}