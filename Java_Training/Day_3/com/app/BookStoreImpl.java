package com.app;

import java.util.Scanner;

import com.exceptions.BookNotFoundException;
import com.pojo.Book;

public class BookStoreImpl implements BookStore {

	@Override
	public Book[] getBooks() {
		Scanner kb = new Scanner(System.in);
		Book books[] = new Book[5];
		int i = 0;

		while (i < 5) {
			System.out.println("Enter Book Details for book  " + (i + 1));

			System.out.println("Enter Isbn of the book");
			long isbn = kb.nextLong();
			kb.nextLine();

			System.out.println("Enter name of the book");
			String bname = kb.nextLine();

			System.out.println("Enter price of the book");
			double bprice = kb.nextDouble();
			kb.nextLine();

			System.out.println("Enter the publication ");
			String publication = kb.nextLine();

			System.out.println("Enter the Author of the book");
			String author = kb.nextLine();

			books[i] = new Book(isbn, bname, bprice, publication, author);

			i++;
		}

		return books;
	}

	@Override
	public Book findBookById(Book[] books, long Id) {
		boolean found = false;
		for(Book b : books) {
			
			if(b.getBookISBN() == Id) {
				found = true ;
				return b;
			}
		}
		
		try{
			
			if(found == false) {
			throw new BookNotFoundException("Book is not available in the store...");
		}
		}catch (BookNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public Book findBookByName(Book[] books, String name) {
		// TODO Auto-generated method stub
	
		boolean found = false;
		for(Book b : books) {
			
			if(b.getName().equals(name)) {
				return b;
			}
			
			
			
		}
		try {
			if(found == false) {
				throw new BookNotFoundException("Book is not available in the store...");
			}
		} catch (BookNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Book updateBook(Book[] books, long Id, double price) {
		// TODO Auto-generated method stub
		
		Book b = findBookById(books, Id);
		b.setPrice(price);
		
		return b;
	}

	@Override
	public void displayBooks(Book[] books) {
		
		for(Book b : books) {
			
			System.out.println(b);
		}

	}

}
