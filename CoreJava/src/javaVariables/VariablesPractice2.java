package javaVariables;

public class VariablesPractice2 {

	public static void main(String[] args) {
//here we will discuss about initializing variables
//lets declare some variables
		int i;
		float f;
		double d;
		char ch;
		boolean flag;
		
		String str;
		
//syntax for initializing the variables is --->variableName = value
		
		i=50;
		f=98.22f;
//by default java consider decimal number as double datatype numbers
//to specify that value is float datatype we must write f in the end of value
		
		d=165.27;
		ch='J';
		flag=false;
		str="Java Programs";
		
		//let's print values of variables
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(flag);
		System.out.println(str);

	}

}
