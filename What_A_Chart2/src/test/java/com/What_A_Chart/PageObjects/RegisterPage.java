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


public class RegisterPage 
{
	@FindBy(id = "customer-username")
	private WebElement username ;
	
	@FindBy(id ="//span[text()='Asia/Kolkata']")
	private  WebElement timezone;
	
	@FindBy(id ="customer-password")
	private  WebElement password ;
	
	@FindBy(id ="customer-confirmpassword")
	private  WebElement confirmpassword;
	
	@FindBy(linkText ="Person")
	private  WebElement personTab ;
	
	@FindBy(id ="person-firstname")
	private  WebElement firstname ;
	
	@FindBy(id ="person-lastname")
	private  WebElement lastname ;
	
	@FindBy(id ="person-email")
	private  WebElement email ;
	
	@FindBy(id ="person-mobilephone")
	private  WebElement mobilephone ;
	
	@FindBy(id ="person-profile_image")
	private  WebElement profile_image ;

	@FindBy(linkText ="Address")
	private  WebElement addressTab ;
	
	@FindBy(id ="address-address1")
	private  WebElement address1 ;
	
	@FindBy(id ="address-address2")
	private  WebElement address2 ;
	
	@FindBy(id ="address-city")
	private  WebElement city ;
	
	@FindBy(id ="address-state")
	private  WebElement state ;
	
	@FindBy(xpath ="//span[text()='India']")
	private  WebElement country ;
	
	@FindBy(id ="address-postal_code")
	private  WebElement postal_code ;

	@FindBy(xpath ="//button[text()='Continue']-postal_code")
	private  WebElement continueBtn ;

	public static Logger log = Logger.getLogger(LoginPage.class);

	public RegisterPage(WebDriver driver)
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
		
	public void settimezone()
	{
		if(timezone.isEnabled())
		{
			timezone.click();
		}
		else	
		{
			log.info("timezone Element Is Not Enabled");
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
	
	public void setConfirmPassword(String text)
	{
		if(confirmpassword.isEnabled())
		{
			confirmpassword.sendKeys(text);
		}
		else	
		{
			log.info("confirmpassword Element Is Not Enabled");
		}
	}
	
	public void clickOnPersonTab()
	{
		if(personTab.isEnabled())
		{
			personTab.click();
		}
		else	
		{
			log.info("personTab Element Is Not Enabled");
		}
	}
	
	public void setFirstName(String text)
	{
		if(firstname.isEnabled())
		{
			firstname.sendKeys(text);
		}
		else	
		{
			log.info("firstname Element Is Not Enabled");
		}
	}
	
	public void setLastName(String text)
	{
		if(lastname.isEnabled())
		{
			lastname.sendKeys(text);
		}
		else	
		{
			log.info("lastname Element Is Not Enabled");
		}
	}
	
	public void setEmail(String text)
	{
		if(email.isEnabled())
		{
			email.sendKeys(text);
		}
		else	
		{
			log.info("email Element Is Not Enabled");
		}
	}
	
	public void setmobile(String text)
	{
		if(mobilephone.isEnabled())
		{
			mobilephone.sendKeys(text);
		}
		else	
		{
			log.info("mobilephone Element Is Not Enabled");
		}
	}
	
	public void clickOnAddressTab()
	{
		if(addressTab.isEnabled())
		{
			addressTab.click();
		}
		else	
		{
			log.info("addressTab Element Is Not Enabled");
		}
	}
	
	public void clickOnProfileImage()
	{
		if(profile_image.isEnabled())
		{
			profile_image.click();
		}
		else	
		{
			log.info("Profile Image Element Is Not Enabled");
		}
	}
	
	public void setAddress1(String text)
	{
		if(address1.isEnabled())
		{
			address1.sendKeys(text);
		}
		else	
		{
			log.info("address1 Element Is Not Enabled");
		}
	}
	
	public void setAddress2(String text)
	{
		if(address2.isEnabled())
		{
			address2.sendKeys(text);
		}
		else	
		{
			log.info("address2 Element Is Not Enabled");
		}
	}
	
	public void setCity(String text)
	{
		if(city.isEnabled())
		{
			city.sendKeys(text);
		}
		else	
		{
			log.info("city Element Is Not Enabled");
		}
	}
	
	public void setState(String text)
	{
		if(state.isEnabled())
		{
			state.sendKeys(text);
		}
		else	
		{
			log.info("state Element Is Not Enabled");
		}
	}
	
	public void clickOnCountry()
	{
		if(country.isEnabled())
		{
			country.click();;
		}
		else	
		{
			log.info("country Element Is Not Enabled");
		}
	}

	public void setPosatalCode(String text)
	{
		if(postal_code.isEnabled())
		{
			postal_code.sendKeys(text);
		}
		else	
		{
			log.info("postal_code Element Is Not Enabled");
		}
	}
	
	public void clickOnContiuneBtn()
	{
		if(continueBtn.isEnabled())
		{
			continueBtn.click();
		}
		else	
		{
			log.info("continueBtn Element Is Not Enabled");
		}
	}
}
