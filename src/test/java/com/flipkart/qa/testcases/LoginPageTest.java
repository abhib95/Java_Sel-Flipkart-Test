package com.flipkart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LandingPage;
import com.flipkart.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	LandingPage landingPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage.clickSignInLink();
		
	}
	
	@Test()
	public void loginActionTest() {
		landingPage = loginPage.performLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
