package Homework_AutoTest;

import org.openqa.selenium.By;

public class btvnD14_CT {
	public static String RISE_URL = "https://alada.vn/";//LINK WEB
	public static By BUTTON_SIGNUP = By.xpath("//span[@class='box-item-login']//a[1]");//nút đăng kí ở trang chủ
	public static By TXT_FIRSTNAME = By.id("txtFirstname");
	public static By TXT_EMAIL = By.id("txtEmail");
	public static By TXT_CEMAIL = By.id("txtCEmail");
	public static By TXT_PASSWORD = By.id("txtPassword");
	public static By TXT_CPASSWORD = By.id("txtCPassword");
	public static By TXT_PHONE = By.id("txtPhone");//div[@class='field']//button
	public static By BUTTON_SIGNUP1 = By.xpath("//button[@class = 'btn_pink_sm fs16' and text()='ĐĂNG KÝ']");//nút đăng ký trong form đăng ký

	public static By BTN_lOGIN = By.xpath("//span[@class='box-item-login bor']");//button đăng nhập ở trang chủ
	public static By TXT_LOGIN_USER = By.id("txtLoginUsername");
	public static By TXT_LOGIN_PASS = By.id("txtLoginPassword");
	public static By BTN_lOGIN1 = By.xpath("//div[@class='field']//button");//button yêu cầu đăng nhập
	public static By KHOAHOC_TXT = By.xpath("//li[@id='cate-default']//span[text()='NỔI BẬT']");
	
	public static By AVATAR = By.xpath("//div[@class='avatar2']");
	public static By EDIT_INFORMATION = By.xpath("//p[@class='paddingleft10']//a");//button chỉnh sửa thông tin
	public static By TXT_NEWPASS = By.id("txtnewpass");
	public static By TXT_RENEWPASS = By.id("txtrenewpass");
	public static By BUTTON_SAVE_PASS = By.xpath("//button[text()='Lưu mật khẩu mới']");//button lưu mật khẩu mới
	

}
