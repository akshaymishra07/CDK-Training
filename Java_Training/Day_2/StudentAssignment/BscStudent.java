package assignment;

public class BscStudent extends Student {

	private String specilization;
	private String collegeName;

	public BscStudent() {
		// TODO Auto-generated constructor stub
	}

	public BscStudent(int rollNo , String name , String specilization, String collegeName) {
		super(rollNo , name);
		this.specilization = specilization;
		this.collegeName = collegeName;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	public String toString() {
		super.toString();
		return "BscStudent [rollNo="+this.getRollNo()+" name="+this.getName()+"specilization=" + specilization + ", collegeName=" + collegeName + "]";
	}
	
	@Override
	public boolean equals(Student obj) {
		// TODO Auto-generated method stub
		        return (this.getSpecilization().equals(((BscStudent) obj).getSpecilization())) &&
				(this.getCollegeName().equals(((BscStudent) obj).getCollegeName()))  && super.equals(obj);
	}

}
