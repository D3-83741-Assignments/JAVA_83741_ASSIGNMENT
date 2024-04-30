package com.s;

import java.util.Scanner;

public class Houremp extends Emp{

		int hr;
		Double pay;
		Double total_sal;
		Scanner sc = new Scanner(System.in);
		void accept(Scanner sc)
		{
			super.accept(sc);
			System.out.println("Enter the hours work done:");
			hr=sc.nextInt();
			System.out.println("Enter the pay per hr");
			pay =sc.nextDouble();
			
			if (hr<=40)
			{
				total_sal= (hr*pay);
			}
			else
			{
				total_sal=( (hr*pay)+( (hr-40)*1.5*pay));
			}
		}
		
		@Override
		public String toString() {
			return "Houremp [hr=" + hr + ", pay=" + pay + ", total_sal=" + total_sal + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", SSN=" + SSN + "]";
		}
}
