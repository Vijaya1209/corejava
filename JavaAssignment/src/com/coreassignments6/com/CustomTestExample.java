package com.coreassignments6.com;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)

@Target(METHOD)

@interface Test {
}

public class CustomTestExample {
	public void display() {
		System.out.println("Tes display( )");
	}

	public static void main(String[] args) {
		CustomTestExample obj = new CustomTestExample();
		obj.display();
	}

}
