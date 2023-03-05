package Inheritance_Polymorphism;

public class Program {

	public static void main(String[] args) {
		Car c = new Car("BWM", 60);
		//c.getModel();
		c.accelerate(6);
		
		System.out.println("==============");
		
		RacingCar rc = new RacingCar("MacLaren", 75, "Hugo", "2");
		rc.setTurboFactor(2);
		rc.setDriver("Hugo");
		rc.getDriver();
		rc.accelerate();

	}

}
