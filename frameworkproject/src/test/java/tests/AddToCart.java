package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.checkout;
import PageObjects.landingPage;
import PageObjects.searchMacbookAir;
import resources.BaseClass;

public class AddToCart extends BaseClass {
	
	WebDriver driver ;

	@Test
	public void AddToCart ()throws InterruptedException 
	{
//	 
		landingPage landingpage = new landingPage(driver);
		landingpage.myAccountDropdown().click();
		landingpage.loginOption().click();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.emailAddressField().sendKeys(prop.getProperty("emailLogin"));
		Thread.sleep(2000);
		loginpage.passwordField().sendKeys(prop.getProperty("passwordLogin"));
		loginpage.loginButton().click();
		System.out.println("login succesfully");
		loginpage.logoClick().click();
		System.out.println("logo is click");
		loginpage.searchBox().click();
		System.out.println("search box is click");
		loginpage.searchBox().sendKeys(prop.getProperty("productName"));
		loginpage.searchButton().click();
		searchMacbookAir addtocart = new searchMacbookAir(driver);
		addtocart.addToCart().click();
		System.out.println("addtocart");
		
		
		Thread.sleep(2000);
		addtocart.addToCartButton().click();
		System.out.println("addtocart button is clicked");

		Thread.sleep(2000);

		System.out.println("addtocart button is click ");
		Thread.sleep(2000);

		addtocart.checkOut().click();
		
		System.out.println("checkOut button is click ");

		checkout checkout = new checkout(driver);
//		checkout.radioButtonForBillingDetails().click();
//		checkout.radioButtonForIWantExistingDetails().click();
		
		System.out.println("checkOut method is started");
		Thread.sleep(1000);
		checkout.radioButtonForBillingDetails().click();
		
		System.out.println("radio button is clicked");
	//	checkout.radioButtonForIWantNewDetails().click();
		Thread.sleep(1000);
		checkout.firstName().sendKeys("pranjal");
		checkout.lastName().sendKeys("dewangan");
		checkout.company().sendKeys("google");
		checkout.Address_1().sendKeys("btm layout");
		checkout.Address_2().sendKeys("sheeetla para ");
		checkout.city().sendKeys("bhilai");
		checkout.postCode().sendKeys("490021");
		checkout.dropDownCountry().selectByVisibleText("India");
		checkout.dropDown().selectByVisibleText("Karnataka");
		checkout.billingContinueButton().click();
		Thread.sleep(1000);
//		checkout.billingDetailsContinueButton().click();
//		Thread.sleep(1000);
//		checkout.shippingContinueButton().click();
//		
//		checkout.deliveryMethodContinueButton().click();
//		Thread.sleep(1000);
//		checkout.paymentMethodCheckboxButton().click();
//		Thread.sleep(1000);
//		checkout.paymentMethodContinueButton().click();
//		Thread.sleep(1000);
//		checkout.confirmOrderContinueButton().click();
//		Thread.sleep(1000);

		
//		checkout.firstName().sendKeys("pranjal");
//		checkout.lastName().sendKeys("dewangan");
//		checkout.company().sendKeys("google");
//		checkout.Address_1().sendKeys("btm layout");
//		checkout.Address_2().sendKeys("sheeetla para ");
//		checkout.city().sendKeys("bhilai");
//		checkout.postCode().sendKeys("490021");
//		checkout.dropDownCountry().selectByVisibleText("India");
//		checkout.dropDown().selectByVisibleText("Karnataka");
//		checkout.billingContinueButton().click();
//		Thread.sleep(1000);
//		checkout.shippingContinueButton().click();
//		Thread.sleep(1000);
//		checkout.deliveryMethodContinueButton().click();
//		Thread.sleep(1000);
//		checkout.paymentMethodCheckboxButton().click();
//		Thread.sleep(1000);
//		checkout.paymentMethodContinueButton().click();
//		Thread.sleep(1000);
//		checkout.confirmOrderContinueButton().click();
//		Thread.sleep(1000);
//		productpage productpage = new productpage();
		//productpage.odrderPlacedMessage().getText();
		
	}
	
	

	@BeforeMethod
	public void openApplication() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
}	
	

	
	
//	@AfterMethod
//	public void closebrowser()
//	{
//		driver.close();
//	}

