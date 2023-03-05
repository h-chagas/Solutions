package Inheritance_Polymorphism;

public class RacingCar extends Car {
	public String driver;
	public int turboFactor;
	
	
	public RacingCar(String model, int speed, String driver, int turboFactor) { //constructor
		super(model, speed);
	}
	
	public void accelerate() {
		super.accelerate(speed);
		this.speed = this.speed * this.turboFactor;
	}
	
	public void getDriver() {
		System.out.println("The driver is " + this.driver);
	}
	
	public void getModel() {
		System.out.println("The model of this car is A RACING " + this.model);
	}
	
	public void getTurboFactor() {
		System.out.println("The turbo factor os this car is " + this.turboFactor);
	}
	
	public void setDriver(String driver) {
//		if (driver.length() > 2)
			this.driver = driver;
//		else System.out.println("The driver name should contain at least 3 letters");
	}
	
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	

}
