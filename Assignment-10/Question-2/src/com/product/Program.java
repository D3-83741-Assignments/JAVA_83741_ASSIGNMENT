package com.product;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Product[] p= {
				new Product(1, "iPhone", "Mobile", 67000),
				new Product(2, "SonyTV", "TV", 20000),
				new Product(3, "iPad", "Tablet", 50000),
				new Product(4, "HP11", "Laptop", 72000),
				new Product(5, "Dell123", "PC", 82000),
				new Product(6, "Boat Rokerz", "Headphones", 2000),
				new Product(7, "xyz", "mic", 2500),
				new Product(8, "Sony", "Fridge", 2000),
				new Product(9, "samsung", "Washing machine", 2000),
				new Product(10, "HP", "Charger", 2000)
		};
		
		System.out.println("Before sorting");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
		System.out.println("After sorting");

		Arrays.sort(p);
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}

}
