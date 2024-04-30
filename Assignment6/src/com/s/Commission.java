package com.s;

import java.util.Scanner;

public class Commission extends Emp {
Scanner sc = new Scanner(System.in);
	 double grossSales;
	 double CommissionRate;
	 double Commission_amout;
	 


	void accept(Scanner sc)
{
		super.accept(sc);
		System.out.println("Enter the grossSales:");
		grossSales = sc.nextDouble();
		System.out.println("Enter the CommisionRate in percentage");
		CommissionRate =sc.nextDouble();
		
		
		Commission_amout= (grossSales*CommissionRate/100);
		
}
    

	@Override
	public String toString() {
		return "Commission [grossSales=" + grossSales + ", CommisionRate=" + CommissionRate + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	
}
