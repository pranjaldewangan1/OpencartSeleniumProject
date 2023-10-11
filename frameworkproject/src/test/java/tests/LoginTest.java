package tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.AccountPage;
import PageObjects.LoginPage;
import PageObjects.landingPage;
import resources.BaseClass;



public class LoginTest extends BaseClass{
	
	WebDriver driver;
	@Test(dataProvider ="getLogindata")
	public void login(String email, String password , String expectedStatus) throws IOException, InterruptedException
	{
		
		
		landingPage landingpage = new landingPage(driver);
		landingpage.myAccountDropdown().click();
		landingpage.loginOption().click();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.emailAddressField().sendKeys(email);
		Thread.sleep(2000);
		loginpage.passwordField().sendKeys(password);
		loginpage.loginButton().click();
		System.out.println("login succesfully");
		
		
		
		AccountPage accountpage = new AccountPage(driver);
		//Assert.assertTrue(accountpage.editAccountInformationOption().isDisplayed());
		String actualResult = null ;
		
		
		System.out.println(accountpage.editAccountInformationOption().isDisplayed());
		//System.out.println("the assertion will be done ");
		
		try {
			
			if(accountpage.editAccountInformationOption().isDisplayed())
				{
						actualResult ="Succesfull";
						

		}
		}
		catch(Exception e)
		{
			actualResult = "Failure";
			
		}
		Assert.assertEquals(actualResult, expectedStatus);
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
	
	@DataProvider
	public Object[][] getLogindata()
	{
		Object[][] data = {{"pranjaldewangan0007@gmail.com","PRANd123@", "Successfull"},{"dummy@test.com","dummy","failure"}};
		return data;
		
	
	}

}
