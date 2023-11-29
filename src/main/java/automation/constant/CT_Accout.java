package automation.constant;

import org.openqa.selenium.By;

public class CT_Accout {

	public static String RISE_URL = "https://rise.fairsketch.com/signin";
	public static By TEXT_EMAIL = By.id("email");
	public static By TEXT_PASSWORD = By.id("password");//button[text()='Sign in']
	public static By BUTTON_SIGNIN = By.xpath("//button[text()='Sign in']");
	public static By DASHBOARD_TEXT = By.xpath("//span[text()='Dashboard' and @class ='menu-text ']");
	public static By AUTHENTICATION_ALERT = By.xpath("//div[normalize-space()='Authentication failed!']");
	public static By BUTTON_USER = By.xpath("//span[@class='user-name ml10']");
	public static By BUTTON_SIGNOUT = By.xpath("//a[@class='dropdown-item'and text()=' Sign Out']");
}
