package Test_UnitTest_Pagemenu;


import org.testng.annotations.Test;
import Test.BaseTest;


public class Test_09_SettingsPage_Myinfo extends BaseTest {
	
	@Test
	public void UnitTest_SettingsPage_Myinfo() throws InterruptedException {
		
		// 비밀번호 변경
		objLoginPage.Login("joshin1@getnada.com", "tlswnsdh2@@");
		
		objGNB.Settings_btn();
	
		objSettingsPage_01_MyInfo.PasswordChange_m("tlswnsdh2@@", "tlswnsdh1!!", "tlswnsdh1");
		
		objSettingsPage_01_MyInfo.PasswordChange_m("tlswnsdh1!!", "tlswnsdh2@@", "tlswnsdh2@@");


	}
}
	