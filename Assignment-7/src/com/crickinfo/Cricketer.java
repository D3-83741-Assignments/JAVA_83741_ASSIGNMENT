package com.crickinfo;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {

	
	
	
	@Override
	public void accept(Scanner sc) 
		{
			System.out.println("Enter id : ");
			setId(sc.nextInt());
			
			System.out.println("Enter name : ");
			setName(sc.next());
			
			System.out.println("Enter age : ");
			setAge(sc.nextInt());
			
			System.out.println("Enter number of matches played : ");
			setMatchesPlayed(sc.nextInt());
		}
		
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int getWickets(Scanner sc) {
		int wickets=sc.nextInt();
		return wickets;
	}

	@Override
	public int getRuns(Scanner sc) {
		int runs=sc.nextInt();
		return runs;
	}

	
}
