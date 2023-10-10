package oopsInheritance;

class Bike{
	int maxSpeed = 110;
	public void start() {
		System.out.println("Bike start method");
	}
	
}

class HondaUnicorn extends Bike{
//int maxSpeed = 110;
//public void start()
	
	public void monoSuspension() {
		System.out.println("Honda Unicorn has mono suspension");
	}
}

class YamahaFZ extends Bike{
//int maxSpeed = 110;
//public void start()
	
	public void stop() {
		System.out.println("Bike stop method");
	}
}

class RoyalEnfieldGT650 extends Bike{
//int maxSpeed = 110;
//public void start()
	
	public void engine() {
		System.out.println("GT650 has 650cc engine");
	}
	
}


public class Inheritance2 {

	public static void main(String[] args) {
		HondaUnicorn uni = new HondaUnicorn();
		System.out.println("***HondaUnicorn class***");
		System.out.println(uni.maxSpeed);
		uni.start();
		uni.monoSuspension();
		
		YamahaFZ fz = new YamahaFZ();
		System.out.println("***YamahaFz class");
		System.out.println(fz.maxSpeed);
		fz.start();
		fz.stop();
		
		RoyalEnfieldGT650 gt650 = new RoyalEnfieldGT650();
		System.out.println("***RoyalEnfieldGT650 class***");
		System.out.println(gt650.maxSpeed);
		gt650.start();
		gt650.engine();
		
	
	}

}
