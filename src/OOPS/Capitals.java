package OOPS;

public class Capitals {
	
	
	public static String Capitals1(String State) {
		String City = "";
		switch(State.toLowerCase()) {
		case  "maharashtra" : {
			City = "Mumbai";
			break;
		}
		case  "goa" : {
			City = "Punjim";
			break;
		}
	}return City;
	}
	
	public static void population(String State) {
		String Capiltas2 = Capitals1(State);
		switch(Capiltas2.toLowerCase()) {
		case  "mumbai" : {
			System.out.println("Population is 100000");
			break;
		}
		case  "punjim" : {
			System.out.println("Population is 1000");
			break;
		
		}
		}
		}
		
		public static void zipcode(String State) {
			String Capiltas3 = Capitals1(State);
			switch(Capiltas3.toLowerCase()) {
			case  "mumbai" : {
				System.out.println("Zipcode is 400001");
				break;
			}
			case  "punjim" : {
				System.out.println("Zipcode is 403001");
				break;
			}
	}
	}
	}
