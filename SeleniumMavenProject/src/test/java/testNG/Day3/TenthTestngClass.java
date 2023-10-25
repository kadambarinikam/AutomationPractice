package testNG.Day3;

import org.testng.annotations.Test;

@Test
public class TenthTestngClass {
 
  public void testCase1() {
	  System.out.println("TestCase1");
  }
  
  public void testCase2() {
	  System.out.println("TestCase2");
  }
  
  public void testCase3() {
	  System.out.println("TestCase3");
  }
  
  void testCase4() {
	  System.out.println("TestCase4"); // this test case will be not run as access specifier is not assigned
  }
}
// In case of class level annotations ;
// It will run all those test case method s which will have public as access specifier and void as return type