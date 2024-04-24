package Maths;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
//		double average_Of_Two_Numbers = ((num1+num2)/2);
//		System.out.println("the average of two numbers is ::"+average_Of_Two_Numbers);
		
		int option =0;
		
//		double num1;
//		
//		double num2;
		while (true)
		{
//			System.out.println("Enter the two numbers:");
			
//			System.out.println("enter the choice");
			System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division 5.Exit");
//			option =sc.nextInt();
			System.out.println("Enter the two numbers:");

			 if(option !=5)
				{
					System.out.println("Enter the choice");
				}else {
					double	 num1 = sc.nextDouble();
					double num2 = sc.nextDouble();
				
				switch (option)
				{
					case 1 :
						System.out.println("Addition of two numbers is "+(num1+num2));
						break;
						
					case 2 :
						System.out.println("Substraction of two numbers is "+(num1-num2));
						break;
						
					case 3 :
						System.out.println("Multiplication of two numbers is "+(num1*num2));
						break;
						
					case 4 :
						System.out.println("Division of two numbers is "+(num1/num2));
						break;
						
					case 5:
						System.out.println("Thank you");
						
				}
				}
		}
	
		

	}

}
