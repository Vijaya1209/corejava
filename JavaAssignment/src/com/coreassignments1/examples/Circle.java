package com.coreassignments1.examples;

public class Circle extends Draw {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	void draw() {

		System.out.println(" Drawing a circle with radius " + r);
	}
}