package Homework_AutoTest;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;


public class btvnD14_Test extends CommonBase{

	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver(btvnD14_CT.RISE_URL);
	}
	
	//test đăng ký
	@Test(priority = 1)
	public void SignUpSuccessfully() throws InterruptedException {
		btvnD14_Page signup = new btvnD14_Page(driver);
		signup.SignUpFunction();
		assertFalse(isElementPresent(btvnD14_CT.BUTTON_SIGNUP1));
	}
	
	//test đăng nhập
	@Test(priority = 2)
	public void LoginSuccessfully() throws InterruptedException {
		btvnD14_Page login = new btvnD14_Page(driver);
		login.LoginFunction();
		assertFalse(isElementPresent(btvnD14_CT.BTN_lOGIN));
		
		btvnD14_Page editinformation = new btvnD14_Page(driver);
		editinformation.EditInformation();
		assertTrue(driver.findElement(btvnD14_CT.KHOAHOC_TXT).isDisplayed());
		//assertFalse(isElementPresent(btvnD14_CT.KHOAHOC_TXT));
		 
	}
	
	@AfterMethod
	public void closeChrome() {
		closeDriver();
	}
}
