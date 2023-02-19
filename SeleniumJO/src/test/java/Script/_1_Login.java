package Script;

import org.testng.annotations.Test;

import Testrail_listeners.UseAsTestRailId;

public class _1_Login extends _0_BaseTest {

	@Test
	@UseAsTestRailId(testRailId = 26419)
	public void login() throws InterruptedException {

		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");

	}

}