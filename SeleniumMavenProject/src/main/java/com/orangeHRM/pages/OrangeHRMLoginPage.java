package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class OrangeHRMLoginPage extends SeleniumUtility {
	WebDriver driver;
	
	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

//  declaring the required web elements from the login page
	@FindBy(name ="username")
	WebElement usernameField;
	
	@FindBy(name ="password")
    WebElement passwordField;
	
	@FindBy(css =".orangehrm-login-button")
	WebElement loginBtn;
	
//  create methods for user actions on Login page
	public void login(WebDriver driver, String username , String password) {
		typeInput(driver, usernameField, username);
		typeInput(driver, passwordField, password);
		clickOnElement(driver, loginBtn);
		
	}
}
