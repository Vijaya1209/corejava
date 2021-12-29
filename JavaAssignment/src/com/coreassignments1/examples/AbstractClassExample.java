package com.coreassignments1.examples;

	class Honda extends Program4 {

	    @Override
	    void run() {
	        System.out.println(" Cheetah is running ");
	    }
	}

	/*the class is declared as abstract without abstract method*/
	 abstract class Car extends Program4 {

	}
	class Maruti extends Program4 {

	    @Override
	    void run() {
	        System.out.println(" Horse is running ");
	    }
	}


	class AbstractClassExample{

	    public static void main(String[] args) {

	    Program4 cheetah = new Honda();
	    cheetah.run();
	        /*overriding animal class method*/
	    Program4 horse = new Maruti();
	    horse.run();
	    }

	    }