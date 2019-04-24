package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConst
{
	public static WebDriver driver=null;
	public static WebDriverWait wait= null;

	@Parameters("browser")
	@BeforeMethod
	public void launchApplication(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		}
		else
		{
		Reporter.log("Invalid browser selection");
		}
		
		wait=new WebDriverWait(driver,30);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(APP_URL);
	}
		
		@AfterMethod
		public void closeApplication()
		{
			driver.quit();
		}
		
	}
	
	
	
	

