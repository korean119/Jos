package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PagesObjectModel._1_LoginPage;
import PagesObjectModel.DocumentsPage;
import Testrail_client.Testrails.TestRails;


public class _2_MainScreen extends _0_BaseTest {
	
	@TestRails (id = "7928")
	@Test 
	public void EnterContractSetupStart() throws InterruptedException, IOException {
		
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		
		
	}
}
	