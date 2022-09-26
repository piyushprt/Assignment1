package com.company.group3;

import java.util.Scanner;

//Data Recovery
public class Problem6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String s = scn.nextLine();
//		TEST INPUTS
//		2000 and was not However, implemented 1998 it until;9 8 3 4 1 5 7 2 6
//		programming first The language;3 2 1 4
		
		String[] inputStrings = s.split(";");
//		Getting two different Strings
		String input1 = inputStrings[0];	//Shuffled String
		String input2 = inputStrings[1];	//Index order
		
//		Making array with each word is put in different index
		String[] input1Array = input1.split(" ");
		String[] input2Array = input2.split(" ");
//		Array containing correct order index
		int[] indexArray = new int[input1Array.length];
		
		for (int i = 0; i < input2Array.length; i++) {
			indexArray[i] = Integer.parseInt(input2Array[i]) - 1;
		}
		
		
//		Reorder ?? indexArray and input1Array
		String[] order = new String[input1Array.length];
		
		for(int i=0;i<order.length;i++) {
			order[indexArray[i]] = input1Array[i];
		}
		
		for(int i=0;i<order.length;i++) {
			System.out.print(order[i] + " ");
		}
	}

}
