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
		return colour;
	}
	
	public Point getPosition() {
		System.out.println(position);
		return position;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public void setPosition(Point position) {
		this.position = position;
	}
	

}