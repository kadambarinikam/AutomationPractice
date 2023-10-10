package oopsInheritance;

class ParentClass{
	String familyName = "Verma";// non-static
	static double bankBalance = 1500.00;
	
	public void car() {
		System.out.println("Parent's Car");//non-static method
	}
	
	public static void home() {
		System.out.println("Parent's Home");//static method
	}
}
 class ChildClass extends ParentClass{
//Child class extends ParentClass ==> cxhildClass will inherit the properties of ParentClass
//extends keyword is used in java to achieve inheritance
	
	public static void main (String[] args){
		ChildClass obj = new ChildClass();
		System.out.println("Family Nmae : " + obj.familyName );
		System.out.println("Bank Balance : " + ChildClass.bankBalance);
		
		obj.car();
		ChildClass.home();
	}

}
