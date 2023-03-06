package Inheritance;

import java.awt.Color;
import java.awt.Point;


public class Sphere extends Circle {
	
	public Sphere(Point p, Color c, int radius) {
		super(p, c, radius);
		
	}

	public float getVolume() {
		float sphereVolume = (float) ((Math.PI * 4 / 3) * (this.radius * this.radius * this.radius));
		System.out.println("The volume of the sphere is " + sphereVolume + " m3");
		return sphereVolume;
	}
	
	public void printCharacteristics() {
		getVolume();
	}
}
