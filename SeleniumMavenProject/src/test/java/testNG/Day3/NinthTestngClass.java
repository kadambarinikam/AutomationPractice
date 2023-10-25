package testNG.Day3;

import org.testng.annotations.Test;

// In order to run the test case in any situation, we can use alwaysRun=true parameter
// If we assign enable=false and alwaysRun=true then also that particular test case will not run
//If set to true, this test method will always run if it depends on a method that failed
// this attribute will be ignored if this test doesn't depend on any method or group

public class NinthTestngClass {
	@Test(priority = 1, description = "Acc_Registration")
	public void testCase1() {
		System.out.println("TestCase1");
	}

	@Test(priority = 1, description = "User_Login", dependsOnMethods = "testCase1")
	public void testCase2() {
		System.out.println("TestCase2");
		int i = 5/0 ; // added purposely
	}

	@Test(priority = 1, description = "ticket_booking", dependsOnMethods = "testCase2",alwaysRun = true)
	public void testCase3() {
		System.out.println("TestCase3");
	}

	@Test(priority = 1, description = "User_Logout", dependsOnMethods = "testCase3", alwaysRun = true)
	public void testCase4() {
		System.out.println("TestCase4");
	}
}
