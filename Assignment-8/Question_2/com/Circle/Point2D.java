package com.pranav;

import java.util.Scanner;

import com.exceptions.ExceptionForDiameter;

public class Point2D {
	
	private int x;
	private int y;
	private double diameter;
	
	Scanner sc=new Scanner(System.in);
	
	public Point2D()
	{
		this.x=0;
		this.y=0;
		this.diameter=100;
	}
	
	public void accept()
	{
		System.out.println("Enter x");
		x=sc.nextInt();
		System.out.println("Enter y");
		y=sc.nextInt();	
	}
	

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) throws ExceptionForDiameter {
		
		
		this.diameter = diameter;
		if(diameter<0)
		{
			throw new ExceptionForDiameter("Diameter should be positive");
		}
	}

	@Override
	public String toString() {
		return "Point (" + x + "," + y + "), diameter=" + diameter ;
	}
	
	
	
}
