package com.company.group1;

import java.util.Scanner;

//BMI
public class Problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String firstName = scn.next();
		
		String lastName = scn.next();
		
		double weight = scn.nextDouble();
		
		double height = scn.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI : " + BMI);
		
		if(BMI < 18.5)
			System.out.println("Underweight");
		else if(BMI > 18.5 && BMI < 25)
			System.out.println("Normal");
		else if(BMI > 25 && BMI < 30) 
			System.out.println("Overweight");
		else 
			System.out.println("Obese Class");
	}

}
