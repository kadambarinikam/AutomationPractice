package testNG.Day3;

import org.testng.annotations.Test;

public class EighthTestngClass {
	@Test(priority = 1, description = "Acc_Registration")
	public void testCase1() {
		System.out.println("TestCase1");
	}

	@Test(priority = 2, description = "User_Login")
	public void testCase2() {
		System.out.println("TestCase2");
	}

	@Test(priority = 3, description = "ticket_booking", invocationCount = 5)
	public void testCase3() {
		System.out.println("TestCase3");
	}

	@Test(priority = 4, description = "User_Logout")
	  public void testCase4() {
		  System.out.println("TestCase4");
		  
    @Test()
		  
}
}
// In order to run one test case more than once , we have to use invocationCount parameter