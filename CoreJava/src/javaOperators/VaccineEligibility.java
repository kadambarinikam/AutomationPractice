package javaOperators;

public class VaccineEligibility {
	
	public static void main(String[] args) {
		int age = 74;
		if (age >= 18 && age <= 65) {
			System.out.println("You are eligible for vaccination");
		}else {
			System.out.println("you are not eligible for vaccination");
			System.out.println("Vaccine for your age is under trial");
		}
	}

}



//18 < age <= 65 ==> eligible for vaccination
//Imp Note: If any block such as if, else, for, while has only one statement, 
// then we can omit {}