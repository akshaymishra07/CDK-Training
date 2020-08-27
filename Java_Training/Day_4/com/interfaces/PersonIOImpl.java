package com.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exceptions.PersonNotFoundException;
import com.pojo.Person;

public class PersonIOImpl implements PersonIO {
 
	 Scanner kb = new Scanner(System.in);
	 
	@Override
	public List<Person> getPersons() {
		
		List<Person> persons = new ArrayList<>();
		int i = 0;
		while(i<5) {
			
			System.out.println("Enter Details of person "+(i+1));
			System.out.println("Enter id :");
			int id = kb.nextInt();
			kb.nextLine();
			
			System.out.println("Enter name :");
			String name = kb.nextLine();
			
			persons.add(new Person(id , name));
			
			
			i++;
		}
		
		return persons;
	    
	}

	@Override
	public Person findById(int id, List<Person> persons) {
		boolean found = false;
		for(Person p : persons) {
			
			if(p.getId() == id) {
				found = true;
				return p;
			}
		}
		
		return null;
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {
		
	Person p	 = findById(id, persons);
	
	if(p == null) {
		return false;
	}
	
	persons.remove(p);
		
		
		return true;
	}

	@Override
	public Person updatePerson(int id, List<Person> persons) {
		
		Person p = findById(id, persons);
		
		if(p == null) {
			return null;
		}
		
		System.out.println("Enter updated name");
		kb.nextLine();
		String uname = kb.nextLine();
		p.setName(uname);
		
		return p;
	}

	@Override
	public void displayPersons(List<Person> persons) {
		
		for(Person p : persons) {
			
			System.out.println(p);
		}

	}

	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		
		persons.add(person);
		
		return persons;
	}

}
