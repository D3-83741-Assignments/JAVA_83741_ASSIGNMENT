package Demo3;

import java.util.Scanner;

public class Hardwarestore {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter part number:");
	String partNum= sc.nextLine();
	System.out.println("Enter the part description");
	String partdesc = sc.nextLine();
	System.out.println("Items purchased count");
	int items =sc.nextInt();
	if(items<0) {
		
	}
	
	System.out.println("price per item");
	double price = sc.nextDouble();
	
	
	Invoice invoice = new Invoice(
			partNum,
			partdesc, 
			items, price
			
			);
	
	System.out.println("Total bill ::"+invoice.getbill());
	
	
}
}
