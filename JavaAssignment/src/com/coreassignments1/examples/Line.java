package com.coreassignments1.examples;

public class Line extends Draw {

	private int x;
	private int y;

	public Line(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	void draw() {
		System.out.println(" Drawing a line with coordinates " + x + " and " + y);
	}
}
