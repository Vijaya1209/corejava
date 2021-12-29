package com.coreassignments1.examples;

public class Rectangle extends Draw {

	private double l;
	private double b;

	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	@Override
	void draw() {

		System.out.println(" Drawing a rectangle with length " + l + " and breadth " + b);
	}
}
