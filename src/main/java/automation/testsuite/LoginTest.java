package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import static org.testng.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Accout;
import automation.page.LoginPage;

public class LoginTest extends CommonBase{
	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver(CT_Accout.RISE_URL);
	}
	
	@Test(priority = 1)
	public void LoginSuccessfully() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Accout.DASHBOARD_TEXT).isDisplayed());
		}
	@Test(priority = 2)
	public void LoginFailIncorrectEmail() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client_incorrect@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Accout.AUTHENTICATION_ALERT).isDisplayed());
	}
	@Test(priority = 3)
	public void LoginFailIncorrectPass() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com", "riseDemo_incorrect");
		assertTrue(driver.findElement(CT_Accout.AUTHENTICATION_ALERT).isDisplayed());
	}
	@Test(priority = 4)
	public void SignOutSuccessfully() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Accout.DASHBOARD_TEXT).isDisplayed());
		assertTrue(driver.findElement(CT_Accout.BUTTON_USER).isDisplayed());
		assertTrue(driver.findElement(CT_Accout.BUTTON_SIGNOUT).isDisplayed());

	}
	
	@AfterMethod
	public void closeChrome() {
		closeDriver();
	}

}
