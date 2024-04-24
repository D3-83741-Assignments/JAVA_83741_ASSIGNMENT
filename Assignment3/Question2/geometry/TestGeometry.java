package com.geometry;

public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D point1 = new Point2D(2,3);
		Point2D point2 = new Point2D(2,5);
		
		System.out.println("IS equal: "+point1.IsEqaul(point2.getX(),point2.getY()));
		System.out.println("Distance: "+point1.getDistance(point2));

	}

}
