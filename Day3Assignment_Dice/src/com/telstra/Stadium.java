package com.telstra;

import java.util.Scanner;

public class Stadium {

	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dice Game (2 players) Numbering of dice from 1 to 8");
		System.out.println("Each Player can roll dice twice");
		
		System.out.println("Enter player 1 name:");
		String p1Name = scn.next();
		
		System.out.println("Enter player 2 name:");
		String p2Name = scn.next();
        
		Player p1 = new Player(p1Name);
		Player p2 = new Player(p2Name);
		
		
		int p1TotalScore = p1.getScore();
		System.out.println("Dice Score in First Attempt for " + p1Name +": "  + p1.getScoreD1());
		System.out.println("Dice Score in Second Attempt for " + p1Name +": "+ p1.getScoreD2());
		System.out.println("Total Score for " + p1Name +": " + p1TotalScore);
		
		int p2TotalScore = p2.getScore();
		System.out.println("Dice Score in First Attempt for " + p2Name +": "  + p2.getScoreD1());
		System.out.println("Dice Score in Second Attempt for " + p2Name +": "  + p2.getScoreD2());
		System.out.println("Total Score for " + p2Name +": " + p2TotalScore);
		
		
		if(p1TotalScore > p2TotalScore) {
			System.out.println(p1Name + " is winner!");
		}
		
		else if(p1TotalScore < p2TotalScore) {
			System.out.println(p2Name + " is winner!");
		}
		
		else {
			System.out.println("Match is draw");
		}
		
		
		
		
		
	}

}
