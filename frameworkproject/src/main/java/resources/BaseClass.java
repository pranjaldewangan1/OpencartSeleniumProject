package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException{
	
		prop = new Properties();
		
		String propPath = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(propPath);
		
		prop.load(fis);
		
		
		
		
		String browserName1 = prop.getProperty("browser");
		
		if(browserName1.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		
		else if (browserName1.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		}
		else if(browserName1.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
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

