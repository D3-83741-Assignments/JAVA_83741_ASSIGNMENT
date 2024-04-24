package com.geometry;

public class Point2D {
	int x;
	int y;
	
	public Point2D(int X, int Y)
	{
		this.x = X;
		this.y =Y;
		
		
	}
	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
	public void getdetail() {
		System.out.println("x"+x+"y"+y);
	}
//	public boolean IsEqaul(Point2D point)
//	{
//		if(this.x==point.getX() && this.y == point.getY()) {
//			return true;
//		}else return false;
//		
//	}
	public boolean IsEqaul(int x, int y)
	{
		if(this.x==x && this.y == y) {
			return true;
		}else return false;
		
	}
	
			 
			 public double getDistance(Point2D p){
		double distance = Math.sqrt(Math.pow(( p.getX()-this.x),2)+ Math.pow(( p.getY()-this.y),2));
		return distance;
	 }
			 
	
}
