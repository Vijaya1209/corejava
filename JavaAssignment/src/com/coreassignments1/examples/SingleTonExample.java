package com.coreassignments1.examples;

public class SingleTonExample {
	

	    private static SingleTonExample single_instance = null;

	    public String s;

	    private SingleTonExample()
	    {
	        s = "Hello I am a string part of Singleton class";
	    }

	    public static SingleTonExample getInstance()
	    {
	        if (single_instance == null)
	            single_instance = new SingleTonExample();

	        return single_instance;
	    }
	
	    public static void main(String args[]) {

	    	SingleTonExample x = SingleTonExample.getInstance();

	    	SingleTonExample y = SingleTonExample.getInstance();

	    	SingleTonExample z = SingleTonExample.getInstance();
	        System.out.println("Hashcode of x is " 
	                + x.hashCode());
	        System.out.println("Hashcode of y is "
	                + y.hashCode());
	        System.out.println("Hashcode of z is "
	                + z.hashCode());

	        if (x == y && y == z) {

	            System.out.println(
	                    "Three objects point to the same memory location on the heap i.e, to the same object");
	        } else {
	            System.out.println(
	                    "Three objects DO NOT point to the same memory location on the heap");
	        }
	    }
	}


