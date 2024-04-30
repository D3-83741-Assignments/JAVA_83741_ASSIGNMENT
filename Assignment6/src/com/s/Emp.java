package com.s;

import java.util.Scanner;

public class Emp {

	Scanner sc = new Scanner(System.in);
	
	String firstName ;
	String lastName;
	Double SSN;
	void accept(Scanner sc) {
		System.out.println("Enter the firstName");
		 firstName = sc.next();
		System.out.println("Enter the lastName");
		lastName = sc.next();
		System.out.println("Enter SSN :");
		SSN = sc.nextDouble();
		
		
	
	
	}
	@Override
	public String toString() {
		return "Emp [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}

	
	
}
