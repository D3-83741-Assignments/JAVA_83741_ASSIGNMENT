import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		int option= 0 , total_Bill= 0;
		
		while (true)
		{
			 Scanner sc = new Scanner (System.in);
			 System.out.println("Choose the items from the following menu");
			 System.out.println("1.Samosa-10RS  2.Vadapao-10RS  3.Idli-20RS  4.Generate Bill 5.Exit");
			 
			 option = sc.nextInt();
			 
			 if (option !=5)
			 {
				 System.out.println("Select the food item from menu::");
			 }
			 switch(option)
			 {
			 case 1:
				 System.out.println("Total bill::"+ (total_Bill+10));
				 total_Bill = total_Bill+10;
			break;
			 case 2:
				 System.out.println("Total bill::"+ (total_Bill+10));
				 total_Bill = total_Bill+10;
			break;
			 case 3 :
				 System.out.println("Total bill::"+ (total_Bill+20));
				 total_Bill = total_Bill+20;
				 break;
			 case 4:
				 System.out.println("Total bill::"+ total_Bill);
				 
			break;
			 case 5 :
				 System.out.println("Thank You");
				
			 }
			 
		}
		
	}

}
