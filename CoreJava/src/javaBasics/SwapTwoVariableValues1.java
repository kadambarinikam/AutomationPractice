package javaBasics;

public class SwapTwoVariableValues1 {

	public static void main(String[] args) {
		int a = 35, b = 50;
		
		System.out.println("Before Swaping");
		System.out.println("a = " + a + ", b = " + b);
		
		a = a + b; // a = 85
		
		b = a - b; // b = 35
		
		a = a - b; // a = 50
		
		System.out.println("After Swaping");
		System.out.println("a = " + a + ", b = " + b);

	}

}
