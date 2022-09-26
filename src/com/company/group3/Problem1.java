package com.company.group3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String s = scn.nextLine();
		
		scn.close();
		
		String[] sArray = s.split(" ");
		
		int longest = Integer.MIN_VALUE;
		
		String longestString = "";
		
		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i].length() > longest) {
				longestString = sArray[i];
				longest = sArray[i].length();
			}
		}
		int Outcount = 1;
		for (int i=0; i < longestString.length(); i++) {
			char ch = longestString.charAt(i);
			System.out.print(ch + " ");
			int count = 1;
			while (count <= Outcount && i < longestString.length() -1) {
				System.out.print("*");
				count++;
			}
			Outcount++;
		}

	}

}
