import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total miles driven per day");
		double miles =sc.nextDouble();
		System.out.println("Average miles per gallon");
		double avg_MPG =sc.nextDouble();
		System.out.println("Cost per gallon of gasoline");
		double costpg =sc.nextDouble();
		System.out.println("Parking fess per day");
		double parking_Fees =sc.nextDouble();
		System.out.println("Tolls per day");
		double toll_Cost =sc.nextDouble();
		
		
		
		double total_gasPD = miles/avg_MPG ;
		double cost_perDFG = total_gasPD*costpg;
		
		double total_Cost_Per_Day = cost_perDFG + toll_Cost+ parking_Fees;
		
		System.out.println("Users cost per day ::"+total_Cost_Per_Day);
		
		
		

	
	
	}

}
