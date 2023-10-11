package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {

	
	
	WebDriver driver;
	
	public landingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myAccountDropdown;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginOption;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right'] //a[text()='Register']")
	WebElement registerOption;
	
	@FindBy(xpath= "//div[@id='search']")
	WebElement searchBox;
	
	@FindBy(xpath= "//span[@class='input-group-btn']")
	WebElement searchButton;
	
	public WebElement myAccountDropdown()
	{
		return myAccountDropdown;
		
	}
	
	public WebElement loginOption()
	{
		return loginOption;
		
	}
	
	public WebElement registerOption()
	{
		return registerOption;
		
	}
	
	public WebElement searchBox()
	{
		
	return searchBox;
	
	}
	
	public WebElement searchButton()
	{
		
	return searchButton;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
