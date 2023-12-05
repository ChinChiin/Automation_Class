package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import automation.common.CommonBase;

public class ClientPage extends CommonBase{
	@FindBy(xpath = "//span[text()='Clients']")
	WebElement clientLinks;
	
	@FindBy(xpath="//a[@data-title='Add client']")
	WebElement clientButton;
	
	@FindBy(id="type_person")
	WebElement radioPersion;
	
	@FindBy(id="company_name")
	WebElement textboxClientName;
	
	@FindBy(id="s2id_created_by")
	WebElement ownerDropdownlist;
	
	@FindBy(xpath = "//ul[@id='select2-results-3']//div[text()='Sara Ann']")
	WebElement ownerItem; 
	
	@FindBy(id="address")
	WebElement clientAddress;
	
	@FindBy(id="city")
	WebElement clientCity;
	
	@FindBy(id="zip")
	WebElement clientZip;
	
	@FindBy(id="country")
	WebElement clientCountry;
	
	@FindBy(id="phone")
	WebElement clientPhone;
	
	@FindBy(id="website")
	WebElement clientWebsite;
	
	
	@FindBy(id="vat_number")
	WebElement clientVAT;
	
	@FindBy(id="gst_number")
	WebElement clientGST;
	
	@FindBy(id = "s2id_autogen2")
	WebElement clientGroups;
	
	@FindBy(xpath = "//div[text()='VIP']")
	WebElement clientGroupsItem;

	@FindBy(id = "select2-chosen-1")
	WebElement clientCurrency;
	
	@FindBy(xpath  = "//div[text()='AED']")
	WebElement clientCurrencyItem;
		
	@FindBy(id = "currency_symbol")
	WebElement clientCurrencySymbol;
	
	@FindBy(id = "s2id_autogen4")
	WebElement clientLabel;
	
	@FindBy(xpath  = "//input[@type='checkbox']")
	WebElement DisableCheckbox;
	
	@FindBy(xpath="//button[@type='submit' and normalize-space()='Save']")
	WebElement buttonSave;
	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientsTab;
	
	@FindBy(xpath="//input[@type='search' and @placeholder='Search']")
	WebElement textboxSearch;
	
	@FindBy(xpath="//a[text()='Class28.6 Test']")
	private WebElement searrResult;
	
	
	public ClientPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void addClientFunction(String companyName, String Owner) throws InterruptedException {
		
		clientLinks.click();
		Thread.sleep(3000);
		clientButton.click();
		Thread.sleep(3000);
		radioPersion.click();
		textboxClientName.sendKeys(companyName);
		ownerDropdownlist.click();
		Thread.sleep(3000);
		ownerItem.click();
		Thread.sleep(3000);
		clientAddress.sendKeys("VietNam");
		clientPhone.sendKeys("0976546766");
		clientGST.sendKeys("46");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", clientGST);
	    Thread.sleep(1000);
	    clientGroups.click();
	    Thread.sleep(2000);
	    clientGroupsItem.click();
	    Thread.sleep(2000);	
		clientCurrency.click();	
		Thread.sleep(2000);	
		clientCurrencyItem.click();
		clientCurrencySymbol.sendKeys("3000");		
		DisableCheckbox.click();
		//buttonSave.click();
	    //textboxSearch.sendKeys(companyName);
		
	}
}
