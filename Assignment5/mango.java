package com.app.fruits;

//import java.util.Scanner;

public class mango extends  fruit {
	
	public mango() {
		this("narangi", 100, "mango");
	}	

	public mango( String color, double weight, String name) {
		super(color, weight, name);
	}	
	
	public String taste()
	{
		return "Sweet";
	}
	
	
	
	
}
