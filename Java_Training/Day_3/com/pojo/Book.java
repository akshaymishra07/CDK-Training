package com.pojo;

public class Book {
    
	private long bookISBN;
	private String name;
	private double price;
	private String publication;
	private String Author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(long bookISBN, String name, double price) {
		super();
		this.bookISBN = bookISBN;
		this.name = name;
		this.price = price;
	}

	public Book(long bookISBN, String name, double price, String publication, String author) {
		super();
		this.bookISBN = bookISBN;
		this.name = name;
		this.price = price;
		this.publication = publication;
		Author = author;
	}

	@Override
	public String toString() {
		return "Book [bookISBN=" + bookISBN + ", name=" + name + ", price=" + price + ", publication=" + publication
				+ ", Author=" + Author + "]";
	}

	public long getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(long bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
	
	
}
