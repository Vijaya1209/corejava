package com.coreassignments8.com;

public class Transaction {
	
	private String name;
	private int year;
	private int value;
	
	public Transaction(String name, int year, int value) {
		super();
		this.name = name;
		this.year = year;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	


}
