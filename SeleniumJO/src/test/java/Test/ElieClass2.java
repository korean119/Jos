package Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Testrail_client.Testrails.TestRails;



public class ElieClass2 extends _0_BaseTest {

	@Test
	
	public void ruru2() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin4@getnada.com", "tlswnsdh2@@");

		objMainPage.DocumentListItem();
		objMainPage.DropdownMenuRow();
		Thread.sleep(2000);
		objMainPage.ElementCapture();
		
	}
}
