package com.What_A_Chart.PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public static Logger log = Logger.getLogger(HomePage.class);
	
	@FindBy(xpath ="//span[text()='My Account']")
	private WebElement my_Account ;
	
	@FindBy(xpath ="//a[text()='Register']")
	private WebElement register ;
	
	@FindBy(xpath ="//a[text()='Login']")
	private WebElement login ;
	
	@FindBy(xpath ="//span[text()='Wish List']")
	private WebElement wish_List ;
	
	@FindBy(xpath ="//span[text()='Shopping Cart']")
	private WebElement shopping_Cart ;
	
	@FindBy(xpath ="//span[text()='Checkout']")
	private WebElement checkout ;
	
	@FindBy(xpath ="//span[text()='Compare']")
	private WebElement compare ;
	
	@FindBy(id ="navbarsearchform-keyword")
	private WebElement searchBox ;
	
	@FindBy(id ="//button[@name='navsearch']")
	private WebElement searchBtn ;
	
	@FindBy(linkText ="Desktops")
	private WebElement desktops ;
	
	@FindBy(linkText ="Laptops & Notebooks")
	private WebElement laptops_Notebooks ;
	
	@FindBy(linkText ="Camera")
	private WebElement camera ;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("log4j.properties"));
			PropertyConfigurator.configure(properties);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
	
	public void openRegisterPage()
	{
		if(register.isEnabled())
		{
			my_Account.click();
			register.click();
		}
		else	
		{
			log.info("my_Account register Element Is Not Enabled");
		}
	}
	
	public void openLoginPage()
	{
		if(login.isEnabled())
		{
			my_Account.click();
			login.click();
		}
		else	
		{
			log.info("my_Account login Element Is Not Enabled");
		}
	}
	
	public void clickOnWish_List()
	{
		if(wish_List.isEnabled())
		{
			wish_List.click();
		}
		else	
		{
			log.info("wish_List Element Is Not Enabled");
		}
	}
	
	public void clickOnShopping_Cart()
	{
		if(shopping_Cart.isEnabled())
		{
			shopping_Cart.click();
		}
		else	
		{
			log.info("shopping_Cart Element Is Not Enabled");
		}
	}

	public void clickOnCheckout()
	{
		if(checkout.isEnabled())
		{
			checkout.click();
		}
		else	
		{
			log.info("checkout Element Is Not Enabled");
		}
	}

	public void clickOnCompare()
	{
		if(compare.isEnabled())
		{
			compare.click();
		}
		else	
		{
			log.info("compare Element Is Not Enabled");
		}
	}

	public void sendValueInSearch(String text)
	{
		if(searchBox.isEnabled())
		{
			searchBox.sendKeys(text);
		}
		else	
		{
			log.info("searchBox Element Is Not Enabled");
		}
	}
	
	public void clickOnSearchButton()
	{
		if(searchBtn.isEnabled())
		{
			searchBtn.click();
		}
		else	
		{
			log.info("searchBtn Element Is Not Enabled");
		}
	}
	
	public void clickOnDesktops()
	{
		if(desktops.isEnabled())
		{
			desktops.click();
		}
		else	
		{
			log.info("Desktops Element Is Not Enabled");
		}
	}
	
	public void clickOnLaptops_Notebooks()
	{
		if(laptops_Notebooks.isEnabled())
		{
			laptops_Notebooks.click();
		}
		else	
		{
			log.info("Laptops_Notebooks Element Is Not Enabled");
		}
	}

	public void clickOnCamera()
	{
		if(camera.isEnabled())
		{
			camera.click();
		}
		else	
		{
			log.info("camera Element Is Not Enabled");
		}
	}
}
