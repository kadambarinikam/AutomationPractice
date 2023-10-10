package javaOperators;

public class BreakStatement2 {

	public static void main(String[] args) {
		int i = 1;
		for(; i <= 50; i++) {
			if(i == 15) {
				break;
			}
			System.out.println(i);
		}
	}

}
