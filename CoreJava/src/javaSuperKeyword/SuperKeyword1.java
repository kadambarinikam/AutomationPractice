package javaSuperKeyword;

class Father{
	int age = 51;
	
	public void home() {
		System.out.println("This is father's home");
	}
}

class Son extends Father{
     int age = 21;
    		 
	public void displayParentDetails() {
		System.out.println("Parent age: " + super.age);
		System.out.println("Child age: " + this.age);
		super.home();
	}
}



public class SuperKeyword1 {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.displayParentDetails();
		
	}

}
// we cannot use super keyword inside the static method, static block
// we can use super keyword inside the non-static method, non-static block as well as inside the constructor