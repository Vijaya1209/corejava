package com.coreassignments5.com;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ContactExample {
	public static void main(String[] args) {
		Map<Long,Contact> map = new TreeMap<Long, Contact>().descendingMap();
		Contact c1=new Contact("raj","vijji@gmail.com",Contact.gender.female);
		Contact c2=new Contact("kuamr","vijaya@gmail.com",Contact.gender.female);
		Contact c3=new Contact("nani","srinu@gmail.com",Contact.gender.male);
		Long l1=new Long(999999999);
		Long l2=new Long(888888888);
		Long l3=new Long(777777777);
		
		map.put(l1, c1);
		map.put(l2, c2);
		map.put(l3, c3);
		Set<java.util.Map.Entry<Long, Contact>> entrySet=map.entrySet();
		for(java.util.Map.Entry<Long, Contact> entry:entrySet) { System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println(entry.getKey() +" --> " +entry.getValue());//
		}
		}
	}
		class Contact {
		String name;
		String email;
		private gender eGender;
		public enum gender{
		male,female
		}
		public Contact( String name, String email, gender eGender){
		this.name=name;
		this.email=email;
		this.eGender=eGender;
		}
		public String getName() {
		return this.name;
		}
		public String getEmail()
		{
		return this.email;
		}
		public Enum<gender> geteGender() {
		return this.eGender;
		}public String toString() {
		return "name:"+name+" email:"+email+" Gender: "+eGender;
		}
}
