package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
@FindBy(id="cartCount")
private WebElement cartbutton;

@FindBy(xpath="//span[text()='Sign In']")
private WebElement signin;

@FindBy(name="q")
private WebElement search;

@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
private WebElement saree;

public HomePage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}

public void clickOnCartButton()
{
	try
	{
		verifyElementPresent(cartbutton);
		cartbutton.click();
		log.info("Sucessfully clicked on"+cartbutton);
		
	}
	catch(Exception e)
	{
		log.error("Unable to clicked on" +cartbutton+ ":" +e);
	}	
}

public void clickOnSignButton()
{
	try
	{
		verifyElementPresent(signin);
		signin.click();
		log.info("Sucessfully clicked on" +signin);
	}
	catch(Exception e)
	{
		log.error("Unable to clicked on" +signin+ ":" +e);
	}
}

public void setSearchString(String searchValue)
{
	try
	{
		verifyElementPresent(search);
		search.sendKeys(searchValue);
		log.info("Placed the" +searchValue+ "Sucessfully to " +search);
	}
	catch(Exception e)
	{
		log.error("Unable to set string to" +search +e);
	}
}

public void goToSareesLink()
{
	try
	{
		verifyElementPresent(saree);
		mouseHover(driver, saree);
		log.info("MouseHovered on" +saree);
	}
	catch(Exception e)
	{
		log.error("Unable to MouseHovered on " +saree+ ":" +e);
	}
}


}
