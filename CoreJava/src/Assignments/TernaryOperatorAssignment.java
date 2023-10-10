package Assignments;

public class TernaryOperatorAssignment {

	public static void main(String[] args) {
		int a = 54, b = 34, c= 67;
		int maxNum;
		
		maxNum = ((a > b) && (a > c) ) ? a : ((b > a) && (b > c)) ? b : c;
		System.out.println("Maximum number is : " + maxNum);

	}

}
