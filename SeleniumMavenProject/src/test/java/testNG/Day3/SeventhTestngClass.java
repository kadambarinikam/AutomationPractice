package testNG.Day3;

import org.testng.annotations.Test;

public class SeventhTestngClass {

	@Test(priority = 1, description = "Acc_Registration")
	public void testCase1() {
		System.out.println("TestCase1");
	}

	@Test(priority = 1, description = "User_Login", dependsOnMethods = "testCase1")
	public void testCase2() {
		System.out.println("TestCase2");
		int i = 5/0; // added purposely to fail the test case
	}

	@Test(priority = 1, description = "ticket_booking", dependsOnMethods = "testCase2")
	public void testCase3() {
		System.out.println("TestCase3");
	}

	@Test(priority = 1, description = "User_Logout", dependsOnMethods = "testCase3")
	public void testCase4() {
		System.out.println("TestCase4");
	}
}
// If any of the Test case depends on another test case for its execution, then we can use dependsOnMethods parameter