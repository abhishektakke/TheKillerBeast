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

public class LoginPage 
{
	
	@FindBy(id ="loginform-username")
	private WebElement username ;
	
	@FindBy(id ="loginform-password")
	private WebElement password ;
	
	@FindBy(id ="loginform-rememberme")
	private WebElement remember_Me ;
	
	@FindBy(id ="savebutton")
	private WebElement login ;
	
	public static Logger log = Logger.getLogger(LoginPage.class);

	public LoginPage(WebDriver driver)
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
	public void setUserName(String text)
	{
		if(username.isEnabled())
		{
			username.sendKeys(text);
		}
		else	
		{
			log.info("username Element Is Not Enabled");
		}
	}
	
	public void setPassword(String text)
	{
		if(password.isEnabled())
		{
			password.sendKeys(text);
		}
		else	
		{
			log.info("password Element Is Not Enabled");
		}
	}
	
	public void clickOnRememberMe()
	{
		if(remember_Me.isEnabled())
		{
			remember_Me.click();
		}
		else	
		{
			log.info("remember_Me Element Is Not Enabled");
		}
	}
	
	public void clickOnLoginBtn()
	{
		if(login.isEnabled())
		{
			login.click();
		}
		else	
		{
			log.info("login Element Is Not Enabled");
		}
	}
}
