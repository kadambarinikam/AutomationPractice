package javaOperators;

public class ResultCalculator {

	public static void main(String[] args) {
		int marks = 56;

		if (marks < 35) {
			System.out.println("You are failed");
		}

		if (marks >= 35 && marks < 55) {
			System.out.println("Pass class");
		}

		if (marks >= 55 && marks < 65) {
			System.out.println("Second class");
		}

		if (marks >= 65 && marks < 75) {
			System.out.println("First class");
		}

		if (marks >= 75) {
			System.out.println("Distinction class");
		}
	}
}

//marks < 35 ==> fail
// marks >= 35 and marks < 55 ==> pass class
// marks >= 55 and marks < 65 ==> second class
// marks >= 65 and marks < 75 ==> first class
// marks >= 75                ==> distinction
