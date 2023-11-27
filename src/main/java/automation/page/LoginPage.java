package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.CT_Accout;

public class LoginPage {
	private WebDriver driver;
	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public void LoginFunction(String emailValue, String passwordValue) {
		//driver.findElement(By.id("email"));
	WebElement email=	driver.findElement(CT_Accout.TEXT_EMAIL);
	if(email.isEnabled()) {
		email.clear();
		email.sendKeys(emailValue);
	}
	WebElement password =	driver.findElement(CT_Accout.TEXT_PASSWORD);
	if(password.isEnabled()) {
		password.clear();
		password.sendKeys(passwordValue);
	}
	WebElement loginButton = driver.findElement(CT_Accout.BUTTON_SIGNIN);
	if(password.isEnabled()) {
		loginButton.click();
	}
	WebElement userButton = driver.findElement(CT_Accout.BUTTON_USER);
	if(userButton.isEnabled()) {
		userButton.click();
	}
	WebElement signoutButton = driver.findElement(CT_Accout.BUTTON_SIGNOUT);
	if(userButton.isEnabled()) {
		signoutButton.click();
	}
	
	}
}
