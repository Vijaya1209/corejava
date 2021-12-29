package com.coreassignments6.com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Execute {
	int sequence();
}

public class Program3 {
	@Execute(sequence = 3)
	public void method1(String name) {
		System.out.println("name" + name);
	}

	@Execute(sequence = 1)
	public void method2(String department) {
		System.out.println("department" + department);
	}

	@Execute(sequence = 2)
	public void method3(int id) {
		System.out.println("id " + id);
	}

	public static void main(String[] args) {
		Program3 c = new Program3();
		c.method2(" HR");
		c.method3(319);
		c.method1(" vijaya");
	}
}
