package Test_Regression_TC_Contract;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;
import junit.framework.Assert;

public class NormalSign_On_Case extends _0_BaseTest {
	
	
	@TestRails (id = "16289")
	@Test (priority = 1)
	@Parameters({ "Signatory_1_email", "Signatory_2_name", "Signatory_2_email"})
	
	public void NomarlAccount_NormalSign_On_Case(
			@Optional String Signatory_1_email, @Optional String Signatory_2_name, @Optional String Signatory_2_email) throws InterruptedException {

		ObjLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		
		ObjGNB.get();

		ObjGNB.ContractSetupStart_btn();
		
		ObjDomcumentUpload_Modal.Contract_SampleDoc_select();
		
		ObjContractSetup_Step1page.NomarlAccount_NormalSign_OnandOff_Case(Signatory_1_email, Signatory_2_name, Signatory_2_email);
		
		ObjContractSetup_Step2page.NomarlAccount_NormalSign_On_Case("첨부파일 올려주세요");
		
		ObjContractSetup_Step3page.NomarlAccount_NormalSign_On_Case("NomarlAccount_NormalSign_On_Case", "12341234", "joshin1@getnada.com", "메롱", "1234");
		
		
		Thread.sleep(2000);
	}
	
	
	@TestRails (id = "16290")
	@Test (priority = 2)
	@Parameters({ "Signatory_1_email"})
	
	public void NomarlAccount_NormalSign_On_Case_Singatory_1_(
			@Optional String Signatory_1_email) throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_1_email, "tlswnsdh2@@");

		ObjDocumentsPage.Documents_Dropdown_1_select();
		
		ObjDocumentsPage_ContractPage.NomarlAccount_NormalSign_On_Case("1234", "텍스트필드 입력");
		
		Thread.sleep(2000);
		
	}

	
	@TestRails (id = "16291")
	@Test (priority = 3)
	@Parameters({ "Signatory_2_email"})
	
	public void NomarlAccount_NormalSign_On_Case_Singatory_2_(
			@Optional String Signatory_2_email) throws InterruptedException, IOException {

		ObjLoginPage.Login(Signatory_2_email, "tlswnsdh2@@");
		
		ObjGNB.get();

		ObjDocumentsPage.Documents_Dropdown_1_select();
		
		ObjDocumentsPage_ContractPage.NomarlAccount_NormalSign_On_Case("1234", "텍스트필드 입력");
		
		Thread.sleep(2000);
	}
}
	