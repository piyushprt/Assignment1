package com.company.group3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String s = scn.nextLine();
//		Feb 2004-Dec 2009;Sep 2004-Jul 2008 Input Format
//		Jan 2004-Dec 2004
		String[] dateArray = s.split(";");
		
		int diff = 0;
		for (int i = 0; i < dateArray.length; i++) {
			String[] datesSeparated = dateArray[i].split("-");
			
			Date date1 = new SimpleDateFormat("MMM yyyy").parse(datesSeparated[0]);
			Date date2 = new SimpleDateFormat("MMM yyyy").parse(datesSeparated[1]);
			
			int currDiff = date2.getYear() - date1.getYear();
			
			if(diff < currDiff) {
				diff = currDiff;
			}
		}
		
		System.out.println("Maximum experience: "+diff);

	}

}
