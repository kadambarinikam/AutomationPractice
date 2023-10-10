package javaBasics;

public class SwapTwoVariableValues {

	public static void main(String[] args) {
		int a = 35, b = 50, temp;
		
		System.out.println("Before swaping");
		System.out.println("a = " + a + ", b = " + b);
		temp =a;
		a = b;
		b = temp;
		System.out.println("After swaping");
		System.out.println("a = " + a + ", b = " + b);
		
	}

}
