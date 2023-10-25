package javaScriptExecuter;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class JavaScriptExecuter1 extends SeleniumUtility{
	
@Test
public void testCase1() {
	WebDriver driver = setUp("chrome", "https://www.browserstack.com/users/sign_in");
	
	JavaScriptExecuter js = (JavaScriptExecuter) driver;
	
	
}


}
