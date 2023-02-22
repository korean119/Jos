package Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Testrail_client.Testrails.TestRails;



public class ElieClass3 extends _0_BaseTest {

	@Test
	public void ruru3() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin5@getnada.com", "tlswnsdh2@@");

		objMainPage.DocumentListItem();
		objMainPage.DropdownMenuRow();
		objMainPage.ElementCapture2();
		
	
	}
}

