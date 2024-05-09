import java.util.Scanner;

public class Question1 
{
	public static void main(String[] args) {
		
		try {
		System.out.println("Enter number 1 :");
		Scanner sc =  new Scanner(System.in);   
		double num1 = sc.nextDouble();
		System.out.println("Enter number 2 :");
		double num2 = sc.nextDouble();
		 System.out.println("average is" +((num1+num2)/2));
		} 
		catch (Exception e ){
			System.out.println(" Error Enter the double values");
		}
	}
}




