package Homework_AutoTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day16_PratiseTest extends CommonBase {
	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	}
	
	@Test
	public void TestAler() throws InterruptedException {
		click(By.xpath("//button[text() ='Try it']"));//click button try it
		Thread.sleep(11000);//đợi 11s đợi web xuất hiện alert
		
		//cách 1
		String msgConfirm = driver.switchTo().alert().getText(); //đặt têm biến cho aler
		assertEquals(msgConfirm,"Welcome to Selenium WebDriver Tutorials");///kiểm tra text của aler
		driver.switchTo().alert().accept(); //đóng alert
		
		
		//cách 2
		try {
            // chuyển đến alert nếu có
            Alert alert = driver.switchTo().alert();

            // Nếu có alert, thực hiện các hành động cần thiết
            // Ví dụ: đóng alert bằng cách bấm nút OK
            alert.accept();
        } catch (NoAlertPresentException e) {
            //không có alert thì bỏ qua
        } 
	}
	
	@AfterMethod 
		public void quitDriver() {
		driver.close();
	}
}
