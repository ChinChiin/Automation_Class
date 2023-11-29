package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.constant.CT_Accout;

@SuppressWarnings("unused")
public class LoginPage_Factory {
	private WebDriver driver;
	@FindBy(id="email")
	WebElement textEmail ;
	
	@FindBy(id="password")
	WebElement textPassword;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement buttonSignin;
	
	@FindBy(xpath = "//span[@class='user-name ml10']")
	WebElement buttonUser;
	
	@FindBy(xpath = "//a[@class='dropdown-item'and text()=' Sign Out']")
	WebElement buttonLogOut;
	
	public LoginPage_Factory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void LoginFunction(String email, String password) {
		textEmail.clear();
		textEmail.sendKeys(email);
		textPassword.clear();
		textPassword.sendKeys(password);
		buttonSignin.click();
	}
	
	public void LogoutFunction(String email, String password){
			LoginFunction(email, password);
			buttonUser.click();
			buttonLogOut.click();
		}
	}

