package com.company.group1;

import java .util.*;

public class Problem3 {
// incomplete
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number of students who scored less marks in batch 1: ");
		int n1 = scn.nextInt();
		
		System.out.println("Enter number of students who scored less marks in batch 2: ");
		int n2 = scn.nextInt();
		
		System.out.println("Enter number of students who scored less marks in batch 3: ");
		int n3 = scn.nextInt();
		
		System.out.println("Enter number of students who scored less marks in batch 4: ");
		int n4 = scn.nextInt();
		
		int leftMax = (Integer.compare(n1, n2) == 1 || Integer.compare(n1, n2) == 0) ? n1: n2; 
		int rightMax = (Integer.compare(n3, n4) == 1 || Integer.compare(n3, n4) == 0) ? n3: n4; 
		int max = (Integer.compare(leftMax, rightMax) == 1 || Integer.compare(leftMax, rightMax) == 0) ? leftMax: rightMax; 
		
		if(max%4!=0) {
			max = (max/4) + 1;
		} else {
			max/=4;
		}
		
		int[][] groups = new int[4][max];
		
		for (int i = 0; i < groups.length; i++) {
			for (int j = 0; j < groups[i].length; j++) {
				if(i==0) {
					groups[i][j] = (n1 >= 4) ? 4 : (n1 >=0) ? n1 : 0;
					n1-=4;
				} else if(i==1) {
					groups[i][j] = (n2 >= 4) ? 4 : (n2 >=0) ? n2 : 0 ;
					n2-=4;
				} else if(i==2) {
					groups[i][j] = (n3 >= 4) ? 4 : (n3 >=0) ? n3 : 0 ;
					n3-=4;
				} else if(i==3) {
					groups[i][j] = (n4 >= 4) ? 4 : (n4 >=0) ? n4 : 0 ;
					n4-=4;
				}
			}
		}
		
		for (int i = 0; i < groups.length; i++) {
			System.out.println(Arrays.toString(groups[i]));
		}
		
	}

}
