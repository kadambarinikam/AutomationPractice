package javaString;

public class StringPract2 {

	public static void main(String[] args) {
		String s = "Apple";
		String s1 = "Apple";
		String s2 = "Kiwi";
		String s3 = "Orange";
		String s4 = new String("Apple");
		String s5 = new String("Mango");
		String s6 = "Mango";
		String s7 = "Orange";

//      comparing using equals() --> equals() is overriden in string class and it compares based on literal(value)
		System.out.println("s.equals(s4) = " + s.equals(s4));
		System.out.println("s5.equals(s6) = " + s5.equals(s6));
		System.out.println("s2.equals(s3) = " + s2.equals(s3));
		System.out.println("**********");

//   comparing using == --> == will compare based on memory location or address of the object
		System.out.println("s == s1 = " + (s == s1));
		System.out.println("s == s4 = " + (s == s4));
		System.out.println("s == s6 = " + (s == s6));
		System.out.println("s3 == s7 = " + (s3 == s7));
		System.out.println("s6 == s7 = " + (s6 == s7));
		System.out.println("*********");

// to string() will return the String literal of the string object as it is overriden in string class

		System.out.println(s);// after compilation System.out.println(s.toString());
		System.out.println(s4.toString());
		System.out.println(s3.toString());
		System.out.println(s6.toString());

	}

}
