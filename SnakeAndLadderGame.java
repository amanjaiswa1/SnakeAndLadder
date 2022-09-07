package com.assignments.day4.SnakeAndLadder;

import java.util.*;

public class SnakeAndLadderGame {
	static int counter = 0;
	static void game() {
		int p1 = 0;
	    while (p1 < 100) {
	             if (p1 < 0) {
	                 p1 = 0;
	                 continue;
	             }
	         Random ran = new Random();
	         int roll = ran.nextInt(5);
	         int out = roll + 1;
	         if (p1 + out > 100) {
	                continue;
	            }
	         int play = ran.nextInt(3);
	
	         if (play == 1) {
	             p1 = p1 - out;
	             System.out.println("Player 1 rolled => " + out);
	             System.out.println("SNAKE: Player 1 found a Snake and moved behind.");
	             } 
	         else if (play == 2) {
	             p1 = p1 + out;
	             System.out.println("Player 1 rolled => " + out);
	             System.out.println("LADDER: Player 1 moved ahead using Ladder.");
	             }
	         else {
	        	 System.out.println("Player 1 rolled => " + out);
	             System.out.println("NO PLAY: Player 1 can't move forward.");
	         }
	         counter++;
	         System.out.println("Number of Die rolls by PLayer 1 => "+counter);
	         System.out.println("PLayer 1 is at position => " + p1);
	         System.out.println("    ");
	     }
	   
	}
	
    public static void main(String[] args) {
    	 System.out.println("Welcome Player 1.");
         game();
         System.out.println("Player 1 has completed the Game.");
         System.out.println("Total number of Die rolled => "+counter);
}
}