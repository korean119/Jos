package Script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listener.ListenerTest;
import PagesObject._1_LoginPage;
import PagesObject._2_MainPage;
import Testrail_client.Testrails.TestRails;

@Listeners(ListenerTest.class)
public class _2_MainScreen extends _0_BaseTest {
	
	@TestRails (id = "7928")
	@Test 
	public void EnterContractSetupStart() throws InterruptedException {
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		objMainPage.EnterContractSetupStart();

		
	}
}
	

