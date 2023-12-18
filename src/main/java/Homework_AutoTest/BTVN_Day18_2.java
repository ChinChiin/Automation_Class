package Homework_AutoTest;

import org.openqa.selenium.By;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class BTVN_Day18_2 extends CommonBase {
	@Parameters("browser")
	@BeforeMethod
	 public void openChrome(@Optional("chrome") String browser) {
			setupDriver(browser);
			driver = initChromeDriver("https://bepantoan.vn/");
	 }
	 @Test
	 public void testChatNgay() {
		 pause(5000);
			int totaliframe = driver.findElements(By.tagName("iframe")).size();
			for (int i = 0; i < totaliframe; i++) {
				//phương pháp tìm index của iframe
				driver.switchTo().frame(i);
				
				int iframeChat = driver.findElements(By.xpath("//div[@class='tawk-text-truncate']")).size();

				if(iframeChat !=0) {
					click(By.xpath("//div[@class='tawk-text-truncate']"));
					 
					//isElementPresent(By.xpath("//button[text()=' Not now ']"));
					//click(By.xpath("//button[text()=' Not now ']"));
					//đóng iframe trước khi chuyển sang iframe kế tiếp
					driver.switchTo().defaultContent();
				}
				else {
					//không thực thi lệnh, đóng iframe trước khi chuyển sang iframe kế tiếp
					driver.switchTo().defaultContent();
				}		
			}
		}
	 @AfterMethod
	 public void closeChrome() {
		 driver.close();
	 }
}
