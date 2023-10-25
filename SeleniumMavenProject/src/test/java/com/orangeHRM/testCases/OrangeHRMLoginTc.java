package com.orangeHRM.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orangeHRM.pages.OrangeHRMLoginPage;

import utility.SeleniumUtility;

public class OrangeHRMLoginTc extends SeleniumUtility{
	WebDriver driver;
	OrangeHRMLoginPage oHRMLogin;
	
	@Test
	public void TC_01() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		oHRMLogin = new OrangeHRMLoginPage(driver);
		
		oHRMLogin.login(driver, "Admin", "admin123");
		
		
		}
}
