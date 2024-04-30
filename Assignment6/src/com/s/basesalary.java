package com.s;

import java.util.Scanner;

public class basesalary extends Commission {

	double base_salary;
	double total_salary;
	Scanner sc = new Scanner(System.in);
	void accept(Scanner sc)

	{
		super.accept(sc);
		System.out.println("Enter the base salary");
		base_salary =sc.nextDouble();
		total_salary= base_salary +Commission_amout;
	}
	@Override
	public String toString() {
		return "basesalary [base_salary=" + base_salary + ", total_salary=" + total_salary + ", Commission_amout="
				+ Commission_amout + ", firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	
	
	
}
