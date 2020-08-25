package assignment;

public class Student {

	private int rollNo;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	public boolean equals(Student obj) {
		
		if(this.getRollNo() == obj.getRollNo() && this.getName().equals(obj.getName())) {
			return true;
		} 
		else
			return false;
		
	}

}
