package com.company.group1;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Guess number between 0 to 99: ");
		
		int a = (int) (Math.random() * 100);
//		System.out.println(a);
		
		while (true) {
			int guess = scn.nextInt();
			
			if(guess == a) {
				System.out.println("Congratulations! You guessed it right.");
				break;
			} else if(guess < a) {
				System.out.println("Too lower");
			} else {
				System.out.println("Too higher");
			}
		}
		
		scn.close();
	}

}
