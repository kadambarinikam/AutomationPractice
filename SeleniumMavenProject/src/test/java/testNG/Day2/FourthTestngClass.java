package testNG.Day2;

import org.testng.annotations.Test;

public class FourthTestngClass {
// setting priority, adding description
	
	
  @Test(priority=1, description = "Acc_Registration")
  public void testCase1() {
	  System.out.println("TestCase1");
  }
  
  @Test(priority= 2,description ="User_Login")
  public void testCase2() {
	  System.out.println("TestCase2");
  }
  
  @Test(priority = 3, description = "ticket_booking")
  public void testCase3() {
	  System.out.println("TestCase3");
  }
  
  @Test(priority = 4, description = "User_Logout")
  public void testCase4() {
	  System.out.println("TestCase4");
  }
  
  
  
  
}
