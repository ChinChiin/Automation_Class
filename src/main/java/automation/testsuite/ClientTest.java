package automation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Accout;
import automation.page.ClientPage;
import automation.page.LoginPage_Factory;

public class ClientTest extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Accout.RISE_URL);
		
	}
	
	@Test
	public void AddClientSuccfully() throws InterruptedException {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		ClientPage client = new ClientPage(driver);
		client.addClientFunction ("Thuy's company", "Sara Ann");
		Thread.sleep(3000);
		isElementPresent(By.xpath("//a[text()='Thuy company"));
	}
}
