package Test_BulkRequest;

import java.io.IOException;

import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_05_BulkRequestPage.BulkRequestPage_StartPage;
import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

//@Ignore
public class Templete_BulkRequest_FailCase extends _0_BaseTest {

	@TestRails(id = "")
	@Test(priority = 1, enabled = true)
	@Parameters({ "signature_requester_email" })

	public void Templete_BulkRequest_FailCase(@Optional String signature_requester_email)
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
				"/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.FailCase.xlsx");
		// "/Users/johnny/Desktop/Selenium_img/BulkRequset/Bulkrequest_Automation/Bulkrequest.Automation.DefaultCase.xlsx");

		ObjBulkRequestPage_StartPage
				.Validation_Phone_Text("I3 휴대폰본인인증\n" + "전화번호\n" + "휴대폰 본인인증을 설정하려면 이름과 전화번호를 함께 입력해 주세요.");

		ObjBulkRequestPage_StartPage
				.Validation_Name_Text("H4 휴대폰본인인증\n" + "이름\n" + "휴대폰 본인인증을 설정하려면 이름과 전화번호를 함께 입력해 주세요.");

		ObjBulkRequestPage_StartPage.Validation_CorporationNumber_Text(
				"K5 법인공동인증서\n" + "사업자등록번호\n" + "법인공동인증서 인증을 설정하려면 법인명과 사업자등록번호를 함께 입력해 주세요.");

		ObjBulkRequestPage_StartPage.Validation_CorporationName_Text(
				"J6 법인공동인증서\n" + "법인명\n" + "법인공동인증서 인증을 설정하려면 법인명과 사업자등록번호를 함께 입력해 주세요.");

		ObjBulkRequestPage_StartPage
				.Validation_CompletePassword_Text("L7 완료시 문서/파일\n" + "잠금 비밀번호\n" + "완료문서 잠금 비밀번호는 8자~32자로 설정해주세요.");

		ObjBulkRequestPage_StartPage
				.Validation_CC_Text("M8 참조자\n" + "올바른 이메일 또는 휴대폰 번호를 입력해 주세요. 여러명일 경우 ','로 구분해 주세요.");

		// 전송 대기가 없어지는걸 확인 해야할지도 = 가끔 전송완료 되었어도 전송대기로 남아 있는 경우가 있음

	}
}
