package com.app.fruits;



public class Orange extends fruit {

	
	
	
	
	public Orange() {
		this("orange", 100, "orange");
	}	

	public Orange( String color, double weight, String name) {
		super(color, weight, name);
	}	


	public String gettaste()
	{
		return "sour";
	}
	
	
}
