package Test_Regression_TC;

import org.testng.annotations.Test;

import Test._0_BaseTest;
import Testrail_client.Testrails.TestRails;
import junit.framework.Assert;

public class DocumentsPage extends _0_BaseTest {
	
	
	
	@Test
	public void GNB() throws InterruptedException {

		ObjLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");

		ObjGNB.Externaldocuments_btn();
		
		ObjGNB.Templates_btn();
		
		ObjGNB.Archived_documents_btn();
		
		ObjGNB.Bulkrequests_btn();
		
		ObjGNB.Linksignature_btn();

		ObjGNB.Approvals_btn();
		
		ObjGNB.Editing_documents_btn();
		
		ObjGNB.Signatures_btn();
		
		ObjGNB.Drafts_btn();
		
		//objGNB.Blank_btn();
		
		ObjGNB.Settings_btn();
		
		ObjGNB.Documents_btn();
		
		Thread.sleep(5000);
		
	}
}
	