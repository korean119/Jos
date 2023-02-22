package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PagesObject._1_LoginPage;
import PagesObject._2_MainPage;
import Testrail_client.Testrails.TestRails;


public class _2_MainScreen extends _0_BaseTest {
	
	@TestRails (id = "7928")
	@Test 
	public void EnterContractSetupStart() throws InterruptedException, IOException {
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		objMainPage.DocumentListItem();
		objMainPage.DropdownMenuRow();
	
		
		Thread.sleep(2000);
		objMainPage.ElementCapture();
		

		
	}
}
	

