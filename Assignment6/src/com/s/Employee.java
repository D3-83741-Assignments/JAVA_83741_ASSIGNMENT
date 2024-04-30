package com.s;

import java.util.Scanner;

public class Employee {
	
	public static int menu(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.Weekly Salaried Employee");
		System.out.println("2.Hourly Salaried Employee");
		System.out.println("3.Commison Salaried Employee");
		System.out.println("4.Base Salaried Commision Employee");
		System.out.println("Enter the choice");
		
		return sc.nextInt();
	}
	
		
	
	

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
		System.out.println("Enter the total employee count");
		int n = sc.nextInt();
//		System.out.println("");
		Emp emp []= new Emp[n];
		int counter =0;
		while ((choice=menu(sc))!=0) {
			switch(choice) {
			case 0:
				System.out.println("thank you");
			break;
			
			case 1:
				{
					if(counter<n)
					{
						emp[counter] = new weekly();
						emp[counter].accept(sc);
//						System.out.println(emp[counter]);
						counter++;
						
					}else {
						System.out.println("Employee data is full");
					}
					break;
					
				}
			case 2:
				{
					if(counter<n)
					{
						emp[counter] = new Houremp();
						emp[counter].accept(sc);
						System.out.println(emp[counter]);
						counter++;
						
					}else {
						System.out.println("Employee data is full");
					}
					break;
					
				}
			case 3:
			{
				if(counter<n)
				{
					emp[counter] = new Commission();
					emp[counter].accept(sc);
					System.out.println(emp[counter]);
					counter++;
					
				}else {
					System.out.println("Employee data is full");
				}
				break;
				
			}
			case 4:
			{
				if(counter<n)
				{
					emp[counter] = new basesalary();
					emp[counter].accept(sc);
					System.out.println(emp[counter]);
					counter++;
					
				}else {
					System.out.println("Employee data is full");
				}
				break;
				
			}
		
				
				
			}
			
		}
			
		
		
		
		
	}
}
