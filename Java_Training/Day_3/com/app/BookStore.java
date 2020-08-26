package com.app;

import com.pojo.Book;

public interface BookStore {
	
	Book[] getBooks();
	Book findBookById(Book books[] , long Id);
	Book findBookByName(Book books[] , String name);
	
	Book updateBook(Book books[] , long Id , double price);
	void displayBooks(Book books[]);

}
