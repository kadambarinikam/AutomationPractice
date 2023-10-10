package oopsInheritance;

class GrandParent{
	int grandParentAge = 75;
	
	public void home() {
		System.out.println("Grand Parent Home");
	}
	
}

class Parent extends GrandParent{
//int grandParentAge = 75;
//public void home()

int carMaxSpeed = 140;

public void car() {
	System.out.println("Parent car");
}
	 
 }
 
class Child extends Parent{
//int grandParentAge = 75;
//public void home()
//int carMaxSpeed = 140;
//public void car()

public void bike() {
	System.out.println("Child bike");
}
	 
 }
public class Inheritance1 {
	
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println("Grand Parent Age: " + obj.grandParentAge); 
		System.out.println("Car maximum speed: " + obj.carMaxSpeed);
		
		obj.home();
		obj.car();
		obj.bike();		
	}

}

// Parent class cannot inherit the properties of child class
// only child class will inherit parent class properties