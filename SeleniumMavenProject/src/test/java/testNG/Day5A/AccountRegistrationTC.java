package testNG.Day5A;

import org.testng.annotations.Test;

public class AccountRegistrationTC {

	@Test(groups = "Smoke")
	public void testCase1() {
		System.out.println("This is test case 1");
	}

	@Test(groups = "Smoke")
	public void testCase2() {
		System.out.println("This is test case 2");
	}

	@Test(groups = "Regression")
	public void testCase3() {
		System.out.println("This is test case 3");
	}
}
