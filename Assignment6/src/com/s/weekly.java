package com.s;

import java.util.Scanner;

public class weekly extends Emp{

	Scanner sc = new Scanner (System.in);
	double pay;
	int days;
	double weekPay;
	
	@Override
	void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter the pay for day:");
		pay = sc.nextDouble();
		System.out.println("Enter the days present in week");
		days =sc.nextInt();
		 this.weekPay = (pay*days);
		
	}
//	
//	void weekPayment() {
//		 this.weekPay = (pay*days);
//	}

	@Override
	public String toString() {
		return "weekly [pay=" + pay + ", days=" + days + ", weekPay=" + weekPay + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}

//	@Override
//	public String toString() {
//		return "weekly [pay=" + pay + ", days=" + days + ", weekPay=" + weekPayment() + ", firstName=" + firstName
//				+ ", lastName=" + lastName + ", SSN=" + SSN + "]";
//	}
//	
																		
//	@Override
//	public String toString() {
//		return "weekly [pay=" + pay + ", days=" + days + ", weekPay=" + weekPay + ", firstName=" + firstName
//				+ ", lastName=" + lastName + ", SSN=" + SSN + "]";
//	}
	
	
	
	
	
	
}
