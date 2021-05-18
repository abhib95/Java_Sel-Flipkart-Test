package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory
	
	@FindBy(id = "userid")
	WebElement username;
	
	@FindBy(id = "pass")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@name = 'sgnBt']")
	WebElement SignInButton;
	
	@FindBy(xpath = "//button[@name = 'signin-continue-btn']")
	WebElement continueButton;
	
	//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	 
	//Actions
	public String validateLoginPage() {
		return driver.getTitle();
	}
	
	public LandingPage performLogin(String un, String pwd) {
		username.sendKeys(un);
		continueButton.click();
		passwordField.sendKeys(pwd);
		SignInButton.click();
		
		return new LandingPage();
	
	}
	
	

	
	
}
