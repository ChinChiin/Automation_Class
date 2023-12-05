package automation.page;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class TrizenPage {
	private WebDriver driver;
	
	@FindBy (xpath = "//div[@id='one-way']/div/form/div[1]/div/div/input")
	WebElement flyingFrom;
	
	@FindBy (xpath = "//div[@id='one-way']/div/form/div[2]/div/div/input")
	WebElement flyingTo;
	
	@FindBy(xpath="(//label[text()='Departing'])[1]/following-sibling::div/input")
	WebElement textDepartingDate;
	
	@FindBy(xpath="(//label[text()='Passengers'])[1]/following-sibling::div/div")
	WebElement dropboxPassenger;
	
	@FindBy(xpath="(//div[@class='form-group select-contain w-auto']")
	WebElement dropboxCoach;
	
	@FindBy(xpath="//a[@id='bs-select-3-1']//span[text()='Business']")
	WebElement dropboxCoachItem;
	
	@FindBy(xpath = "(//label[text()='Adults'])[1]/following-sibling::div//i[@class='la la-plus']")
	WebElement addAdult;
	
	@FindBy(xpath = "//div[@id='one-way']/div/form/div[6]/a")
	WebElement buttonSearch;
	
	public TrizenPage (WebDriver driverCommonBase) {
		this.driver = driverCommonBase;
		PageFactory.initElements( driverCommonBase,this);
	}
	
	public void HandleDateTimeAndDropdownList() throws InterruptedException {
		flyingFrom.clear();
		flyingFrom.sendKeys("Ha Noi");
		Thread.sleep(3000);
		flyingTo.clear();
		flyingTo.sendKeys("Ho Chi Minh");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly', 'readonly')", textDepartingDate);
		textDepartingDate.clear();
		textDepartingDate.sendKeys("30092024");
		textDepartingDate.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		dropboxPassenger.click();
		addAdult.click();
		dropboxPassenger.click();
		buttonSearch.clear();
	}
	
}
