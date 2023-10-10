package javaOperators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a = 15, b = 20, c = 20;
		boolean flag;
		
		flag = b == c;
		System.out.println("b == c : " + flag);
		
		System.out.println("a != c : " + (a != c));
		
		System.out.println("a < b : " + (a < b));
		
		System.out.println("a > b : " + (a > b));
		
		System.out.println("b <= c : " + (b <= c));
		
		System.out.println("a >= b : " + (a >= b));
		
		char ch1 = 'a', ch2 = 'b', ch3 = 'c';
		System.out.println("ch1 == ch2 : " + (ch1 == ch2));
		System.out.println("ch1 != ch2 : " + (ch1 != ch2));
		
		System.out.println("ch1 > ch2 : " + (ch1 > ch2));
		System.out.println("ch1 >= ch2 : " + (ch1 >= ch2));
		
		System.out.println("ch1 < ch2 : " + (ch1 < ch2));
		System.out.println("ch1 <= ch2 : " + (ch1 <= ch2));
		
        boolean b1 = false, b2 = true, b3 = true;
        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("b1 != b2 : " + (b1 != b2));
        
//      System.out.println("b1 > b2 : " + (b1 > b2));
//      we cannot compare boolean values for less than or greater than relations
        
        String s1 = "Java", s2 = "Python", s3 = "Java";
        
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 != s2 : " + (s1 != s2));
   //   System.out.println("s1 > s2 : " + (s1 > s2));
   //   we cannot compare String values for less than or greater than relations
	}

}
