package OOPS;

public class BaseClass extends Cars {

	public static void main(String[] args) {
		Cars.CarMfg("bmw");
		Cars.Carmake(1986);
		Cars.Carmodel("BMW XM");
		Cars.CarMfg("BMW", "Germany");
		Cars.Carmake(2000);
		TopSpeed(190);
		Cars.TopSpeed(200);
	}
	
	//Method Overriding
		public static void TopSpeed(int Speed) {
			System.out.println("Car's Top speed can be "+Speed);
		}

}
