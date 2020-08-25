package assignment3;
//BookStore

//Book[] getBooks()//create an array of 5 objects to store information
//Book findBookById(long ID); //return the book of matching ID
//Book updateBook(long ID,double price);//update the bookprice of matching ID

public class BookStore {

	
	
	Book[] getBooks() {

		Book books[] = new Book[5];

		books[0] = new Book(5887741, "Five Point Somenone", "Chetan Bhagat", 458.76);
		books[1] = new Book(6699742, "Alchemist", "Paulo Coelho", 330.00);
		books[2] = new Book(2299475, "The Da Vinci Code", "Dan Brown", 754.35);
		books[3] = new Book(1937852, "Atomic Habits", "James Clear", 221.75);
		books[4] = new Book(7893214, "Harry Potter", "J.K Rowling", 500.00);

		return books;
	}

	Book findBookById(long id , Book[] books) {
		Book temp = null;
		for (Book book : books) {

			if (book.getId() == id) {
				temp = book;
			}

		}

		return temp;
	}

	Book updateBook(long id, double price , Book[] books) {
         Book temp = findBookById(id , books);
         
		 temp.setPrice(price);
		 
		 return temp; 
		
	}

}
