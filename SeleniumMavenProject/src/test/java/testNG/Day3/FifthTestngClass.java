package testNG.Day3;

import org.testng.annotations.Test;

public class FifthTestngClass {
	@Test(priority = 1, description = "Acc_Registration", enabled = true)
	public void testCase1() {
		System.out.println("TestCase1");
	}
	
	@Test(priority = 1, description = "User_Login", enabled = true)
	public void testCase2() {
		System.out.println("TestCase2");
	}
	
	@Test(priority = 1, description = "ticket_booking", enabled = false)
	public void testCase3() {
		System.out.println("TestCase3");
	}
	
	@Test(priority = 1, description = "User_Logout", enabled = true)
	public void testCase4() {
		System.out.println("TestCase4");
	}
}
//  In order to decide which test case is to be executed and which test case is not to be executed
//  to do so use enabled parameter, keep enabled = false for the test case which are not to be executed
//  If we don't specify the enabled parameter for any of the test case, then testing will assign enabled = true for that test case 