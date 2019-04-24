package com.craftsvilla.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.CartPage;
import com.craftsvilla.pompages.EmbroidedSareesPage;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.ProductDescriptionPage;
import com.craftsvilla.pompages.SareesPage;

public class EmbroidedSaressScripts extends BaseTest
{
HomePage hp= null;
SareesPage sp=null;
EmbroidedSareesPage ep=null;
ProductDescriptionPage pd=null;
CartPage cp=null;

@Test
public void buyEmbroidedSaree()
{
	hp= new HomePage(driver);
	sp=new SareesPage(driver);
	ep=new EmbroidedSareesPage(driver);
	pd=new ProductDescriptionPage(driver);
	cp=new CartPage(driver);
	
	try
	{
		hp.goToSareesLink();
		sp.clickOnEmbroidedSareesLink();
		ep.goToProduct1538760092();
		pd.checkProductName("Craftsvilla Blue Color Silk Designer Resham Embroidery Saree");
		pd.clickOnBuyNow();
		cp.setFirstName("Rohan");
		cp.setEmail("rohan21g@gmail.com");
		cp.setMobile("9594613674");
		Reporter.log("Test case pass");
	}
	catch(Exception E)
	{
		Reporter.log("Test case fail");	
	}
}
}
