package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_RadioButton extends CommonBase{

	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	}
	@Test
	public void testCheckBox() {
		//kiểm tra giá trị mặc định của radio  Male và Female là chưa check
		WebElement radioMale = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement radioFemale = driver.findElement(By.xpath("//input[@value='Female']"));
		System.out.println("trạng thái của radio male là "+radioMale.isSelected());
		System.out.println("trạng thái của radio female là "+radioFemale.isSelected());
		
		//kiểm tra radio chưa check thì click vào
		if (radioMale.isEnabled()==true && radioFemale.isSelected()==false) {
			radioMale.click();
		}
		else if (radioFemale.isEnabled()==true && radioMale.isSelected()==false) {
			radioFemale.click();
		}
	}
}
