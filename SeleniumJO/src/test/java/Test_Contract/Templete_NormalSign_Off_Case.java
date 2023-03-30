package Test_Contract;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;
import junit.framework.Assert;

public class Templete_NormalSign_Off_Case extends _0_BaseTest {
	
	

	@TestRails (id = "16286")
	@Test (priority = 1, enabled = true)
	@Parameters({ "signature_requester_email", "Signatory_1_email", "Signatory_2_name", "Signatory_2_email"})
	
	public void NormalSign_Off_Case(@Optional String signature_requester_email,  @Optional String Signatory_1_email, @Optional String Signatory_2_name,
			@Optional String Signatory_2_email) throws InterruptedException {

		ObjLoginPage.Login(signature_requester_email, "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjGNB.Templates_btn();
		
		ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();
		
		ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("자동화서명");
		ObjTempletePage_CreateTempleteStep2Page.Templete_Request_Step2Page_Off_Case();
		ObjTempletePage_CreateTempleteStep3Page.Templete_Request_Step3Page_Off_Case();


		ObjContractSetup_Step1page.NormalSign_OnandOff_Case(Signatory_1_email, Signatory_2_name, Signatory_2_email);
		
		ObjContractSetup_Step2page.NormalSign_Off_Case();
		
		ObjContractSetup_Step3page.NomarlAccount_NormalSign_Off_Case();
		
		Thread.sleep(2000);
		
	}
	
	@TestRails (id = "16287")
	@Test (priority = 2, enabled = true)
	@Parameters({"Signatory_1_email"})
	
	public void NomarlAccount_NormalSign_Off_Case_Signatory_1_(
			@Optional String Signatory_1_email) throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_1_email, "tlswnsdh2@@");
		
		Thread.sleep(2000);
		
		ObjDocumentsPage.Documents_Dropdown_1_select();
		
		ObjDocumentsPage_ContractPage.NomarlAccount_NormalSign_Off_Case("텍스트 입력 필드");
		
		Thread.sleep(2000);
	}
	
	
	@TestRails (id = "16288")
	@Test (priority = 3, enabled = true)
	@Parameters({"Signatory_2_email"})
	
	public void NomarlAccount_NormalSign_Off_Case_Singatory_2_(
			@Optional String Signatory_2_email) throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_2_email, "tlswnsdh2@@");
		
		Thread.sleep(2000);
		
		ObjDocumentsPage.Documents_Dropdown_1_select();

		ObjDocumentsPage_ContractPage.NomarlAccount_NormalSign_Off_Case("텍스트 입력 필드");
		
		Thread.sleep(2000);
	}
}
	