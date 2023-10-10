package javaVariables;

public class LocalVariables1 {

	public static void main(String[] args) {
	byte b;
	//System.out.println(b);//it cannot print bcoz it is mandatory to initialize local variable before use

	b=15 ;//here local variable has been initialized ,now one can use it
			System.out.println(b);
			
			
			int x,y,addition;
			//addition = x + y;//we cannot use x and y since they are not initialized
			x = 10;
		    y = 20;
		    addition = x + y;
		    System.out.println(addition);
			
	}

}
