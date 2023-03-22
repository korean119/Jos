package Test_Regression_TC;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;
import junit.framework.Assert;

public class GNB extends _0_BaseTest {
	
	
	
	@Test(priority = 1, enabled = false)
	public void GNB() throws InterruptedException {

		ObjLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		
		ObjGNB.get();
		
		ObjGNB.Externaldocuments_btn();
		
		
		ObjGNB.Templates_btn();
		
		//objGNB.Archived_documents_btn();
		
		// objGNB.Bulkrequests_btn();
		
		ObjGNB.Linksignature_btn();
		
		
		ObjGNB.Approvals_btn();
		
		
		
    	ObjGNB.Editing_documents_btn();
    	
    	
    	
		ObjGNB.Signatures_btn();
	
		
		
		ObjGNB.Drafts_btn();

		
		//objGNB.Blank_btn();
		
		ObjGNB.Settings_btn();
		
		ObjGNB.Documents_btn();
		

		
	}
}
	

