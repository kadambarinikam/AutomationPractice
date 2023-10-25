package testNG.Day6;

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class DataProviderPract1 extends SeleniumUtility{
	@Test
	public void testActiTimeLogin(String browser, String appUrl, String username, String password) throws InterruptedException {
		WebDriver driver = setUp(browser, appUrl);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);

		String expectedHomePageUrl = "https://demo.actitime.com/user/submit_tt.do";
		String actualHomePageUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl);
		driver.close();
	}
		
	
		
		public String[][] getData(){
			String[][] data = new String[2][4];
			
//      1sr record
			data[0][0] ="edge";
			data[0][1]= ""		
		}
	}
}
