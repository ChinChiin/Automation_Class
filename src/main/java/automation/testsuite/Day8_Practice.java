package automation.testsuite;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import automation.common.CommonBase;


public class Day8_Practice extends CommonBase {


	@BeforeMethod
	public void openChrommBrowser() 
	{
		driver = initChromeDriver("https://rise.fairsketch.com/signin");	
	}
	@Test
	public void getLocatorById() 
	{
		WebElement emailElement = driver.findElement(By.id("email"));
		System.out.println("Email là "+emailElement);
		WebElement passwordElement = driver.findElement(By.id("email"));
		System.out.println("Email là "+passwordElement);
		WebElement btnSign = driver.findElement(By.id("email"));
		System.out.println("Email là "+passwordElement);
		
	}
	@AfterTest
	public void closeChormeBrowse() {
		driver.close();
	}
	
}
