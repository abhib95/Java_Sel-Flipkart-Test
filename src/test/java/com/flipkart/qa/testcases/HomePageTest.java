package com.flipkart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		 homepage = new HomePage();
	
	}
	
	@Test(priority =1)
	public void HomePageTitleTest() {
		String title = homepage.validateHomePage();
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");	
	}
	
	@Test(priority = 2)
	public void ebayImageTest() {
		boolean flag = homepage.validateEbayLogo();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
