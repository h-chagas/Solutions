package Inheritance;

import java.awt.Color;
import java.awt.Point;


public class Program {

	public static void main(String[] args) {
		Shape s = new Shape(new Point(20,30), Color.ORANGE);
		s.getColour();
		s.getPosition();
		
		Rectangle r = new Rectangle(new Point(0,0), Color.GREEN, 10, 10);
		r.getArea();
		r.getCircumference();

	}

}
