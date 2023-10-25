package testNG.Day3;

import org.testng.annotations.Test;

public class SixthTestngClass {
  @Test(priority = 1 , description = "Acc_Registration", enabled = true)
  public void testCase1() {
	  System.out.println("TestCase1");
  }
  
 // here we are adding timeout of 10 sec
  @Test(priority = 1 , description = "User_Login", enabled = true, timeOut = 10000)
  public void testCase2() throws InterruptedException {
	  System.out.println("TestCase2");
	  Thread.sleep(12000);
  }
  
  @Test(priority = 1 , description = "ticket_booking", enabled = true)
  public void testCase3() {
	  System.out.println("TestCase3");
  }
  
  @Test(priority = 1 , description = "User_Logout", enabled = true)
  public void testCase4() {
	  System.out.println("TestCase4");
  }
}
