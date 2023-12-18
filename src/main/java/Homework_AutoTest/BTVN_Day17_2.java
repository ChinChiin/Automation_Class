package Homework_AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class BTVN_Day17_2 extends CommonBase{
	@Parameters("browser")
	@BeforeMethod
	public void openChrome(@Optional("chrome")String browser) 
	{
		setupDriver(browser);
		driver = initChromeDriver("https://mediamart.vn/");
	}
	
	@Test
	public void testIframeZalo() {
		pause(5000);
		isElementPresent(By.xpath("//div[@class='zalo-chat-widget']//iframe"));
		WebElement ZaloIframe = driver.findElement(By.xpath("//div[@class='zalo-chat-widget']//iframe"));
		driver.switchTo().frame(ZaloIframe);
		
		isElementPresent(By.xpath("//div[@class='chat-wrapper za-chat__wrapper']"));
		click(By.xpath("//div[@class='za-chat']"));
		
		isElementPresent(By.xpath("//div[text()='Chat nhanh']"));
		click(By.xpath("//div[text()='Chat nhanh']"));
		
	}
	@AfterMethod
	public void closeChorme() {
		closeDriver();
	}
}
