package javaTypeCasting;

public class UpCastingPractice {

	class car{
		int maxSpeed = 140;
		void buttonStart() {
			System.out.println("Press the button to start the car");
		}
	}
	
	class BMW extends car{
	// int maxSpeed = 140; -- inherited variable
	// void buttonStart() --  inherited method
		int seatingCapacity = 4;
		void autoDoorOpeningClosing() {
			System.out.println("Doors will open & close automatically");
		}
	}
	public static void main(String[] args) {
		
	
	}

}
