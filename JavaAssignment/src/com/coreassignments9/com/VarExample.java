package com.coreassignments9.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class VarExample {
	public static void main(String[] args) throws Exception {
	File file = new File("c:\\Users\\TPOTNURU\\Desktop\\Students data.txt");
	String st;
	
	BufferedReader br = new BufferedReader(new FileReader(file));
	
	
	while((st=br.readLine())!=null) {
		
	System.out.println(st);
	}
	
	}
}
