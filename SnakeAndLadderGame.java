package com.assignments.day4.SnakeAndLadder;

import java.util.*;

public class SnakeAndLadderGame {

    public static void main(String[] args) {
    	 System.out.println("Welcome Player 1.");
         int p1 = 0;
         Random ran = new Random();
         int roll = ran.nextInt(5);
         int out = roll + 1;
         int play = ran.nextInt(3);
         int move = 0;
         System.out.println("Player 1 rolled => "+out);
         
         if (play == 1) {
             move = move - out;
             p1 = move;
             System.out.println("SNAKE: Player 1 found a Snake and moved behind.");
             System.out.println("PLayer 1 is at position => "+p1);
         } 
         else if (play == 2) {
             move = move + out;
             p1 = move;
             System.out.println("LADDER: Player 1 moved ahead using Ladder.");
             System.out.println("PLayer 1 is at position => "+p1);
         }
         else {
             System.out.println("NO PLAY: Player 1 can't move forward.");
             System.out.println("PLayer 1 is at position => "+p1);
         }
     }
}
