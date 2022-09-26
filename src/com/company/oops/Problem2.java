package com.company.oops;

import java.util.Scanner;

class Book {
	int id;
	String title;
	String author;
	double price;
	
	void printBookDetails() {
		System.out.println("Book ID: " + id + 
				"\nTitle: " + title + 
				"\nAuthor: " + author + 
				"\nPrice: " + price);
	}
}

public class Problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Book book1 = new Book();
		
		System.out.println("Enter the book id: ");
		int bookId = scn.nextInt();
		scn.nextLine();
		System.out.println("Enter the title of book: ");
		String bookTitle = scn.nextLine();
		
		System.out.println("Enter the name of author: ");
		String bookAuthor = scn.nextLine();
		
		
		System.out.println("Enter the price of the book: ");
		double bookPrice = scn.nextDouble();
		
		book1.id = bookId;
		book1.title = bookTitle;
		book1.author = bookAuthor;
		book1.price = bookPrice;
		
		book1.printBookDetails();
	}

}
