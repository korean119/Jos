package Test_Basic;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Test.TestBase;
import Testrail_client.Testrails.TestRails;
import junit.framework.Assert;

public class GNB extends TestBase {

	@Test(priority = 1, enabled = false)
	public void GNB() throws InterruptedException {

		// safari, firefox에서 안됬어서
		// GNB 잘 되는지 테스트용
		ObjLoginPage.Login_m("joshin1@getnada.com", "tlswnsdh2@@");

		ObjGNB.get();

		ObjGNB.Externaldocuments_btn();

		ObjGNB.Templates_btn();

		ObjGNB.Archived_documents_btn();

		ObjGNB.Bulkrequests_btn();

		ObjGNB.Linksignature_btn();

		ObjGNB.Approvals_btn();

		ObjGNB.Editing_documents_btn();

		ObjGNB.Signatures_btn();

		ObjGNB.Drafts_btn();

		// objGNB.Blank_btn();

		ObjGNB.Settings_btn();

		ObjGNB.Documents_btn();

	}
}
