package javaConditionStatement;

public class IfElseLadder1 {

	public static void main(String[] args) {
		int marks  = 73;
		
		if(marks < 35) {
			System.out.println("You are Failed");
		}else if(marks < 55) {
			System.out.println("You are passed with Pass class");
		}else if(marks < 65) {
			System.out.println("You are Passed with Second class");
		}else if(marks < 75) {
			System.out.println("You are passed with First class ");
		}else if(marks > 75) {
			System.out.println("You are Passed with Distinction");
		}
	

	}

}



//check the students marks and accordingly print the results for following data
//if (marks < 35)---> print fail
//if (35 <= marks > 55)--->print pass class
//if (55<= marks > 65)---> second class
//if (65 <= marks > 75)--->first class
//if (marks >= 75)---> Distinction