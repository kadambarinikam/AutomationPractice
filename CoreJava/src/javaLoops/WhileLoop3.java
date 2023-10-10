package javaLoops;

public class WhileLoop3 {

	public static void main(String[] args) {
	//Print ascii values of a - z
		char ch = 'a';
		
		System.out.println("Character" + "     " + "Ascii Value");
		while(ch <= 'z') {
			//System.out.println((int)ch);
			//System.out.println(ch + " " + (int)ch);
			//System.out.println(ch + "\t" + (int)ch);   
			System.out.println(ch + "\t\t" + (int)ch);
	// "\t" means tab key which adds space		
			
			ch++;
		}
		
	}

}
