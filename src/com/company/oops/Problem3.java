package com.company.oops;

import java.util.Scanner;

class Account {
	double balance = 500.0;
	
	public void withdrawAmount(double amt) {
		if(amt <= balance) {
			balance-=amt;
			System.out.println("Withdrawing money....");
			System.out.println("Current Balance : " + balance);
		} else {
			System.out.println("Balance cannot be negative");
		}
	}
	
	public void depositAmount(double amt) {
		if(amt > 0) {
			balance+=amt;
			System.out.println("Depositing money...");
			System.out.println("Current Balance : " + balance);
		} else {
			System.out.println("Amount cannot be negative");
		}
	}
}

public class Problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Account a1 = new Account();
		
		while(true) {
			System.out.println("Select Option\n"
					+ "1.Withdraw amount\n"
					+ "2.Deposit amount\n3.Exit");
			
			int choice = scn.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter amount to withdraw : ");
				double amount = scn.nextDouble();
				a1.withdrawAmount(amount);
			} else if(choice == 2) {
				System.out.println("Enter amount to deposit : ");
				double amount = scn.nextDouble();
				a1.depositAmount(amount);
			} else if(choice == 3) {
				System.out.println("Thank you");
				break;
			}
		}
	}

}
