import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
	   int option= 0;
	   while (true )
	   {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Choose the following option 1.Check for credit allowed or not  2.Exit");
		   option = sc.nextInt()
;
		   if (option!=2)
		   {
			   System.out.println("Check for credit limit");
			   
		   }
		   switch(option)
		   {
		   case 1:{
			   System.out.println("Allowed credit");
			   double allowed =sc.nextDouble();
			   System.out.println("Pending balance at the beginning of this month");
			   double pbal = sc.nextDouble();
			   System.out.println("Total items charged ");
			   double tcharge = sc.nextDouble();
			   System.out.println("Total all credit applied in this month");
			   double monthcharge = sc.nextDouble();
			  
			   double used_limit = (pbal +tcharge -monthcharge);
			    
			   if (used_limit>allowed)
			   {
				   System.out.println("Credit limits exceeds");
			   }
			   else {
				   double remaining_credit = allowed - used_limit ;
				   System.out.println("credit limit remaining "+remaining_credit);
			   }
			   
			break;   
		   }
		   case 2 :
			   System.out.println("thank you  ");
			   
		   }
		   
		 
		   
		   }
	}

}
