package javaSuperKeyword;

class Vehicle{
	int maxSpeed = 140;
	
}

class Bike extends Vehicle{
	Bike(){
//      super(); by default this will be added by compiler
//      here super() will call zero parameterized constructor of Vehicle class 
		System.out.println("Bike class zero parameterized constructor");
	}
	
	//Bike(int a){
    //System.out.println("Bike class int parameterized constructor");
	//}
	
	public void bikeStartStop() {
		System.out.println("Start or Stop the Bike");
	}
}

public class superStatement2 {

	public static void main(String[] args) {
		Bike honda = new Bike();
		System.out.println(honda.maxSpeed);
		honda.bikeStartStop();
	}

}
