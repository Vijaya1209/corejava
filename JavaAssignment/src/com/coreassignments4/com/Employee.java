package com.coreassignments4.com;

import java.util.HashSet;

public class Employee {
	 int id;
	    String name;
	    int salary;
	    String dept;

	    public Employee(int id, String name, int salary, String dept) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.dept = dept;
	    }

	    public void displayDetails()
	    {

	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", salary=" + salary +
	                ", dept='" + dept + '\'' +
	                '}';
	    }
	}

