package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day8_Practice2 extends CommonBase {
	@BeforeMethod
	public void openChormeDriver() {
		driver = initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui");
		
	}
	@Test
	public void getLocatorText()
	{
		WebElement linkMayRuaChen = driver.findElement(By.linkText("Máy Rửa Chén Bát"));
		System.out.println("Locator của link máy rửa chén bát" +linkMayRuaChen);
		
		WebElement textBepInventor = driver.findElement(By.partialLinkText("Cổ Điển"));
		System.out.println("Locator mẫu bếp từ cổ điển "+textBepInventor);
	}
	
	@Test
	public void getLocatorByClassName_TagName()
	{
		
		System.out.println("Checkbox có class name" + driver.findElements(By.className("cursor-pointer")).size());
		System.out.println("Checkbox có class name" + driver.findElement(By.className("cursor-pointer")));
		System.out.println("Thẻ có tên input là" + driver.findElement(By.tagName("input")));
	}
	@AfterTest
	public void closeChormeBrowse() {
		driver.close();
	}
	
	
}
