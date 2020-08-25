package inheritance;

public class SalariedEmployee extends Employee {

	private long salary;
	private double incentives;
	private double ta;
	private double grossSalary;

	public SalariedEmployee(int id, String name, long salary, double incentives, double ta) {
		super(id, name);
		this.salary = salary;
		this.incentives = incentives;
		this.ta = ta;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public void display() {
		super.display();

		System.out.println(
				"Salary " + this.getSalary() + "  Incentives " + this.getIncentives() + " TA :" + this.getTa());

	}

	public double totalSalary() {

		
		this.setGrossSalary(this.salary + this.incentives + this.ta);

		return this.grossSalary;

	}
}
