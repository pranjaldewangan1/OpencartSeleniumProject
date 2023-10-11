package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver ;
	
	public RegisterPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="input-firstname")
	WebElement firstNameField;
	
	
	@FindBy(id ="input-lastname")
	WebElement lastNameField;
	
	@FindBy(id ="input-email")
	WebElement emailField;
	
	@FindBy(id ="input-telephone")
	WebElement telephoneField;
	
	
	@FindBy(id ="input-password")
	WebElement passwordField;
	
	
	@FindBy(id ="input-confirm")
	WebElement confirmPasswordField;
	
	
	@FindBy(xpath ="//input[@type='checkbox']")
	WebElement privacyPolicyCheckbox;
	
	public WebElement firstNameField()
	{
		return firstNameField;
		
	}
	
	public WebElement lastNameField()
	{
		return lastNameField;
		
	}
	
	public WebElement emailField()
	{
		return emailField;
		
	}
	
	public WebElement telephoneField()
	{
		return telephoneField;
		
	}
	
	public WebElement passwordField()
	{
		return passwordField;
		
	}
	public WebElement confirmPasswordField()
	{
		return confirmPasswordField;
		
	}
	
	public WebElement privacyPolicyCheckbox()
	{
		return privacyPolicyCheckbox;
		
	}
	
	
}

