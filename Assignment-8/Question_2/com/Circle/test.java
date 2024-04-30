package com.pranav;
import java.util.*;
import com.exceptions.ExceptionForDiameter;

public abstract class test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Point2D p=new Point2D();
		p.accept();
		try {
			System.out.println("Enter value for diameter");
		p.setDiameter(sc.nextInt());
		}
		catch(ExceptionForDiameter e)
		{
			e.printStackTrace();
		}
		System.out.println(p);
	}

}
