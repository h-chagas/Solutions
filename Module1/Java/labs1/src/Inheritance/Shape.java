package Inheritance;

import java.awt.Color;
import java.awt.Point;


public class Shape {
	
	Point position;
	Color colour;
	
	public Shape(Point p, Color c) { //constructor
		this.position = p;
		this.colour = c;
	}
	
	public Color getColour() {
		System.out.println(colour);
		System.out.println("\n");
		return colour;
	}
	
	public Point getPosition() {
		System.out.println(position);
		System.out.println("\n");
		return position;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public void setPosition(Point position) {
		this.position = position;
	}
	

}


class Rectangle extends Shape {

	public int sideA;
	public int sideB;
	
	public Rectangle(Point p, Color c, int sideA, int sideB) { //constructor
		super(p, c);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	
	public int getArea() {
		System.out.print("The rectangle area is " + this.sideA * this.sideB);
		System.out.println("\n");
		return this.sideA * this.sideB;
	}
	
	public int getCircumference() {
		System.out.println("The rectangle perimeter is " + ((this.sideA * 2) + (this.sideB * 2)));
		System.out.println("\n");
		return ((this.sideA * 2) + (this.sideB * 2));
		
	}
	
	public void getCharacteristics() {
		int area = getArea();
		int circumf = getCircumference();
		System.out.println("The rectangle is located at these points" + Point p + );
	}
	
	
}

class Circle extends Shape {
	public Circle(Point p, Color c) {
		super(p, c);
		// TODO Auto-generated constructor stub
	}

	public int radius;
	
	public void getArea() {
		
	}
	
	public void getCircumference() {
		
	}
	
	public void getDiameter() {
		
	}
	
	public void getRadius() {
		
	}
	
	public void printCharacteristics() {
		
	}
	
	public void setRadius() {
		
	}
	
}

class Sphere extends Circle {
	
	public Sphere(Point p, Color c) {
		super(p, c);
		// TODO Auto-generated constructor stub
	}

	public void getVolume() {
		
	}
	
	public void printCharacteristics() {
		
	}
}
