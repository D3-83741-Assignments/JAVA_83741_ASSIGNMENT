package com.app.fruits;


public class Apple extends fruit {
	
	
	public Apple() {
		this("red", 100, "apple");
	}	

	public Apple( String color, double weight, String name) {
		super(color, weight, name);
	}	
	
	
	
	public String taste()
	{
		return "Sweet n sour";
	}
	
	
}
