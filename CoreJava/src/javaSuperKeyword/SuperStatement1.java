package javaSuperKeyword;

class Fruit{ // inherits Object class
	double weight;
	
	
}

class Apple extends Fruit{
// Fruit class direct parent class
// object class indirect parent class
	
	public void appleTaster() {
		
	}
}

public class SuperStatement1 {

	public static void main(String[] args) {
		Fruit obj = new Fruit();
		obj.toString();
		
		Apple obj1 = new Apple();
		obj1.weight = 4.5;
		obj1.appleTaster();
		obj1.hashCode();
		
	}

}
