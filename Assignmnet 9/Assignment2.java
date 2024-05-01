package com.s;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str =sc.next();
		
		System.out.println();
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.reverse());
		 String st= sb.reverse().toString();
		 
		System.out.println("palindrome"+str.equals(st));
sc.close();
	}

}

