package Assignments;

public class WhileLoopAsciiValue {

	public static void main(String[] args) {
		//Print ascii values of A - Z
		
		char ch = 'A';
		System.out.println("Character" +"\t" + "Ascii Value");
		while(ch <= 'Z') {
			System.out.println("  " + ch + "\t\t" + "  " + (int)ch);
			ch++;
		}
	}

}
