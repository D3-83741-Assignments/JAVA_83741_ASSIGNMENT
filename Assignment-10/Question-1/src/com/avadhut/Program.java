package com.pranav;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Student[] s= {
				new Student(1,"Pranav",85),
				new Student(2,"Aditya",75),
				new Student(3,"Avadhut",95),
				new Student(4,"Prashant",80),
				new Student(5,"Aryan",55),
				
		};
		System.out.println("Before sorting");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("After sorting");

		Arrays.sort(s);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		}
	}


