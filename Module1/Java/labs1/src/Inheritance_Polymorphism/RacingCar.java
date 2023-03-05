package Inheritance_Polymorphism;

public class RacingCar extends Car {
	
	public String driver;
	public int turboFactor;
	
	//constructor
	public RacingCar(String model, int speed, String driver, String turboFactor) {
		super(model, speed);
	}
	
	public void accelerate() {
		this.speed = this.speed * this.turboFactor;
		super.accelerate(speed);
	}
	
	public void getDriver() {
		System.out.println("The driver is " + this.driver);
	}
	
	public void getModel() {
		System.out.println("The model of this car is " + this.model);
	}
	
	public void getTurboFactor() {
		System.out.println("The turbo factor os this car is " + this.turboFactor);
	}
	
	public void setDriver(String driver) {
		if (driver.length() > 2)
			this.driver = driver;
		else System.out.println("The driver name should contain at least 3 letters");
	}
	
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	

}
