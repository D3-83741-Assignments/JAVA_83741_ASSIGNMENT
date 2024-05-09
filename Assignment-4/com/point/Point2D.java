package com.point;
import java.util.*;
public class Point2D {
	Scanner sc=new Scanner(System.in);
	int x;
	int y;
	int currentX;
	int currentY;
	
	public Point2D()
	{
		this(0,0);
	}
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void accept()
	{
	
		System.out.println("Enter two points X and Y : ");
		 x=sc.nextInt();
		 y=sc.nextInt();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String getDetails()
	{
		String s1=Integer.toString(x);
		String s2=Integer.toString(y);
		return ("("+s1+","+s2+")");
	}
	
	
	public boolean isEqual()
	{
		return (getX()==getY());
	}
	
	public static double calculateDistance(Point2D p1,Point2D p2)
	{
		
		
		
		double newX=Math.pow((p2.getX()-p1.getX()), 2);
		double newY=Math.pow((p2.getY()-p1.getY()), 2);
		
		double add=newX+newY;
		double distance=Math.sqrt(add);
		return distance;
	}

	public boolean isEqualPoints(Point2D p1,Point2D p2)
	{
		if(p1.getX()==p2.getX() && p1.getY()==p2.getY())
		{
			return true;
		}
		return false;
	}
	
	
}

