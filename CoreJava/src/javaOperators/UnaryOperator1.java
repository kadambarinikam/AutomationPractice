package javaOperators;

public class UnaryOperator1 {

	public static void main(String[] args) {
		int a = 1, i;
// a++ --> post increment
// ++a --> pre increment

//      a = 1,2,3,4
		i = a++ + a++ + a + a++; // 1 + 2 + 3 + 3
		System.out.println("i = " + i + ", a = " + a); // i = 9, a = 4
		
		i = 0;
		a = 1;
		
//      a = 1,2,3,4
	    i = a++ + a + a++ + a + a++; // 1 + 2 + 2 + 3 + 3 
	    System.out.println("i = " + i + ", a = " + a); // i = 11, a = 4
	    
	    i = 0;
	    a = 1;
	    i = a + a + a++ + a++ + a++ + a++ + a;
	    System.out.println("i = " + i + ", a = " + a); // i = 17, a = 5
	    
	    i = 0;
	    a = 1;
	    
	    i = ++a + ++a + a + ++a;
	    System.out.println("i = " + i + " , a = " + a);// i = 12 , a = 4
	    
	    i = 0;
	    a = 1;
	    
	    i = ++a + a++ + ++a + a++ + ++a;
	    System.out.println("i = " + i + " a = " + a);
	    

	}

}
