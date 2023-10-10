package javaTypeCasting;

public class NarrowingTypeCasting {

	public static void main(String[] args) {
// Narrowing Type Casting --> converting higher datatype into lower datatype
// it has to be done manually, implicit conversion is not possible

		double d = 130.48;

//      casting variable d into float
		float f = (float) d;
		System.out.println("float : " + f);//130.48
		
//      casting variable f & d into long
		long ld = (long)d;
		long lf = (long)f;
		System.out.println("double to long : " + ld);//130 .. here we lost some data as 0.48
		System.out.println("float to long : " + lf);

//      casting variables d, f & ld into int
		int iD = (int) d;
		int iF = (int) f;
		int iL = (int) ld;
		System.out.println("double to int : " + iD);
		System.out.println("Float to int : " + iF);
		System.out.println("long to int : " + iL);
		
//      casting variable d, iL into byte
		byte b = (byte) d;
		System.out.println("double to byte : " + b );
		 double d1 = -135;
		 byte b1 = (byte)d1;
		 System.out.println("double d1 to byte b1 : " + b1);
		
	}
}
