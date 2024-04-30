package com.pranav;

import java.util.Scanner;

import com.exceptions.ExceptionLineTooLong;

public class CheckforString {
	
	String str;
	Scanner sc=new Scanner(System.in);
	
	public void accept() throws ExceptionLineTooLong
	{
		System.out.println("Enter the string : ");
		str=sc.next();	
		if(str.length()>80)
		{
			throw new ExceptionLineTooLong("String too long");
		}
	}
}
