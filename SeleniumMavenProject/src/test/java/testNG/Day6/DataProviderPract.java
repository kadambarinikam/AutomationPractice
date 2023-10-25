package testNG.Day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class DataProviderPract extends SeleniumUtility {

	@Test(dataProvider = "getData")
	public void testCase1(String username, String password) {
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
		System.out.println("***********");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
//  3 - rows   ----> No of records it is going to provide {No of times getData() to be repeated} 
//	2 - column ----> No of data to be provided in single record

//		1st record
		data[0][0] = "admin";
		data[0][1] = "test@123";

//      2nd record
		data[1][0] = "Manager";
		data[1][1] = "Pass@1xyz";
		
//      3rd record
		data[2][0]="Admin";
		data[2][1]="admin123";
		
		return data;

	}
}
