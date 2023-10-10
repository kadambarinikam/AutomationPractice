package javaTypeCasting;

public class CharacterAsciiValue {

	public static void main(String[] args) {
		
// to get the ascii value from the character or to get the chracter from the ascii
// value we can use typecasting		
		
		char ch = 'b';
		int b = ch; // here ascii value of 'b' will be stored in variable b
		System.out.println(b);
		
		int a = 97;
		char ch1 = (char)a;
		System.out.println(ch1); // here character having ascii value as 97 will be 
		                       // stored in variable ch1
	}
}