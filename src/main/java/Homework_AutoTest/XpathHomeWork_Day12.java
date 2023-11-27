package Homework_AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class XpathHomeWork_Day12 extends CommonBase {
	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/input-form-demo.html");
	}
	@Test
	public void dropdownlistState () throws InterruptedException {
		WebElement selectTag = driver.findElement(By.name("state"));
		WebElement textcheckbox = driver.findElement(By.xpath("//label[text()='Do you have hosting?']"));
		WebElement radioYes = driver.findElement(By.xpath("//input[@value='yes']"));

		Select dropdownlist = new Select(selectTag);
		selectTag.click();
		dropdownlist.selectByVisibleText("Hawaii");
		textcheckbox.click();
		radioYes.click();
		Thread.sleep(10000);
		System.out.println("dropdownlist first option is: "+dropdownlist.getFirstSelectedOption().getText());
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}

}
