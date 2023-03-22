package Zohnny_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;

public class johnnyTest {

	public class _1_Login extends _0_BaseTest {

		@Test(enabled = false)
		public void Zo2hhny21(@Optional String Signatory_1_email,
				@Optional String Signatory_2_name, @Optional String Signatory_2_email) throws InterruptedException {

			ObjLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");

			Thread.sleep(2000);
			ObjGNB.get();

			ObjGNB.Templates_btn();

			ObjTempletePage.CreatTemplete_btn();

			ObjDomcumentUpload_Modal.Templete_Contract_SampleDocselect();

			ObjTempletePage_CreateTempleteStep1Page.Templete_Request_Step1Page_Case("qdqd");

			ObjContractSetup_Step2page.NormalSign_On_Case_Sonny(); 
		
			
			ObjContractSetup_Step2page.NormalSign_On_Case_Sonny2(); 
			

			Thread.sleep(2000);
		}

	}
}
