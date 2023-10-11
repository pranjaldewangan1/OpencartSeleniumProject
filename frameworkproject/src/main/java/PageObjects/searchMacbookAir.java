package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchMacbookAir {
	WebDriver driver ;
	
	public searchMacbookAir(WebDriver driver ) {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//button[@type='button'] //span[text()='Add to Cart']")
	WebElement addtocart;
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement SuccessMessage;
	
	@FindBy(xpath="//button[@type='button'] //span[@id='cart-total']")
	WebElement addtocartButton;
	
	@FindBy(xpath="//strong[text()='View Cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//strong[text()='Checkout']")
	WebElement checkout;
	

	public WebElement addToCart()
	{
		return addtocart;
		
	}
	
	public WebElement checkOut()
	{
		return checkout;
		
	}
	
	
	public WebElement successMessage()
	{
		return SuccessMessage;
		
	}
	
	public WebElement addToCartButton()
	{
		return addtocartButton;
		
	}
	
	public WebElement viewCart()
	{
		return viewcart;
		
	}
	
	
	
}
