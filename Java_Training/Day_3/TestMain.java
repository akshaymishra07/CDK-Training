import java.util.Scanner;

import com.app.BookStoreImpl;
import com.pojo.Book;

public class TestMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BookStoreImpl bs = new BookStoreImpl();
		char ch;

		Book books[] = bs.getBooks();

		do {
			System.out.println(
					"Menu \n1.Find a Book by Id\n2.Find a Book by name\n3.Update Price of a book\n4.Display All Books");

			System.out.println("Enter your choice");
			int choice = kb.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Id ");
				long id = kb.nextLong();
				Book tmp = bs.findBookById(books, id);
				System.out.println(tmp);
				break;

			case 2:
				System.out.println("Enter name");
				kb.nextLine();
				String name = kb.nextLine();
				Book tmp1 = bs.findBookByName(books, name);
				System.out.println(tmp1);
				break;
			case 3:
				System.out.println("Enter Id");
				long id1 = kb.nextLong();
				System.out.println("Enter updated price");
				double price = kb.nextDouble();
				Book tmp2 = bs.updateBook(books, id1, price);
				System.out.println("Update details are");
				System.out.println(tmp2);
				
				break;
			case 4:
				 bs.displayBooks(books);
				 break;

			}
			
			System.out.println("Do you want to continue ? (Y/N)");
			ch=kb.next().charAt(0);
			

		} while (ch == 'Y' || ch == 'y');

	}
}
