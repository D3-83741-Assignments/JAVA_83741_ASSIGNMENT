package com.s;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str =sc.next();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		sc.close();

	}

}
