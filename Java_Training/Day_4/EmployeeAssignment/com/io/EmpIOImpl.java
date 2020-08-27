package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;

public class EmpIOImpl implements EmpIO {
 
	 Scanner kb = new Scanner(System.in); 
	
	@Override
	public void addToFile(List<Employee> employees) {
		
		FileOutputStream fo;
		ObjectOutputStream oo;
		try {
			 fo = new FileOutputStream("employee.txt");
			 oo = new ObjectOutputStream(fo);
			 oo.writeObject(employees);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public List<Employee> readFromFile() {
		
		List<Employee>  employees  = new ArrayList<>();
		
		try {
			FileInputStream fi = new FileInputStream("employee.txt") ;
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			employees = (List<Employee>) oi.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return employees;
	}

	@Override
	public Employee readFromUser() {
		System.out.println("Enter employee ID");
		int id = kb.nextInt();
		System.out.println("Enter name of the employee");
		kb.nextLine();
		String name = kb.nextLine();
		System.out.println("Enter city of the employee");
		String city = kb.nextLine();
		System.out.println("Enter state of the employee");
		String state = kb.nextLine();
		System.out.println("Enter the pincode");
		String pincode = kb.nextLine();
		
		Address address = new Address(city , state , pincode);
		
		Employee employee = new Employee(id , name , address); 
		return employee;
	}

	@Override
	public void displayToUser(Employee emp) {
	
		System.out.println("Id : "+emp.getEmpId()+ "   Name :"+emp.getEmpName());
		System.out.println("Address :  "+emp.getAddress().getCity()+","+emp.getAddress().getState()+","+emp.getAddress().getPincode());
        
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
	}

}
