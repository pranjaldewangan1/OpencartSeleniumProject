package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPlaced {
	WebDriver driver;
	
	public orderPlaced(WebDriver driver )
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='container'] //h1[text()='Your order has been placed!']")
	WebElement odrderPlacedMessage;
	
	public WebElement orderPlaced()
	{
	
	return odrderPlacedMessage;
	
	
		
		
	}
}
