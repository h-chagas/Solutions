package Inheritance;

import java.awt.Color;
import java.awt.Point;


public class Program {

	public static void main(String[] args) {
		Shape s = new Shape(new Point(20,30), Color.ORANGE);
		s.getColour();
		s.getPosition();
		
		System.out.println("\n");
		Rectangle r = new Rectangle(new Point(0,0), Color.GREEN, 10, 10);
		r.getColour();
		r.getPosition();
//		r.getArea();
//		r.getCircumference();
		r.getCharacteristics();
		
		System.out.println("\n");
		Circle c = new Circle(new Point(4,5), Color.BLUE, 14);
		c.getColour();
		c.getPosition();
		c.setRadius(10);
//		c.getRadius();
//		c.getArea();
//		c.getCircumference();
//		c.getDiameter();
		c.printCharacteristics();
		
		System.out.println("\n");
		Sphere sph = new Sphere(new Point(0,0), Color.PINK, 15);
		sph.setRadius(10);
		sph.getColour();
//		sph.getPosition();
//		sph.getVolume();
		sph.printCharacteristics();

	}

}
