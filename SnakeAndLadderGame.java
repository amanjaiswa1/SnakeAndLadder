package com.assignments.day4.SnakeAndLadder;

import java.util.*;

public class SnakeAndLadderGame {
	
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
	         int play = ran.nextInt(3);
	        //System.out.println(roll+" "+out);
	         
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
	         System.out.println("PLayer 1 is at position => " + p1);
	         System.out.println("    ");
	         p1 += 0;
	     }
	}
	
    public static void main(String[] args) {
    	 System.out.println("Welcome Player 1.");
         game();
         System.out.println("Player 1 has completed the Game.");
}
}