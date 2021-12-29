package com.coreassignments1.examples;

class Employee {
	public static int base = 18000;

	int salary() {
		return base;
	}
	

	static void printSalary(Employee e) {
		System.out.println(e.salary());
	}
	
	public static void main(String[] args) {

		Employee obj1 = new Manager();
		System.out.print("Manager's salary : ");
		printSalary(obj1);

		Employee obj2 = new Labour();
		System.out.print("Labour's salary : ");
		printSalary(obj2);
	}
}

class Manager extends Employee {
	int inTime = 20000;

	int salary() {
		int i = base + inTime;
		return i;
	}
}

class Labour extends Employee {

	int salary() {
		int overTime = 5000;
		int j = base + overTime;
		return j;
	}
}
