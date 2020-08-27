import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.exceptions.PersonNotFoundException;
import com.interfaces.PersonIOImpl;
import com.pojo.Person;

public class TestMain {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PersonIOImpl pio = new PersonIOImpl();
		char ch;
		
		List<Person> persons = pio.getPersons();
		
		try {
			
			do {
				System.out.println(
						"Menu \n1.Find a person by Id\n2.Update Person\n3.Add Person\n4.Remomve a person\n5.Display all persons");

				System.out.println("Enter your choice");
				int choice = kb.nextInt();
				
				switch(choice){
				   
				case 1 : 
				         System.out.println("Enter id");
				         int pid = kb.nextInt();
				         Person p = pio.findById(pid, persons);
				         if(p == null) {
				        	 throw new PersonNotFoundException("Person Not Present in the list");
				         }
				         else
				            System.out.println(p);
				         
				         break;
				         
				case 2 :
					    System.out.println("Enter id");
					    int pid1 = kb.nextInt();
					    Person p1 =  pio.updatePerson(pid1, persons);
					   if(p1 == null) {
						   throw new PersonNotFoundException("Person Not Present in the list");
					   }
					   else {
						   System.out.println("updated person is ");
						   System.out.println(p1);
					   }
					   
					   break;
				
				case 3 :
					System.out.println("Enter id");
				    int pid2 = kb.nextInt();
				    System.out.println("Enter name");
				    kb.nextLine();
				    String pname = kb.nextLine();
				    Person person = new Person(pid2 , pname);
				    persons = pio.addPerson(persons, person);
				    System.out.println(person + "   Added sucessfully...");
			        break;
			        
				case 4 : 
					   System.out.println("Enter id");
					   int pid3 = kb.nextInt();
					   
					   boolean rem = pio.removePerson(pid3, persons);
					   if(rem == false) {
						   throw new PersonNotFoundException("Person Not Present in the list");
					   }
					   else {
						   System.out.println("Person with id "+ pid3 +" removed successfully...." );
					   }
					   
					   break;
					   
				case 5 :
					    pio.displayPersons(persons);
					    break;
				}
				

				System.out.println("Do you want to continue ? (Y/N)");
				ch=kb.next().charAt(0);
				
			}while(ch == 'Y' || ch == 'y');
			
			
			
			
			
		} catch(PersonNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
