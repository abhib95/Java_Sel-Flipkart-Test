package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory
	
	@FindBy(xpath = "(//a[contains(text(),'Sign in')])[1]")
	WebElement signInLink;
	
	@FindBy(id = "gh-logo")
	WebElement ebayLogo;
	
	@FindBy(id = "gh-btn")
	WebElement searchButton;
	
	//Initialiazing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateHomePage() {
		return driver.getTitle();
	}
	
	public boolean validateEbayLogo() {
		return ebayLogo.isDisplayed();
	}
	
	public LoginPage clickSignInLink() {
		signInLink.click();
		return new LoginPage();
		
	}

}
