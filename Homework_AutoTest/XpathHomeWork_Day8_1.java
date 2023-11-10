package Homework_AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class XpathHomeWork_Day8_1 extends CommonBase{
	@BeforeMethod
	public void openChormeDriver() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	@Test
	public void getLocatorBy_Id() {
		WebElement UserEmail = driver.findElement(By.id("userId"));
		System.out.println("Id của User emal là: "+UserEmail);
		WebElement Password = driver.findElement(By.id("pass"));
		System.out.println("Id của Pass là: "+Password);
	}
	
	@Test
	public void getLocatorBy_Name() {
		System.out.println("User email có name là" + driver.findElement(By.name("email")));
		System.out.println("Password có name là" + driver.findElement(By.name("Password")));
		System.out.println("Commany có name là" + driver.findElement(By.name("commany")));
		System.out.println("Mobile number có name là" + driver.findElement(By.name("mobile number")));
	}
	
	@Test
	public void getLocatorBy_LinkText() {
		System.out.println("User email có link text là" + driver.findElement(By.linkText("email")));
		System.out.println("Password có link text là" + driver.findElement(By.linkText("Password")));
		System.out.println("Commany có link text là" + driver.findElement(By.linkText("company")));
		System.out.println("Mobile number có link text là" + driver.findElement(By.linkText("mobile number")));
	}
	@Test
	public void getLocatorBy_PartialLinkText() {
		System.out.println("User email có link text là" + driver.findElement(By.partialLinkText("email")));
		System.out.println("Password có link text là" + driver.findElement(By.partialLinkText("Password")));
		System.out.println("Commany có link text là" + driver.findElement(By.partialLinkText("company")));
		System.out.println("Mobile number có link text là" + driver.findElement(By.partialLinkText("mobile number")));
	}
	
	@Test
	public void getLocatorBy_ClassName() {
		System.out.println("User email có class name là" + driver.findElement(By.className("selectors-input")));
		System.out.println("Password có class name là" + driver.findElement(By.className("selectors-input")));
		System.out.println("Commany có class name là" + driver.findElement(By.className("input-group-addon")));
		System.out.println("Mobile number có class name là" + driver.findElement(By.className("form-control")));
	}
	
	@Test
	public void getLocatorBy_TagName() {
		System.out.println("User email có tag name là" + driver.findElement(By.className("input")));
		System.out.println("Password có tag name là" + driver.findElement(By.className("input")));
		System.out.println("Commany có tag name là" + driver.findElement(By.className("input")));
		System.out.println("Mobile number có tag name là" + driver.findElement(By.className("input")));
	}
	@AfterMethod
	public void closeChormeBrowse() {
		driver.close();
	}
}
