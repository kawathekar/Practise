package OOPS;

public class BaseClass extends Cars {
	
	static ClassofDcodetech obj = new ClassofDcodetech();
	static classofAutomation Obj1 ;

	public static void main(String[] args) {
		//Inheritance
		Cars.CarMfg("bmw");
		Cars.Carmake(1986);
		Cars.Carmodel("BMW XM");
		Cars.CarMfg("BMW", "Germany");
		Cars.Carmake(2000);
		
		//Method Overriding
		TopSpeed(190);
		Cars.TopSpeed(200);
		
		//Method Overloading
		Cars.TopSpeed("250");
		
		//Encapsulation
		obj.Location("Divya");
		obj.Location("Soham");
		
		//Abstraction
		Obj1 = new Java();
		System.out.println("Required version of Java is "+ Obj1.Softwares());
		
		Obj1 = new Maven();
		System.out.println("Required version of Java is "+ Obj1.Softwares());
		
	}
	
	//Method Overriding
		public static void TopSpeed(int Speed) {
			System.out.println("Car's Top speed can be "+Speed);
		}

}
