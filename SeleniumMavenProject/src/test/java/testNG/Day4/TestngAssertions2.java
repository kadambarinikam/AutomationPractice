package testNG.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.SeleniumUtility;

public class TestngAssertions2 extends SeleniumUtility {
	
	@Test
	public void SwagLabLoginPageLookAndFeelTC() {
		
		System.out.println("Testcase execution starts here");
		
		WebDriver driver = setUp("chrome","https://www.saucedemo.com/");
		
//      In order to use soft assert, create object of SoftAssert class 
		SoftAssert softAssert = new SoftAssert();
		
		WebElement logoText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		softAssert.assertTrue(logoText.isDisplayed());
		
		WebElement userNameField = driver.findElement(By.id("user-name"));
		softAssert.assertTrue(userNameField.isDisplayed(), "Username Field is Displayed");
		
		WebElement passwrdField = driver.findElement(By.id("password"));
		softAssert.assertTrue(!passwrdField.isDisplayed(), "Password Fiels is not Displayed");//purposely failing this statement
		
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		softAssert.assertTrue(loginBtn.isDisplayed());
		
		//  In order to execute soft assert, call assertAll();
		  softAssert.assertAll();
		
		
		System.out.println("Testcase execution ends here");
		driver.close();
		
		
	}

}
