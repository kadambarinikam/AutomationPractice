package javaOperators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 10;
//      a = a + 5;
		a += 5;
		System.out.println(a); // 15

//		a = a - 10;
		a -= 10;
		System.out.println(a);
		
//		a = a * 2;
		a *= 2;
		System.out.println(a);
		
//		a = a / 2;
		a /= 2;
		System.out.println(a);
		
//		a = a % 3;
		a %= 3;
		System.out.println(a);
			
	}

}

// a = b + 5; ==>a += 5... wrong .we cannot use assignment operator for diff operand 

// write a java program to find the greatest number among three variables using ternary operator