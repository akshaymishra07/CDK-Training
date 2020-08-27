package com.app;

import java.util.Scanner;

import com.io.EmpIOImpl;
import com.io.EmployeeOperationsImpl;
import com.pojo.Employee;

public class TestMain {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		EmployeeOperationsImpl eop = new EmployeeOperationsImpl();
		EmpIOImpl eio = new EmpIOImpl();
		char ch;

		do {
			System.out.println(
					"----Menu-----\n1.Add Employee\n2.Update Employee\n3.Find Employee\n4.Display All Employes\n5.Delete Emplopyee");
			int choice = kb.nextInt();

			switch (choice) {

			case 1:
				Employee employee = eio.readFromUser();
				boolean status = eop.addEmployee(employee);

				if (status == true) {
					System.out.println("Employee Added.....");
					eio.displayToUser(employee);

				}

				break;

			case 2:
				System.out.println("Enter ID");
				int id = kb.nextInt();
				System.out.println("Enter updated name");
				kb.nextLine();
				String name = kb.nextLine();

				Employee emp = eop.updateEmployee(id, name);

				if (emp == null) {
					System.out.println("Employee Records Not Present in the system....");
				} else {
					System.out.println("Updated Employee");
					eio.displayToUser(emp);
				}
				break;

			case 3:
				System.out.println("Enter ID");
				int id1 = kb.nextInt();

				Employee emp1 = eop.findEmployeeById(id1);

				if (emp1 != null) {
					System.out.println("Records Found..");
					eio.displayToUser(emp1);
				}
				else {
					System.out.println("Records Not Found in the System......");
				}
				break;

			case 5:
				System.out.println("Enter ID");
				int id2 = kb.nextInt();

				Employee emp2 = eop.deleteEmployee(id2);

				if (emp2 == null) {

					System.out.println("Employee Records not present in the system....");
				} else {
                     
					System.out.println("Employee Records Deleted...");
					eio.displayToUser(emp2);
				}
                break;
                
			case 4 :
				  eop.findAllEmployees();
				  break;
			}

			System.out.println("Do you want to continue....(Y/N)?");
			ch = kb.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}
}
