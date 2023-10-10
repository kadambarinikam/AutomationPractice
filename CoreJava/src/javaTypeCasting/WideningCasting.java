package javaTypeCasting;

public class WideningCasting {

	public static void main(String[] args) {
		
// Widening Casting: it is process of converting lower datatype to higher datatype
// it can be done implicitly and explicitly
		
		byte b = 125;
		System.out.println("byte b = " + b);
		
		short s = b;// autowidening or auto typecasting (implicitly - by compiler)
		System.out.println("short s = " + s);
		
		long l = s; //implicitly
		long l1 = (long)s; // explicitly- i.e by programmer
		System.out.println("long l =  " + l);
		System.out.println("long l1 = " + l1);
		
		double d = l;
		System.out.println("double d = " + d);
	
	}
}
