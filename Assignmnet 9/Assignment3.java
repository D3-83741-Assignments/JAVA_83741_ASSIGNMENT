package com.s;

public class Assignment3 {
public static void main(String[] args) {
	String st ="The class String includes methods for examining individual characters of the sequence, \r\n"
			+ "for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string \r\n"
			+ "with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode \r\n"
			+ "Standard version specified by the Character class.";
//	System.out.println(st.length());
	int count=0;
	for(int i=0;i<st.length();i++)
	{
		count++;
	}
	System.out.println("Count is :"+count);
}
}
