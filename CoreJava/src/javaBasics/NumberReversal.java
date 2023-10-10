package javaBasics;

public class NumberReversal {

	public static int numReversal(int i) {
		int rem = 0, revNum = 0;
		while (i != 0) {
			rem = i % 10;
			revNum = revNum * 10 + rem;
			i = i / 10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		int revNum = NumberReversal.numReversal(15735);
		System.out.println(revNum);

	}

}
