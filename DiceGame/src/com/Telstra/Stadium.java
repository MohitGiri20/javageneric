package com.Telstra;

public class Stadium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Player p1 = new Player();
		Player p2 = new Player();
		
		
		int p1Score = p1.getScore();
		System.out.println(p1.getScoreD1());
		System.out.println(p1.getScoreD2());
		System.out.println("Total Score:" + p1Score);
		
		int p2Score = p2.getScore();
		System.out.println(p2.getScoreD1());
		System.out.println(p2.getScoreD2());
		System.out.println("Total Score:" + p2Score);
		
		
		if(p1Score > p2Score) {
			System.out.println("P1 is winner!");
		}
		
		else if(p1Score < p2Score) {
			System.out.println("P2 is winner!");
		}
		
		else {
			System.out.println("Match is draw");
		}
		
		
		
		
		
	}

}
