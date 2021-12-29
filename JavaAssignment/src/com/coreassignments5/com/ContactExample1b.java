package com.coreassignments5.com;

import java.util.HashSet;
import java.util.Iterator;

public class ContactExample1b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashSet<String> set=new HashSet<String>();  
		  set.add("vijji");
		  set.add("vijaya");  
		  set.add("srinu");  
		  set.add("sreenu");
		  set.add("vij");
		  set.add("viji");
		  set.add("sri");
		  set.add("srii");
		  set.add("vijjii");
		  set.add("vijayaa");
		  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
		 
}
