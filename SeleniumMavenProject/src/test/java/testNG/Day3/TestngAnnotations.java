package testNG.Day3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
//  TestNg provides many annotations to write the good test code
//  Below are the TestNg annotations in the order of execution
//	1. @BeforeSuite    --> executes before the execution of suite
//	2. @AfterSuite     --> executes before all the test cases once
//	3. @BeforeClass    --> executes before the first method invokes of the current class
//	4. @BeforeMethod  --> executes before each test case method
//	5. @Test          --> 
//	6. @AfterMethod   --> executes after each test case method
//	7. @AfterClass    --> executes after all the test method of current class executed
//	8. @AfterTest     --> executes after all the test cases
//	9. @AfterSuite    --> executes after the execution of the suite
	
	
	@BeforeTest
	public void beforeAllTest() {
		System.out.println("Launch the browser");
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
	
	@AfterTest
	public void afterAllTestCase(){
		System.out.println("Close the browser and stop the testing");
	}
}
