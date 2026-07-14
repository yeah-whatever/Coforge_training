package com.coforge.day3;

public class Book {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;

	
	public Book(int bookId, String bookTitle, String bookAuthor, int bookPrice) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}


	public void display() {
		System.out.println("Book id : " +  this.bookId);
		System.out.println("Book Title : " + this.bookTitle);
		System.out.println("Book Author : " + this.bookAuthor);
		System.out.println("Book Price : " + this.bookPrice);
	}

}
