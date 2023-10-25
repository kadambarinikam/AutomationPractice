package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMHomePage {
	
	@FindBy(css="a[class='oxd-main-menu-item active']")
	WebElement pim;
	
	@FindBy(xpath="//a[contains(text(),'Add Employee')]" )
	WebElement addEmployee;
	
	@FindBy(css = "input[name = 'firstName']")
	WebElement firstName;
	
	@FindBy(css = "input[name = 'middleName']")
	WebElement middleName;

	@FindBy(css = "input[name = 'lastName']")
	WebElement lastName;

	
}
