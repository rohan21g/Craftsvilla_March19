package com.craftsvilla.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.HomePage;

public class TpScript extends BaseTest
{
	HomePage hp= null;
	

	@Test
	public void SignIn()
	{
		hp = new HomePage(driver);
		
		
		try
		{
			hp.clickOnSignButton();
		}
		catch(Exception E)
		{
			Reporter.log("Test case fail");	
		}
	}


}
