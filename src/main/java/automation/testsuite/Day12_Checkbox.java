package automation.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_Checkbox extends CommonBase{
@BeforeMethod
public void openChorme() {
	driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
}
@Test
public void ClickOnCheckBox() {
	//kiểm tra rằng sau khi pages được mở defaut thì check đã được check
	WebElement defaultChecked = driver.findElement(By.xpath("//div[@class='checkbox']/descendant::label[normalize-space()='Default Checked']"));
	boolean status = defaultChecked.isSelected();
	System.out.println("Status is "+status);
	
	//kiểm tra rằng sau khi pages được mở defaut thì check đã được check
		WebElement clickOnThisChb= driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']"));
		if(clickOnThisChb.isSelected()==false) {
			clickOnThisChb.click();
			System.out.println("check box click in this check box was checked");
		}
		
		//
}
@Test
public void clickOnMultipleCheckbox() throws InterruptedException {
	Thread.sleep(2000);
	List<WebElement> listCheckbox;
	//lấy tổng số checkbox
	listCheckbox= driver.findElements(By.xpath("//div[text()='Multiple Checkbox Demo']/following-sibling::div[@class='panel-body']/child::div[@class='checkbox']//input"));
	for(int i=0; i<listCheckbox.size();i++) {
	    WebElement checkbox = listCheckbox.get(i);
	    if(checkbox.isSelected()==false) {
	    	checkbox.click();
	    	System.out.println("checkbox thứ "+(i+1)+ " đã được check");
	    }
	}
}


@AfterMethod
public void Close() {
	driver.close();
}
}
