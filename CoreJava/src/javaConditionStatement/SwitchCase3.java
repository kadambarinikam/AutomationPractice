package javaConditionStatement;

public class SwitchCase3 {

	
	public static void calculator(char operator , int a ,int b) {
		switch (operator) {
		  
		   case '+' :
			   
			   System.out.println("Addition is : " + (a + b)) ;
			   
		   case '-' :
			  
			   System.out.println("Subtraction is : " + (a - b));
			   
		   case '*' :
			  
			   System.out.println("Multiplication is : " + (a * b));
			   
		   case '%' :
			 
			   System.out.println("Remainder is : " + (a % b));
		   }
				   
	}
	public static void main(String[] args) {
		
		SwitchCase3.calculator('*',20,30);//here we are calling the method
		SwitchCase3.calculator('-',30,40);
		SwitchCase3.calculator('+',6,8);
		
		
	

	}

}
