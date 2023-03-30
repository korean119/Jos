package Zohnny_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Test.TestBase;
import Testrail_client.Testrails.TestRails;

@Ignore
public class johnnyTest {

	public class _1_Login extends TestBase {

		@Test(enabled = false)
		public void Zo2hhny21() throws InterruptedException {

			ObjLoginPage.Login_m("joshin1@getnada.com", "tlswnsdh2@@");

			Thread.sleep(2000);
			
			ObjDocumentsPage.ContractStatus_Check();


		}

	}
}
