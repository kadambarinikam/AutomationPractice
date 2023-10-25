package testNG.Day4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	@BeforeTest
	public void beforeAllTest() {
		System.out.println("Launch the browser");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class annotation");
	}
	
	
	@BeforeMethod
	public void beforeTestCase() {
		System.out.println("User launch the required application");
	}
	
	@Test(description = "Login Page")
	public void testCase1() {
		System.out.println("TestCase1");
	}

	@Test(description = "Home Page")
	public void testCase2() {
		System.out.println("TestCase2");
	}
	
	@AfterMethod
	public void afterEachTestCase() {
		System.out.println("Update the test case pass and fail status in the report ");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class annotation");
	}
	@AfterTest
	public void afterAllTestCase(){
		System.out.println("Close the browser and stop the testing");
	}
}
