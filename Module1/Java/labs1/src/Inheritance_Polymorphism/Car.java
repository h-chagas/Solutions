package Inheritance_Polymorphism;

public class Car {
	public String model;
	public int speed;
	
	
	public Car(String model, int speed){ //constructor
		this.model = model;
		this.speed = speed;
	}
	
	public void accelerate(int seconds) {
		speed += 5 * seconds;
		System.out.println("I am accelerating and now I am " + speed + " m/h");
	}
	
	public void getModel() {
		System.out.println("The model of this car is a STANDARD " + this.model);
	}
	
	public void getSpeed() {
		System.out.println("The speed is " + this.speed);
	}
	
	public void getToSixty() {
		this.speed = 60;
		System.out.println("I am speeding to 60");
	}
	
	public void setModel(String model) {
		if (model.length() > 2)
			this.model = model;
		else 
			System.out.println("Model name should contain more than 2 characters");
	}
	
	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
		else
			System.out.println("Speed must be more than 0");
	}
	
}
