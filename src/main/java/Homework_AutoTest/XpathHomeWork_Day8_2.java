package Homework_AutoTest;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class XpathHomeWork_Day8_2 extends CommonBase{
	 @BeforeMethod
		public void openChormeDriver() {
			driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
			}
	 @Test
	 public void getLocatorBy_Id() {
		 System.out.println("Locator Id của Name là: "+driver.findElement(By.id("name")));
		 System.out.println("Locator Id của Address là: "+driver.findElement(By.id("address")));
		 System.out.println("Locator Id của Email là: "+driver.findElement(By.id("email")));
		 System.out.println("Locator Id của Password là: "+driver.findElement(By.id("password")));
	 }
	 @Test
	 public void getLocatorBy_Name() {
		 System.out.println("Locator name của Name là: "+driver.findElement(By.name("name")));
		 System.out.println("Locator name của Address là: "+driver.findElement(By.name("address")));
		 System.out.println("Locator name của Email là: "+driver.findElement(By.name("email")));
		 System.out.println("Locator name của Password là: "+driver.findElement(By.name("password")));
	 }
	 @Test
	 public void getLocatorBy_LinkText() {
		 System.out.println("Locator link text của Name là: "+driver.findElement(By.linkText("name")));
		 System.out.println("Locator link text của Address là: "+driver.findElement(By.linkText("address")));
		 System.out.println("Locator link text của Email là: "+driver.findElement(By.linkText("email")));
		 System.out.println("Locator link text của Password là: "+driver.findElement(By.linkText("password")));
	 }
	 @Test
	 public void getLocatorBy_PartialLinkText() {
		 System.out.println("Locator partial link text của Name là: "+driver.findElement(By.partialLinkText("name")));
		 System.out.println("Locator partial link text của Address là: "+driver.findElement(By.partialLinkText("address")));
		 System.out.println("Locator partial link text của Email là: "+driver.findElement(By.partialLinkText("email")));
		 System.out.println("Locator partial link text của Password là: "+driver.findElement(By.partialLinkText("password")));
	 }
	 @Test
	 public void getLocatorBy_ClassName() {
		 System.out.println("Locator class name của Name là: "+driver.findElement(By.className("large-12 columns")));
		 System.out.println("Locator class name của Address là: "+driver.findElement(By.className("large-12 columns")));
		 System.out.println("Locator class name của Email là: "+driver.findElement(By.className("large-12 columns")));
		 System.out.println("Locator class name của Password là: "+driver.findElement(By.className("large-12 columns")));
	 }
	 @Test
	 public void getLocatorBy_TagName() {
		 System.out.println("Locator tag name của Name là: "+driver.findElement(By.tagName("input")));
		 System.out.println("Locator tag name của Address là: "+driver.findElement(By.tagName("input")));
		 System.out.println("Locator tag name của Email là: "+driver.findElement(By.tagName("input")));
		 System.out.println("Locator tag name của Password là: "+driver.findElement(By.tagName("input")));
	 }
	 @AfterMethod
	 public void closeChormeDriver() {
		 driver.close();
	 }
}
