package com.WhatAChart.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.What_A_Chart.PageObjects.HomePage;
import com.What_A_Chart.PageObjects.LoginPage;
import com.What_A_Chart.uttilites.ExcelRead;

import junit.framework.Assert;

public class LoginTest extends BaseClass
{
	
	HomePage hp;
	LoginPage lp ;
	
	
	@Test
	public void TC_LOGIN_001() throws Exception
	{
		driver.navigate().to(BaseUrl);
		log.info("Open What_A_Chart Website : "+driver.getTitle());
		
		
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		
		hp.openLoginPage();
		String username =ExcelRead.readData(11,4);
		String password =ExcelRead.readData(12,4);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnRememberMe();
		lp.clickOnLoginBtn();
		
		driver.navigate().refresh();
		String act_title = driver.getTitle();
		String exp_title = "Home"; 	
		log.info("TC_LOGIN_001 : Atual Title : "+ act_title +" "+" Expected Title : "+exp_title);
		Assert.assertEquals(act_title, exp_title);
	}
	
	@Test
	public void TC_LOGIN_002() throws Exception
	{
		driver.navigate().to(BaseUrl);
		log.info("Open What_A_Chart Website : "+driver.getTitle());
		
		
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		
		hp.openLoginPage();
		String username =ExcelRead.readData(16,4);
		String password =ExcelRead.readData(17,4);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnRememberMe();
		lp.clickOnLoginBtn();
		
		driver.navigate().refresh();
		String act_title = driver.getTitle();
		String exp_title = "Home"; 	
		log.info("TC_LOGIN_002 : Atual Title : "+ act_title +" "+" Expected Title : "+exp_title);
		Assert.assertEquals(act_title, exp_title);
	}
	
	@AfterMethod
	public void Close()
	{
		driver.close();
	}
}
