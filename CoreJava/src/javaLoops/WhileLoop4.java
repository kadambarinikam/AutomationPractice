package javaLoops;

public class WhileLoop4 {

	public static void main(String[] args) {
		//print characters for ascii value between 48 - 127
		
		int i = 48;
		System.out.println("AsciiValue" + "      " + "Character");
		while(i <= 127) {
			System.out.println( i + " \t  :  \t " + (char)i);
			i++;
		}

	}

}
