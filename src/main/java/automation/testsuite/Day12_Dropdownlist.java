package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_Dropdownlist extends CommonBase{
	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	}
	@Test
	public void selectOneOptionFromDropdownlist() throws InterruptedException {
		WebElement selectTag = driver.findElement(By.id("select-demo"));
		Select dropdownlist = new Select(selectTag);
		System.out.println("dropdownlist.isMultiple: "+dropdownlist.isMultiple());
		System.out.println("dropdownlist size: "+dropdownlist.getOptions().size());
		//chọn sunday bằng cách value
		selectTag.click();
		dropdownlist.selectByValue("Sunday");
		System.out.println("dropdownlist first option is: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		//chọn monday bằng cách visibletext
		selectTag.click();
		dropdownlist.selectByVisibleText("Monday");
		System.out.println("dropdownlist first option is: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		//chọn monday bằng cách index
		selectTag.click();
		dropdownlist.selectByIndex(3);
		System.out.println("dropdownlist first option is: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
	}
}
