import java.util.Scanner;

class Employee {

	private int empNo;
	private String empName;
	private double salary;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empNo, String empName, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}

}

public class Lab3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		Employee arrayOfEmployees[] = new Employee[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Enter NUMBER , NAME and Salary Of employee " + i);

			arrayOfEmployees[i] = new Employee(kb.nextInt(), kb.next(), kb.nextDouble());

		}
		
		System.out.println("---------DETAILS OF ALL EMPLOYEES-----------");
		
		for(int i = 0 ; i < 5 ; i++  ) {
			//Without using toString Method
			//System.out.println(arrayOfEmployees[i].getEmpNo() +" "+arrayOfEmployees[i].getEmpName()+" "+arrayOfEmployees[i].getSalary());
			
			
			//using toString Method
			System.out.println(arrayOfEmployees[i]);
			
		}
		
		kb.close();

	}

}
