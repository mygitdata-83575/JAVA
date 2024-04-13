package com.sunbeam;

public class Student {
	
	int roll;
	String name;
	String city;
	double marks;
	
	public Student() {
		
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	
	
}
