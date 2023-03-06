package Inheritance;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {

	public int sideA;
	public int sideB;
	
	public Rectangle(Point p, Color c, int sideA, int sideB) { //constructor
		super(p, c);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	
	public int getArea() {
		System.out.print("The rectangle area is " + this.sideA * this.sideB + "\n");
		return this.sideA * this.sideB;
	}
	
	public int getCircumference() {
		System.out.println("The rectangle perimeter is " + ((this.sideA * 2) + (this.sideB * 2)));
		return ((this.sideA * 2) + (this.sideB * 2));
		
	}
	
	public void getCharacteristics() {
		getArea();
		getCircumference();
	}
	
	
}
