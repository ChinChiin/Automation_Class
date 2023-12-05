package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Accout;
import automation.page.TrizenPage;

public class TrizenTest extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Accout.TRIZEN_URL);
	}
	
	@Test
	public void TrizenDatetimeAndDropdownList() throws InterruptedException {
		TrizenPage trizen = new TrizenPage(driver);
		trizen.HandleDateTimeAndDropdownList();
	}
}
