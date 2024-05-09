package com.point;
import java.util.*;
public class Program1 {
	static Scanner sc=new Scanner(System.in);
	
	static 	int menu() {
		int choice;
		System.out.println("1.Display details of a specific point ");
		System.out.println("2.Display x, y co-ordinates of all points ");
		System.out.println("3.Enter the indices to get the distance");
		System.out.println("4.Exit");
		
		System.out.println("Enter the choice");
	
		
		choice=sc.nextInt();
		return choice;
		}
		
	public static void main(String[] args) {
		
	
		int size;
		System.out.println("Enter number of points");
		size=sc.nextInt();
		Point2D[] p=new Point2D[size];
		
		int ch;
		while((ch=menu())!=4)
		{
		switch(ch)
		{
		
		case 1:
		
			for(int i=0;i<size;i++)
		{
			p[i]=new Point2D();
			p[i].accept();
			
		}
		System.out.println("Enter index to find the point");
		int index=sc.nextInt();
		if(index<size) {
		for(int i=0;i<size;i++)
		{
			if(i==index)
			{
				System.out.println(p[i].getDetails());
			}
		}
		}
		else {
			System.out.println("Index not found");
		}
			break;
			
		
		case 2:
			for(int i=0;i<size;i++)
			{
				
			System.out.println(p[i].getDetails());
				
			}
			break;
			
		
		case 3:System.out.println("enter two indices for the distance");
			int i1=sc.nextInt();
			int i2=sc.nextInt();
			if(i1>=0 && i2<=size) {
				if(i1==i2)
				{
					System.out.println("Distance is 0");
				}else {
			System.out.println(Point2D.calculateDistance(p[i1], p[i2]));}
			}
			else
			{
				System.out.println("Enter correct indices");
			}
			break;
		
		
		case 4:
			break;
		}
		
		
		
		}
	
	}
	
	

}
