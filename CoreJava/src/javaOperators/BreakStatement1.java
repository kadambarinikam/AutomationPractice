package javaOperators;

public class BreakStatement1 {

	public static void main(String[] args) {
		int i = 1;
		
		for(; i <= 100; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			if(i == 75) {
			break;
		}
	
	}

}
}












// Print all the numbers between 1 - 100 which are divisible by 5

// stop printing the numbers if number value becomes 75 