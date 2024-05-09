package com.pranav;

public class Student implements Comparable<Student> {
	
	private int rollno;
	private String name;
	private int marks;
	
	public Student() {
		
	}
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return o.marks-this.marks;
	}


	
	
	
}
