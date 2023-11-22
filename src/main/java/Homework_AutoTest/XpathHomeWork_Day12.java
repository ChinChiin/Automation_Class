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
		Select dropdownlist = new Select(selectTag);
		//chọn Hawaii bằng cách VisibleText
		selectTag.click();
		dropdownlist.selectByVisibleText("Hawaii");
		System.out.println("dropdownlist first option is: "+dropdownlist.getFirstSelectedOption().getText());
	}
	
	@Test
	public void testCheckbox() {
		//kiểm tra giá trị mặc định của radio  yes và no là chưa check
		WebElement radioYes = driver.findElement(By.xpath("//input[@value='yes']"));
		WebElement radioNo = driver.findElement(By.xpath("//input[@value='no']"));
		System.out.println("trạng thái của radio yes là "+radioYes.isSelected());
		System.out.println("trạng thái của radio no là "+radioNo.isSelected());
		
		//kiểm tra radio chưa check thì click vào
		if (radioYes.isEnabled()==true && radioNo.isSelected()==false) {
			radioYes.click();
		}
		else if (radioNo.isEnabled()==true && radioYes.isSelected()==false) {
			radioNo.click();
		
		}
	}
	
	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
}
