package javaBasics;

public class NumberReversalPractice {
	
	public static int reversalPractice(int a) {
		int rem = 0, revNum=0;
		while(a != 0) {
			rem = a % 10;
			revNum = (revNum * 10 )+ rem;
			a = a/10;
		
	}
		return revNum;
	}

	public static void main(String[] args) {
		int revNum= NumberReversalPractice.reversalPractice(8537);
		System.out.println(revNum);
				
	}

}
