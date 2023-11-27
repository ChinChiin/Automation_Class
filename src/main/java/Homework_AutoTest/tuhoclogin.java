package Homework_AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class tuhoclogin extends CommonBase {
 @BeforeMethod 
 public void openChorme() {
	 driver = initChromeDriver("https://practicetestautomation.com/practice-test-login/");
	 
 }
 @Test
 public void TestLogin() throws InterruptedException {
	 WebElement labelUsername = driver.findElement(By.id("username"));
	 labelUsername.sendKeys("student");
	 Thread.sleep(5000);
	 WebElement labelPassword = driver.findElement(By.id("password"));
	 labelPassword.sendKeys("Password123");
	 Thread.sleep(5000);
	 WebElement ButtonSubmit = driver.findElement(By.id("submit"));
	 ButtonSubmit.click();
	 Thread.sleep(5000);
 }
 
}
