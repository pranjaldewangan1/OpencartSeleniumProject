package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.RegisterPage;
import PageObjects.landingPage;
import resources.BaseClass;

public class registerModule extends BaseClass{
	
	WebDriver driver ;
	@Test
	public void register () {
		
		landingPage landingpage = new landingPage(driver);
		landingpage.myAccountDropdown().click();
		
		landingpage.registerOption().click();
		RegisterPage registerpage= new RegisterPage(driver);
		registerpage.firstNameField().sendKeys("FirstName");
		registerpage.lastNameField().sendKeys("LastName");
		registerpage.emailField().sendKeys("Email");
		registerpage.telephoneField().sendKeys("Telephone");
		registerpage.passwordField().sendKeys("password");
		registerpage.confirmPasswordField().sendKeys("ConfirmPassword");
		registerpage.privacyPolicyCheckbox().click();

	}
	
	@BeforeMethod
	public void openApplication() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}
