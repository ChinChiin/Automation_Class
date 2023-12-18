package Homework_AutoTest;

import static org.testng.Assert.assertEquals;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;

	public class BTVN_Day18_1 extends CommonBase {

	
		@Parameters("browser")
		@BeforeMethod
		public void openChrome(@Optional("chrome")String browser) {
			setupDriver(browser);
			driver = initChromeDriver("https://dienmaynhapkhaugiare.com.vn/dieu-hoa-1/dieu-hoa-daikin/");
			}
		
		@Test
		public void testIframeZalo() throws InterruptedException {
			 // Sau khi vào trang web, thực hiện click vào phần tử div có id là 'zalo-vr'
		    click(By.xpath("//div[@id='zalo-vr']"));
		    
		    // Lấy danh sách các cửa sổ trình duyệt mở trong WebDriver
		    Set<String> listWindows = driver.getWindowHandles();
		    String mainWindow = driver.getWindowHandle(); // Lấy cửa sổ chính hiện tại
		    
		    // Duyệt qua từng cửa sổ con
		    for (String childWindow : listWindows) {
		        // Kiểm tra nếu cửa sổ con không phải là cửa sổ chính
		        if (!childWindow.equalsIgnoreCase(mainWindow)) {
		            // Chuyển đổi sang cửa sổ con
		            driver.switchTo().window(childWindow);
		            
		            // Kiểm tra URL của cửa sổ con có đúng là "https://zalo.me/0988169282" không
		            assertEquals(driver.getCurrentUrl(), "https://zalo.me/0988169282");
 
		            // Thực hiện click vào phần tử 'zalo-vr' trong cửa sổ con và đóng cửa sổ con
		            
		            click(By.xpath("//button[text()='Từ chối']"));
		            driver.close();
		        }
		    }

		    // Chuyển về cửa sổ chính
		    driver.switchTo().window(driver.getWindowHandles().iterator().next());
		    
		    // Kiểm tra URL của cửa sổ chính có đúng là "https://dienmaynhapkhaugiare.com.vn/dieu-hoa-1/dieu-hoa-daikin/" không
		    assertEquals(driver.getCurrentUrl(), "https://dienmaynhapkhaugiare.com.vn/dieu-hoa-1/dieu-hoa-daikin/");
		}
		@AfterMethod
		public void closeChorme() {
			driver.close();
		}
}
