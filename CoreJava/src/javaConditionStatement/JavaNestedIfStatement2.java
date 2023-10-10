package javaConditionStatement;

public class JavaNestedIfStatement2 {

	public static void main(String[] args) {
		int age = 70;
		if(age >=18) {
			if(age < 65) {
				System.out.println("You are eligible for Vaccination");
			}
		}
			
			if(age < 18) {
				System.out.println("You are not eligible for Vaccination as you are less than 18");
			}
			
			if(age > 65) {
				System.out.println("You are not eligible for Vaccination as you are more than 65");
			}
			
			
		

	}

}
