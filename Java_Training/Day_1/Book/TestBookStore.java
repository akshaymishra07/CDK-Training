package assignment3;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TestBookStore {

	public static void main(String[] args) {

		BookStore bs = new BookStore();

		Book books[] = bs.getBooks();

		System.out.println("The list of books is");

		for (Book bk : books) {
			System.out.println(bk);
		}

		System.out.println("-------------------------------------------");

		System.out.println("Finding book by Id: 2299475");
		Book book = bs.findBookById(10000, books);
		if(book.getId() == 0) {
			System.out.println("Book Not Found");
		}else {
			System.out.println(book);	
		}
		

		System.out.println("-------------------------------------------");

		System.out.println("Book 7893214 Price Before updation ");
		System.out.println(bs.findBookById(7893214, books));

		System.out.println("Book 7893214 Price After updation ");
		Book book1 = bs.updateBook(7893214, 2300.78, books);
		System.out.println(book1);

		System.out.println("-------------------------------------------");

	}

}
