package Inheritance_Polymorphism;

public class Car {
	public String model;
	public int speed;
	
	//constructor
	public Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	
	public void accelerate(int seconds) {
		speed += 5 * seconds;
		System.out.println("I am accelerating and now I am " + speed + " m/h");
	}
	
	public void getModel() {
		System.out.println("The model of this car is " + this.model);
	}
	
	public void getSpeed() {
		System.out.println("The speed is " + this.speed);
	}
	
	public void getToSixty(int speed) {
		this.speed = speed;
		System.out.println("I am speeding to 60");
	}
	
	public void setModel(String model) {
		if (model.length() > 2)
			this.model = model;
	}
	
	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}
	
}
