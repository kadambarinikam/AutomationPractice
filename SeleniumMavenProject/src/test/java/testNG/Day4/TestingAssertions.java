package testNG.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class TestingAssertions extends SeleniumUtility{

//  Assertions in testng provides the way to verify and validate expected result
//  TestNg offer two types of assertions : 1.HardAsserts(default)     2.SoftAsserts

//  HardAssert can be used using Assert class from testng library
//  SoftAssert can be used using SoftAssert class from Testng library
	
//  HardAssert are the assert that stop the test execution when an assert statement fails
//  HardAssert are used for validations
	
//  SoftAssert are the assert that will not stop the test execution when an assert statement fails
//  SoftAssert are used for verifications
	@Test
	public void swagLabLoginTC() throws InterruptedException {
		
		System.out.println("Test case execution starts here");
		
		WebDriver driver = setUp("chrome","https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
		String expectedHomePageUrl = "https://www.saucedemo.com/inventory1.html";
		String actualHomePageUrl = driver.getCurrentUrl();
		
//		Assert.assertEquals( actualHomePageUrl, expectedHomePageUrl);
//      Asserts that two strings are equal .If they are not, an AssertionError is thrown.
//      Since we are using Hard Assert here , it will stop the test case execution if assert statement fails
		
		Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl, "Home page url not matched");
//      Asserts that two strings are equal .If they are not, an AssertionError with the given message is thrown.
		
//		Assert.assertNotEquals(actual, expected);
//		Assert.assertNotEquals(actual, expected, error message);
		
//      Assert.assertFalse(condition);// if condition is false then statement will pass
//      Assert.assertTrue(condition); // if condition is true then statement will pass
		
		driver.close();
		System.out.println("Test case execution ends here");
		
	}
}
