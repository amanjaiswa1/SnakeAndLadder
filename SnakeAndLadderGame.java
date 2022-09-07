package com.assignments.day4.SnakeAndLadder;

import java.util.*;

public class SnakeAndLadderGame {
	static int P1 = 0;
    public static void main(String[] args) {
        System.out.println("Welcome Player 1");
        Random ran = new Random();
        int roll = ran.nextInt(5);
        int out = roll + 1;
        System.out.println("Player 1 rolled => "+out);
        System.out.println("PLayer 1 is at position => "+P1 + out);
    }
}
