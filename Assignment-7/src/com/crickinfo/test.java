package com.crickinfo;
import java.util.*;
public class test {

	static Scanner sc =new Scanner(System.in);

	static int menu()
	{
		System.out.println("1.Add 11 players to the list: ");
		System.out.println("2.Total number of runs by all players: ");
		System.out.println("3.Total number of wickets by all players: ");
		System.out.println("4.Total matches played by all players");
		System.out.println("5. all the cricketers with their name and no of matches played individually");
		System.out.println("Enter the choice: ");
		return sc.nextInt();
	}
	static int wickets=0;
	static int runs=0;
	static int noOfMatchesPlayed=0;
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		Player players[]=new Player[11];
		int ch;
		while((ch=menu())!=0)
		{
		switch(ch)
		{
		case 1:for(int i=0;i<11;i++) {
		players[i]=new Cricketer();
		players[i].accept(sc);
				
		if(players[i] instanceof Cricketer)
		{
			Cricketer c=(Cricketer)players[0];
			System.out.println("Enter number of wickets taken");

			wickets=wickets+c.getWickets(sc);
			System.out.println("Enter runs scored");

			runs=runs+c.getRuns(sc);
			
			noOfMatchesPlayed= noOfMatchesPlayed+ players[i].getMatchesPlayed();
		}
		}
		break;
		
		case 2:System.out.println("Total runs are : "+runs);
		
			break;
		
			
		case 3:System.out.println("Total wickets are : "+wickets);
			break;
			
		case 4:System.out.println("number of matches played by all players: "+noOfMatchesPlayed);
		break;
		
		case 5:
			for(int i=0;i<11;i++)
			{
			System.out.println("Name the cricketer : "+players[i].getName());
			System.out.println("number of matches played by cricketer : "+players[i].getMatchesPlayed());

			}
			break;
		default:
			System.out.println("Enter correct choice ");
			break;
		}
		}
	}

}
