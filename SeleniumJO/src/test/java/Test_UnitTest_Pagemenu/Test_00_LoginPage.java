package Test_UnitTest_Pagemenu;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Test.BaseTest;
import Testrail_client.Testrails.TestRails;
import junit.framework.Assert;

public class Test_00_LoginPage extends BaseTest {

	@Test
	public void UnitTest_LoginPage() throws InterruptedException {

		// 간단한 것들만 해놓음. Validation 문서가 필요함
		objLoginPage.Loginbutton();

		String gettext = objLoginPage.Email_Validation();
		System.out.println("출력값 : " + gettext);
		Assert.assertEquals(objLoginPage.Email_Validation(), "이메일 주소 입력은 필수입니다.");

		String gettext2 = objLoginPage.Password_Validation();
		System.out.println("출력값 : " + gettext2);
		Assert.assertEquals(objLoginPage.Password_Validation(), "비밀번호 입력은 필수입니다.");

///////////////////////////////////////////////////////////////////////

		objLoginPage.Email_input("t");

		String gettext3 = objLoginPage.Email_Validation();
		System.out.println("출력값 : " + gettext3);
		Assert.assertEquals(objLoginPage.Email_Validation(), "정확한 이메일 주소를 입력해 주세요.");

		objLoginPage.Loginbutton();

///////////////////////////////////////////////////////////////////////

		objLoginPage.Email_input("wq1515tqzc@a.bc");

		objLoginPage.Password("123412341234");

		objLoginPage.Loginbutton();

		// 모달 뜨는게 보이지도 않아서 그냥 걸어둠
		Thread.sleep(1000);

		objLoginPage.NotFindUser_ModalOk_btn();

///////////////////////////////////////////////////////////////////////

		objLoginPage.Email_input("joshin1@getnada.com");

		objLoginPage.Password("tlswnsdh2@@ ");
		objLoginPage.Loginbutton();
		
		

	}
}
