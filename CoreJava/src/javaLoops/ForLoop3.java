package javaLoops;

public class ForLoop3 {
	
	public static void printEvenNumbers() {
		
		for(int i = 2; i<= 200; i++) {
			//for loop is used to iterate between 1 - 200
			if((i % 2)== 0) { //condition statement is used to check number is even or not
				System.out.println(i);
		}
     }
}
	

	
	
	public static void printOddNumbers() {
		//print all the odd numbers between 1 - 200
				for(int i =  1; i <= 200; i++) {
					if ((i % 20 )!= 0) {
						System.out.println(i);
						
						
					}
				}
		}
	
		
	
		

	
	public static void main(String[] args) {
		ForLoop3.printEvenNumbers();
		
		System.out.println("*********");
		ForLoop3.printOddNumbers();
		
	}
}

	
		

	
	
		
	
		