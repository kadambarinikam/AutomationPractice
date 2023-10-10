package javaBasics;

public class LeapYearAndOperator {

	public static void main(String[] args) {
	
		int year = 2000;
		if ((year% 100) == 0 && (year % 400) == 0) {
			System.out.println(year + " is a Leap Year");
		}else {
			System.out.println(year + " is not a Leap Year");
		}
	}

}




// &&
//true && true   ==> true
//false && true  ==> false
//true && false  ==> false
//false && false ==> false