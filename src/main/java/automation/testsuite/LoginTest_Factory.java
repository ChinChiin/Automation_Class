package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Accout;
import automation.page.LoginPage;
import automation.page.LoginPage_Factory;

public class LoginTest_Factory extends CommonBase{

	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver(CT_Accout.RISE_URL);
	}
	
	@Test(priority = 1)
	public void LoginSuccessfully() {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Accout.DASHBOARD_TEXT).isDisplayed());
		}
	@Test(priority = 2)
	public void LoginFailIncorrectEmail() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client_incorrect@demo.com", "riseDemo");
		assertFalse(isElementPresent(CT_Accout.DASHBOARD_TEXT));
	}
	@Test(priority = 3)
	public void LogOutSuccessfully() throws InterruptedException {
		//đăng nhập 
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LogoutFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Accout.BUTTON_SIGNIN).isDisplayed());
	}
	
	@AfterMethod
	public void closeChrome() {
		closeDriver();
	}

}
