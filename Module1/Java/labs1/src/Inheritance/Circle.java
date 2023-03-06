package Inheritance;

import java.awt.Color;
import java.awt.Point;


 public class Circle extends Shape {
	public int radius;
	
	public Circle(Point p, Color c, int radius) { //constructor
		super(p, c);
	}
	public float getArea() {
		float circleArea = (float) ((this.radius * this.radius) * Math.PI);
		System.out.println("The area of the circle is " + circleArea + " cm2");
		return circleArea;
	}
	
	public float getCircumference() {
		float circumfArea = (float) (2 * Math.PI * this.radius);
		System.out.println("The circumference of the circle is " + circumfArea + " cm");
		return circumfArea;
	}
	
	public float getDiameter() {
		float diameterArea = (float) (2 * this.radius);
		System.out.println("The diameter of the circle is " + diameterArea + " cm");
		return diameterArea;
	}
	
	public float getRadius() {
		System.out.println("The circle radius is " + (float)this.radius + " cm");
		return (float)this.radius;
		
	}
	
	public void printCharacteristics() {
		getRadius();
		getDiameter();
		getCircumference();
		getArea();
;
	}
	
	public void setRadius(int radius) {
		if (radius > 0)
			this.radius = radius;
		else
			System.out.println("The circle radius must be greater than 0");
	}
	
}
