package testNG.Day5A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class ParallelExecution extends SeleniumUtility {



	@Test
	public void testVtigerLogin() throws InterruptedException {
		WebDriver driver = setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));

		usernameField.clear();
		usernameField.sendKeys("admin");

		passwordField.clear();
		passwordField.sendKeys("admin");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);

//      Verify that user is on home page using Vtiger logo
		WebElement vTigerLogoHomePage = driver.findElement(By.cssSelector(".company-logo"));

		Assert.assertTrue(vTigerLogoHomePage.isDisplayed());
		driver.close();

	}

	@Test
	public void testOrangeHRMLogin() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(text(),orangehrm-login-button)]")).click();
		Thread.sleep(3000);

		// Verify that user is in OrangeHRM Home Page
		String expectedHomePageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualHomePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl);
		driver.close();

	}

	@Test
	public void testActiTimeLogin() throws InterruptedException {
		WebDriver driver = setUp("opera", "https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);

		String expectedHomePageUrl = "https://demo.actitime.com/user/submit_tt.do";
		String actualHomePageUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl);
		driver.close();

	}

