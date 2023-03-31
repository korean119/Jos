package Test_Contract;

import java.io.IOException;

import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test.TestBase;
import Testrail_client.Testrails.TestRails;


//@Ignore
public class NormalSign_Off_Case extends TestBase {

	@TestRails(id = "16286")
	@Test(priority = 1, enabled = true)
	@Parameters({ "signature_requester_email", "Signatory_1_email", "Signatory_2_name", "Signatory_2_email" })

	public void NormalSign_Off_Case(@Optional String signature_requester_email,  @Optional String Signatory_1_email, @Optional String Signatory_2_name,
			@Optional String Signatory_2_email) throws InterruptedException {

		ObjLoginPage.Login_m(signature_requester_email, "tlswnsdh2@@");

		Thread.sleep(2000);

		ObjGNB.ContractSetupStart_btn();

		ObjDomcumentUpload_Modal.Contract_SampleDoc_select();

		ObjContractSetup_Step1page.NormalSign_OnandOff_Case(Signatory_1_email, Signatory_2_name,
				Signatory_2_email);

		ObjContractSetup_Step2page.NormalSign_Off_Case();

		ObjContractSetup_Step3page.NomarlAccount_NormalSign_Off_Case();

		Thread.sleep(2000);

	}

	@TestRails(id = "16287")
	@Test(priority = 2, enabled = true)
	@Parameters({ "Signatory_1_email" })

	public void NormalSign_Off_Case_Signatory_1_(@Optional String Signatory_1_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login_m(Signatory_1_email, "tlswnsdh2@@");

		Thread.sleep(2000);
		
		ObjDocumentsPage.ContractStatus_Check();

		ObjDocumentsPage.Documents_Dropdown_1_select_m();

		ObjDocumentsPage_ContractPage.NormalSign_Off_Case("텍스트 입력 필드");

		Thread.sleep(2000);
	}

	@TestRails(id = "16288")
	@Test(priority = 3, enabled = true)
	@Parameters({ "Signatory_2_email" })

	public void NormalSign_Off_Case_Singatory_2_(@Optional String Signatory_2_email)
			throws InterruptedException, IOException {

		ObjLoginPage.Login_m(Signatory_2_email, "tlswnsdh2@@");

		Thread.sleep(2000);
		
		ObjDocumentsPage.ContractStatus_Check();

		ObjDocumentsPage.Documents_Dropdown_1_select_m();

		ObjDocumentsPage_ContractPage.NormalSign_Off_Case("텍스트 입력 필드");

		Thread.sleep(3000);
		
		ObjDocumentsPage.ContractStatus_Check2();

	}
}
