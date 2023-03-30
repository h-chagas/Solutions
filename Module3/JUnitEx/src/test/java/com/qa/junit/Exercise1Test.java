package com.qa.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Exercise1Test {

	Exercise1 calc = new Exercise1();
	
	@Disabled
	@Test
	public void addTest() {
		assertEquals(20.6, calc.add(5.3, 15.3));
		assertEquals(5000000.2, calc.add(2500000.1, 2500000.1));
		assertEquals(-2.6, calc.add(-1.5, -1.1));
		assertNotEquals(1.6, calc.add(-1, 2.5));
	}
	
	@Disabled
	@Test
	public void subtractTest() {
		assertEquals(15, calc.subtract(20, 5));
		assertEquals(1000, calc.subtract(2000.50, 1000.50));
		assertNotEquals(1000, calc.subtract(1000.50, 2000.50));
	}
	
	@Disabled
	@Test
	public void multiplyTest() {
		assertEquals(20, calc.multiply(10.00, 2.00));
		assertEquals(20.6, calc.multiply(10.30, 2.00));
		assertEquals(100000000.00, calc.multiply(25000000, 4.00));
	}
	
	@Test
	public void divideTest() {
		assertEquals(8.125, calc.divide(32.5, 4.00));
		assertEquals(-30.4, calc.divide(152, -5.00));
		assertNotEquals(-30.4, calc.divide(-5.00, 152));

	}
}
