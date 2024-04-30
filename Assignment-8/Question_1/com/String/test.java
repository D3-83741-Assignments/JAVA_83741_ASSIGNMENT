package com.pranav;
import com.exceptions.*;
public class test {

	public static void main(String[] args) {
		
		
		CheckforString s=new CheckforString();
		
		try {
		s.accept();
	}catch(ExceptionLineTooLong e)
		{
		e.printStackTrace();
		}
		}

}
