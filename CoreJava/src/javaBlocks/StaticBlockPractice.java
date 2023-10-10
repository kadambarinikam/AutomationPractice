package javaBlocks;

public class StaticBlockPractice {

	static {//static block is executed before main()
		System.out.println("This is Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts here");

	}

}
