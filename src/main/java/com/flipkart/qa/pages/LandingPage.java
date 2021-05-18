package com.flipkart.qa.pages;

import com.flipkart.qa.base.TestBase;

public class LandingPage extends TestBase{
	
	public String verifyLandingPageTitlte() {
		return driver.getTitle();
		
	}

}
