package Inheritance_Polymorphism;

public class Program {

	public static void main(String[] args) {
		
		Car h = new Car("Acoord", 50);
		Car v = new Car("Zafira", 50);
		Car p = new Car("5008", 50);

		System.out.println("");
		
		Car ml = new RacingCar("MacLaren", 75, "Jamie", 2);
		Car f = new RacingCar("Ferrari", 100, "Hugo", 3);
		Car l = new RacingCar("Emira", 65, "Benjamin", 3);
				
		Car[] myCars = {h, v, p, ml, f, l};
		
		processCars(myCars);
		
	}
	
	
	public static void processCars(Car[] myCars) {
		for (int i = 1; i < myCars.length; i++)
			 myCars[i].getToSixty();
		
		
		for (Car car : myCars)
			car.accelerate(2);
		
		for (Car car : myCars)
			car.getModel();
		
					
		for (Car car : myCars)
			//need find a way to setDriver before to getDriver
			if (car instanceof RacingCar) {
				((RacingCar)car).setDriver(((RacingCar)car).driver);
				if (((RacingCar)car).driver != null)
					((RacingCar)car).getDriver();
			}

			
				
				

			
	}
		
}
