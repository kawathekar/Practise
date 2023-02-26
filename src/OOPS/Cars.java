package OOPS;

public class Cars {
	
	//Inheritance
	public static void CarMfg(String mfg) {
		if (mfg.equalsIgnoreCase("BMW")) {
			System.out.println("Car is German");
		}
		if (mfg.equalsIgnoreCase("TOYOTA")) {
			System.out.println("Car is Japnese");
		}
		if (mfg.equalsIgnoreCase("Ford")) {
			
			
			System.out.println("Car is American");
		}
		if (mfg.equalsIgnoreCase("Maruti")) {
			System.out.println("Car is Indian");
		}
	}
	//Inheritance
	public static void Carmake(int year) {
		System.out.println("Car is manufactured in "+year);
	}
	//Inheritance
	public static void Carmodel(String Model) {
		System.out.println("Model of Car is "+Model);
	}
	
	//Method Overloading
	public static void CarMfg(String mfg, String Country) {
		System.out.println("Manufacturer of Car is "+mfg+" From "+Country);
	}
	//Method Overloading TypePromotion
	public static void Carmake(float year) {
		System.out.println("Car is manufactured in "+year);
	}
	
	//Method Overriding
	public static void TopSpeed(int Speed) {
		System.out.println("Car's Top speed is "+Speed);
	}
	
	//Method Overloading
	public static void TopSpeed(String Speed) {
		System.out.println("Car's Top speed is "+Speed);
	}
	
	
	
}
