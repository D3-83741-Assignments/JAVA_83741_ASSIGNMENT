package com.app.fruits;

import java.util.*;

public class fruit {
	
	private String color;
	private double weight;
	private String name;
	private boolean isFresh=true;
	
	
	public fruit() {}
	
	

	public fruit(String color, double weight, String name) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		
	}

	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter color");
		color= sc.next();
		System.out.println("Enter weight");
		weight= sc.nextDouble();
		System.out.println("Enter name");
		name= sc.next();
	}

	 public String toString()
	 {
		 return  "color"+color+"  ,weight"+ weight+",   name"+name+",   isFresh"+isFresh;
	}
	 
	 public String taste()
	 {
		 return "no specific taste";
	 }
	
	public boolean isFresh()
	{
		return isFresh;
	}
	
	public void setFresh (boolean isFresh)
	{
		this.isFresh = isFresh;
	}
	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
  
	
	public void setStale()
	{
	    this.isFresh= false;
	}
	public String getTaste()
	{
		return "sweet";
	}
	
	
	
	
	
	
	
}

