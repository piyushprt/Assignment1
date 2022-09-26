package com.company.group1;

//10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5
public class Problem6 {

	public static void main(String[] args) {
		double[] rainfall = {
				10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5
		};
		
		double avg = 0.0;
		double sum = 0.0;
		
		for (int i = 0; i < rainfall.length; i++) {
			sum+=rainfall[i];
		}
		
		avg = sum / rainfall.length;

		System.out.println("Rainfall values who are greater than average value: ");
		for (int i = 0; i < rainfall.length; i++) {
			if(rainfall[i] > avg)
				System.out.println(rainfall[i]);
		}
	}

}
