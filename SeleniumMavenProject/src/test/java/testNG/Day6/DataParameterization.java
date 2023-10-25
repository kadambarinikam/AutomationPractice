package testNG.Day6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class DataParameterization extends SeleniumUtility {

	@Parameters({ "browser", "appUrl", "username", "password" })
	
	@Test
	public void testCase1(String browser, String appUrl, String username, String password) {
		System.out.println("Browser : " + browser);
		System.out.println("AppUrl : " + appUrl);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
	
	@Parameters({ "browser", "appUrl", "username", "password" })
	
	@Test
	public void testOrangeHRMLogin(String browser, String appUrl, String username, String password) throws InterruptedException {
		WebDriver driver = setUp(browser, appUrl);
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[contains(text(),orangehrm-login-button)]")).click();
		Thread.sleep(3000);

//      Verify that user is in OrangeHRM Home Page
		String expectedHomePageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualHomePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl);
		driver.close();

	}


	
	}


