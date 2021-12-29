package com.coreassignments6.com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.Time;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface info {
}

public class DevelopeCustomExample {

	@info
	public void authorid(int auth_id) {
		System.out.println("authorid" + auth_id);
	}

	@info
	public void author(String author) {
		System.out.println("author " + author);
	}

	@info
	public void date(java.util.Date date) {
		System.out.println("Date " + date);
	}

	@info
	public void time(Time time) {
		System.out.println("time " + time);
	}

	@info
	public void version(double d) {
		System.out.println("Version " + d);
	}

	public static void main(String[] args) {
		DevelopeCustomExample info = new DevelopeCustomExample();
		info.authorid(1);
		info.author("vijaya");
		info.date(new java.util.Date());
		info.time(new java.sql.Time(0));
		info.version(1.8);
	}

}
