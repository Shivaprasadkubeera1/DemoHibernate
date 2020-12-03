package com.sp.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Student {
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	@Id
	@Column(name="roll")
	private int roll;
	@Column(name="name")
	private String name;
	@Column(name="marks")
	private int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		
	}

}
