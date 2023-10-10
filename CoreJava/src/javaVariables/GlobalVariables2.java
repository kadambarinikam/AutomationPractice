package javaVariables;

public class GlobalVariables2 {
	int i;//non static variable
	static int i1;//static variable
	
	static char ch = 'a';//static variable
	char ch1 = 'A';//non static variable
	
	static double d;
	
	public static void main(String[] args) {
		GlobalVariables2 obj = new GlobalVariables2();//object is created
		
		System.out.println(obj.i1);//accessing static variable using class object
		System.out.println(i1);//accessing static variable using variable name
		System.out.println(GlobalVariables2.i1);//accessing static variable using class name
		
		

	}

}
