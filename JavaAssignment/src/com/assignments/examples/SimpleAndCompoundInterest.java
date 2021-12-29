package com.assignments.examples;

public class SimpleAndCompoundInterest {
	
	public static void main (String argu[ ])
	{
	    double pr, rate, t, com, si;
	   //Enter the amount
	    pr=3500;
	   //"Enter the No.of years:");
	    t=5;
	   //"Enter the Rate of  interest");
	    rate=7;
	    si = (pr * t * rate) / 100f;
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    System.out. println("Simple Interest="+si);
	    System.out. println("Compound Interest="+com);
	}

}
