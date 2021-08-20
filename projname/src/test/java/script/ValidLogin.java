package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.ETTPage;
import page.LoginPage;

public class ValidLogin extends BaseTest
{

	@Test
	public void testValidLogin() {
		
		String un=Excel.getData(XL_PATH, "ValidLogin", 1,0);
		String pw=Excel.getData(XL_PATH, "ValidLogin", 1,1);
		String title=Excel.getData(XL_PATH, "ValidLogin", 1,2);
		
//		1.	Enter valid user name
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("admin");
//		2.	Enter valid password
		loginPage.setPassword("manager");
//		3.	Click on login
		loginPage.clickLogin();
//		4.	Verify Home Page is Displayed
		ETTPage ettPage=new ETTPage(driver);
		boolean result = ettPage.verifyPageIsDisplayed(wait,"Enter");
		Assert.assertEquals(result,true);
	}
}






