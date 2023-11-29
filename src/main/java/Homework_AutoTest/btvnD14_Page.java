package Homework_AutoTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

@SuppressWarnings("unused")
public class btvnD14_Page {
	private WebDriver driver;
	
	/////////////ĐĂNG KÝ TÀI KHOẢN///////////////
	@FindBy(xpath = "//span[@class='box-item-login']//a[1]")//nút đăng ký ở trang chủ
	WebElement buttonSigUp;
	
	@FindBy(id = "txtFirstname")
	WebElement txtFirstname;
	
	@FindBy(id = "txtEmail")
	WebElement txtEmail;
	
	@FindBy(id = "txtCEmail")
	WebElement txtCEmail;
	
	@FindBy(id = "txtPassword")
	WebElement txtPassword;
	
	@FindBy(id = "txtCPassword")
	WebElement txtCPassword;
	
	@FindBy(id = "txtPhone")
	WebElement txtPhone;
	
	@FindBy(xpath  = "//button[@class = 'btn_pink_sm fs16' and text()='ĐĂNG KÝ']")
	WebElement buttonSignUp1;
	
	
	//////////////ĐĂNG NHẬP////////////////
	@FindBy(xpath = "//span[@class='box-item-login bor']")
	WebElement buttonLogin; 
	
	@FindBy(id = "txtLoginUsername")
	WebElement txtLoginUsername;
	
	@FindBy(id = "txtLoginPassword")
	WebElement txtLoginPassword;
	
	@FindBy(xpath = "//div[@class='field']//button")
	WebElement buttonLogin1;
	
	
	///////////CHỈNH SỬA THÔNG TIN////////////////
	@FindBy( xpath =  "//div[@class='avatar2']")
	WebElement buttonAvatar;
	
	@FindBy( xpath=("//p[@class='paddingleft10']//a"))
	WebElement editInformation;
	
	@FindBy( xpath=("//input[@class='edi_text maxwidth' and @id='txtpassword']"))
	WebElement txtPassword1;
	
	@FindBy( id =  "txtnewpass")
	WebElement txtnewpass;
	
	@FindBy( id =  "txtrenewpass")
	WebElement txtrenewpass;
	
	@FindBy( xpath  =  "//button[text()='Lưu mật khẩu mới']")
	WebElement buttonSave;
	
	@FindBy( xpath  =  "//span[normalize-space()='VỪA RA MẮT']")
	WebElement btnKhoaHoc;
	
	public btvnD14_Page (WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	
	/////////đăng ký///////////
	
	  public void SignUpFunction() throws InterruptedException {
	  buttonSigUp.click(); 
	  txtFirstname.sendKeys("Hoàng Thủy" );
	  txtEmail.sendKeys("vietcong2k1@gmail.com" );
	  txtCEmail.sendKeys("vietcong2k1@gmail.com" );
	  txtPassword.sendKeys("yeucainoii1@"); 
	  txtCPassword.sendKeys("yeucainoii1@");
	  txtPhone.sendKeys("0971223466"); 
	  Thread.sleep(4000); 
	  buttonSignUp1.click(); }
	 
	
	//////ĐĂNG NHẬP //////
	public void LoginFunction() throws InterruptedException {
		buttonLogin.click();
		txtLoginUsername.sendKeys("vietcong2k1@gmail.com");
		txtLoginPassword.sendKeys("thuy123");
		buttonLogin1.click();		
		buttonAvatar.click();
		Thread.sleep(2000);
		editInformation.click();
	}
	
	///////CHỈNH SỬA THÔNG TIN
	public void EditInformation() throws InterruptedException {
		// Tạo đối tượng JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Cuộn xuống cuối trang
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Đợi một khoảng thời gian (có thể sử dụng WebDriverWait để đợi cho các yếu tố xuất hiện)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
		txtPassword1.sendKeys("thuy123");
		txtnewpass.sendKeys("thuy1234");
		txtrenewpass.sendKeys("thuy1234");
		Thread.sleep(1000);
		buttonSave.click();
	}
}
