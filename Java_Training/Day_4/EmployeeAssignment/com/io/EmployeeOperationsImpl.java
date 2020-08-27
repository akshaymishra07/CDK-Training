package com.io;

import java.util.List;

import com.pojo.Employee;

public class EmployeeOperationsImpl implements EmployeeOperations {

	EmpIOImpl employeeIo = new EmpIOImpl();

	@Override
	public boolean addEmployee(Employee employee) {

		List<Employee> employees = employeeIo.readFromFile();

		employees.add(employee);

		employeeIo.addToFile(employees);
		return true;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		List<Employee> employees = employeeIo.readFromFile();
		Employee employee = null;

		for (Employee e : employees) {

			if (e.getEmpId() == id) {
				employee = e;
			}

		}

		if (employee != null) {

			employee.setEmpName(name);
		}

		employeeIo.addToFile(employees);

		return employee;
	}

	@Override
	public Employee deleteEmployee(int id) {
		List<Employee> employees = employeeIo.readFromFile();
		Employee employee = null;

		for (Employee e : employees) {
			if (e.getEmpId() == id) {
				employee = e;
			}
		}

		if(employee != null) {
			employees.remove(employee);
		}
		
		employeeIo.addToFile(employees);
		
		return employee;
	}

	@Override
	public Employee findEmployeeById(int id) {

		List<Employee> employees = employeeIo.readFromFile();
		Employee employee = null;
		for (Employee e : employees) {

			if (e.getEmpId() == id) {
				employee = e;
			}
		}

		return employee;
	}

	@Override
	public void findAllEmployees() {
		List<Employee> employees = employeeIo.readFromFile();
		
		if(employees == null) {
			
			System.out.println("No Records found in the system...");
			
		}else {
		
			employees.forEach((emp)->{
				
				employeeIo.displayToUser(emp);
			});
			
		}
		
		
		
		
		
		
	}

}
