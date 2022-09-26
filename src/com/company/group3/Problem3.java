package com.company.group3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner  scn = new Scanner(System.in);
		
		String s = scn.nextLine();
		
		int beauty = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'a' && ch <='z') {
				beauty+=(ch-'a' + 1);
			} else if (ch >= 'A' && ch <= 'Z') {
				beauty+=(ch - 'A' + 1);
			}
		}
		
		System.out.println(beauty);
	}

}
