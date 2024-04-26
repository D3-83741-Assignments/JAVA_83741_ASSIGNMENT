package com.app.fruits;
import java.util.Scanner;
public class Program1

{

	
		static int menu() {
			
		    Scanner sc= new Scanner(System.in);
			int choice;
			System.out.println("1.Add Mango");
			System.out.println("2.Add Orange");
			System.out.println("3.Add Apple");
			System.out.println("4.Display names of all fruits in the basket");
			System.out.println("5.Display Details about all fresh fruits in basket");
			System.out.println("6. Mark a fruit as stale");
			System.out.println("7.Display tastes of all stale fruits in the basket");
			System.out.println("8. Mark all sour fruits stale");	
			choice =sc.nextInt();
			return choice;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("enter the basket size ");
			int size = sc.nextInt();
			fruit[] fruitcart = new fruit[size];
			System.out.println("Size"+fruitcart.length);
			int choice;
			int counter=0;
			
			while((choice=menu())!=0)
			{
				switch(choice)
				{
				case 0:
					System.out.println("Thank you be healthy");
					break;
				case 1:
				{
					
					if(counter<size) {
					fruitcart[counter]= new mango();
					counter++;
					
					}else 
					{
						System.out.println("Cart is full");
					}
					break;
				}
				case 2:
				{

					if(counter<size) {
					fruitcart[counter]= new Orange();
					counter++;
					
					}else 
					{
						System.out.println("Cart is full");
					}
					break;
				}
				case 3:
				{

					if(counter<size) {
					fruitcart[counter]= new Apple();
					counter++;
					
					}else 
					{
						System.out.println("Cart is full");
					}
					break;
				}
				case 4:
				{
					for (int i=0; i<counter;i++)
					
						System.out.println( fruitcart[i].getName());
					break;		
				}
				case 5:
				{
					for (int i=0; i<counter;i++)
					{
						if(fruitcart[i].isFresh()==true)
						{
							System.out.println(fruitcart[i]);
						}
					}
					break;	
				}
				case 6:
					int index;
					System.out.println("Enter the index to change that fruit from fresh to stale");
					index=sc.nextInt();
					if(index<counter) {
						fruitcart[index].setFresh(false);
						
					}else
					{
						System.out.println("Enter the correct index");
					}	
					break;
		
				case 7:
					for (int i=0;i<counter;i++)
					{
						if (fruitcart[i].isFresh()==false)
						{
							System.out.println(fruitcart[i].getTaste());
						}
					}break;
				case 8:
					for(int i=0;i<counter;i++)

					{
						if (fruitcart[i].getTaste()=="sour")
						{
							fruitcart[i].setFresh(false);
						}
					}
					break;
				
			}
			
			
			
			}
		}}
			
			
			
			
			
			
			

				
		
		

				
		

		



