package javaConditionStatement;

public class SwitchCase2 {

	public static void main(String[] args) {
		
   int a , b ;
   char operator = '*';
   
   switch (operator) {
  
   case '+' :
	   a = 15;
	   b = 10;
	   System.out.println("Addition is : " + (a + b)) ;
	   
   case '-' :
	   a = 34;
	   b = 23;
	   System.out.println("Subtraction is : " + (a - b));
	   
   case '*' :
	   a = 50;
	   b = 10;
	   System.out.println("Multiplication is : " + (a * b));
	   
   case '%' :
	   a = 100;
	   b = 3;
	   System.out.println("Remainder is : " + (a % b));
   }
		   
 

	}

}
