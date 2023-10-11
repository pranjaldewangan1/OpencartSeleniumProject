package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkout {
	WebDriver driver;
	
	public checkout(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath= "//form[@class='form-horizontal'] //div[@class='radio'] //label[text()='I want to use a new address']")
	WebElement radioButtonForBillingDetails;

	@FindBy(xpath= "//form[@class='form-horizontal'] //div[@class='radio'] //label[text()='I want to use an existing address']")
	WebElement radioButtonForIWantExistingDetails;
	
	@FindBy(xpath= "//form[@class='form-horizontal'] //div[@class='radio'] //label[text()='I want to use a new address']")
	WebElement radioButtonForIWantNewDetails;
	
	
	
	@FindBy(xpath= "//form[@class='form-horizontal'] //div[@class='radio'] //label[text()='I want to use a new address']")
	WebElement radioButtonForDeliveryDetails;
	
	@FindBy(xpath= "//input[@id='input-payment-firstname']")
	WebElement firstName; 

	@FindBy(xpath= "//input[@id='input-payment-lastname']")
	WebElement lastName; 

	@FindBy(xpath= "//input[@id='input-payment-company']")
	WebElement company; 

	@FindBy(xpath= "//input[@id='input-payment-address-1']")
	WebElement Address_1; 

	@FindBy(xpath= "//input[@id='input-payment-address-2']")
	WebElement Address_2; 

	@FindBy(xpath= "//input[@id='input-payment-city']")
	WebElement city; 

	@FindBy(xpath= "//input[@id='input-payment-postcode']")
	WebElement postCode; 
	
	@FindBy(xpath= "//select[@id='input-payment-country']")
	WebElement country;
	
	@FindBy(xpath =  "//input[@id='button-shipping-address']")
	WebElement shippingContinueButton;
	
	@FindBy(xpath =  "//input[@id='button-payment-address']")
	WebElement billingContinueButton;
	
	@FindBy(xpath =  "//input[@id='button-shipping-address']")
	WebElement billingDetailsContinueButton;
	
	
	
	
	
	@FindBy(xpath="*[@id="collapse-payment-address"]/div/form/div[3]/label/text()")
	WebElement radiobuttonIWantNewBillingAddress;
	
	@FindBy(xpath =  "//input[@id='button-shipping-method']")
	WebElement deliveryMethodContinueButton;
	
	@FindBy(xpath =  "//input[@name='agree']")
	WebElement paymentMethodCheckboxButton;
	
	@FindBy(xpath =  "//input[@id='button-payment-method']")
	WebElement paymentMethodContinueButton;
	
	@FindBy(xpath =  "//input[@id='button-confirm']")
	WebElement confirmOrderContinueButton;
	
	
	
	
	
//	
	By zone = By.id("input-payment-zone");
	
	public WebElement radioButtonForBillingDetails()
	{
	  return radioButtonForBillingDetails;
		
	}
	
	public WebElement firstName()
	{
		return firstName;
		
	}
	
	public WebElement lastName()
	{
			return lastName;
		
	}
	
	public WebElement company()
	{
			return company;
		
	}
	public WebElement Address_1()
	{
			return Address_1;
		
	}
	public WebElement Address_2()
	{
			return Address_2;
		
	}
	public WebElement city()
	{
		return city;
		
	}
	public WebElement postCode()
	{
		return postCode;
		
	}
	
	public WebElement shippingContinueButton()
	{
		return shippingContinueButton;
		
	}
	public WebElement billingContinueButton()
	{
		return billingContinueButton;
		
	}
	
	public WebElement billingDetailsContinueButton()
	{
		return billingDetailsContinueButton;
		
	}
	
	public WebElement deliveryMethodContinueButton()
	{
		return deliveryMethodContinueButton;
		
	}
	
	
	public WebElement paymentMethodCheckboxButton()
	{
		return paymentMethodCheckboxButton;
		
	}
	public WebElement paymentMethodContinueButton()
	{
		return paymentMethodContinueButton;
		
	}
	
	public WebElement confirmOrderContinueButton()
	{
		return confirmOrderContinueButton;
		
	}
	
	public Select dropDownCountry()
	{
		
		WebElement testDropDown = driver.findElement(By.id("input-payment-country"));  
		
		
		Select dropDown = new Select(testDropDown);
		
		return dropDown;
		
	}
	
	public Select dropDown()
	{
		
		WebElement testDropDown = driver.findElement(By.id("input-payment-zone"));  
		
		
		Select dropDown = new Select(testDropDown);
		
		return dropDown;
		
	}

	public WebElement radioButtonForIWantExistingDetails() {
		// TODO Auto-generated method stub
		return radioButtonForIWantExistingDetails;
	}
	public WebElement radioButtonForIWantNewDetails() {
		// TODO Auto-generated method stub
		return radioButtonForIWantNewDetails;
	}
	
	

	
}
