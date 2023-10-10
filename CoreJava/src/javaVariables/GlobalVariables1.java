package javaVariables;

public class GlobalVariables1 {
	
	int i;
	long l;
	short s;
	byte b;
	char ch;
	float f;
	double d;
	String str;
	boolean flag;
	
//the above variables are non static(instance or object	) global variables
//here we are declaring the variables and the variables are not initialized
//if we dont initialize the variables then the compiler will initialize them with their respective default value
	

	public static void main(String[] args) {
		 
		double d1= 3.14;
	//here d1 is local variable	
		
		//let's create the object of current class
		
		GlobalVariables1 obj = new GlobalVariables1();
		
		

		System.out.println(obj.b);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.s);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.ch);
		System.out.println(obj.flag);
		System.out.println(obj.str);
				
	

	}

}
