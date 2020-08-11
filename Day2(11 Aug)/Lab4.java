import java.util.Scanner;

class EmployeeManager {
	static int count = 10;
	static int currentIndex = 0;
	private Employee employeeArray[] = new Employee[count];

	void createEmployee(Employee e) {

		if (currentIndex == 10) {
			System.out.print("Employee Array is Full!!");
			return;
		}

		employeeArray[currentIndex] = e;
		currentIndex++;

	}

	void updateEmployee(int eno, Employee e) {

		if (currentIndex == 0 || employeeArray[0] == null) {

			System.out.println("Array Empty !!");
			return;
		}

		boolean updateFlag = false;

		for (int i = 0; i < currentIndex; i++) {

			if (employeeArray[i].getEmpNo() == eno) {
				employeeArray[i] = e;
				updateFlag = true;

			}

		}

		if (updateFlag == true) {

			System.out.println("Records Updated for Employee No. " + eno);

		} else {
			System.out.println("Employee Not Found!! Try Again.....");
		}
	}

	void deleteEmployee(int eno) {

		int foundIndex = -1;
		for (int i = 0; i < currentIndex; i++) {

			if (employeeArray[i].getEmpNo() == eno) {

				foundIndex = i;
			}

		}

		if (foundIndex == -1) {

			System.out.println("Record Not Found !!.....");
			return;
		}

		for (int j = foundIndex; j < currentIndex - 1; j++) {

			employeeArray[j] = employeeArray[j + 1];
		}

		employeeArray[currentIndex - 1] = null;
		currentIndex--;

	}

	void printAll() {

		for (int i = 0; i < currentIndex; i++) {
			System.out.println(employeeArray[i]);
		}

	}
}

public class Lab4 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		EmployeeManager eManager = new EmployeeManager();
		char ch;

		do {

			System.out
					.println("1.Add Employee \n2.Update Employee Details \n3.Delete Employee  \n4.List All Employees");
			System.out.println("Enter your choice....");
			int n = kb.nextInt();

			switch (n) {

			case 1:
				System.out.println("Enter Number , Name and Salary of the Employee..?");
				Employee e = new Employee(kb.nextInt(), kb.next(), kb.nextDouble());
				eManager.createEmployee(e);
				break;

			case 2:
				System.out.println("Enter Employee Number?");
				int eno = kb.nextInt();

				System.out.println("Enter updated  name and salary of the employee ..");
				Employee e1 = new Employee(eno, kb.next(), kb.nextDouble());
				eManager.updateEmployee(eno, e1);
				break;

			case 3:
				System.out.println("Enter Employee Number?");
				int enu = kb.nextInt();

				eManager.deleteEmployee(enu);
				break;

			case 4:
				eManager.printAll();
				break;

			}

			System.out.println("Wanna Continue... Y/N");
			ch = kb.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}

