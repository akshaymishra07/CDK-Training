package assignment;

public class CommerceStudent extends Student {
 
	 private String majorSubject;
	 private String collegeName;
	 
	 public CommerceStudent() {
		// TODO Auto-generated constructor stub
	}

	public CommerceStudent(int rollNo , String name ,String majorSubject, String collegeName) {
		super(rollNo , name);
		this.majorSubject = majorSubject;
		this.collegeName = collegeName;
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	public String toString() {
		super.toString();
		return "CommerceStudent [rollNo="+this.getRollNo()+" name="+this.getName()+" majorSubject=" + majorSubject + ", collegeName=" + collegeName + "]";
	}
	
	@Override
	public boolean equals(Student obj) {
		// TODO Auto-generated method stub
		return (this.getMajorSubject().equals(((CommerceStudent) obj).getMajorSubject())) &&
				(this.getCollegeName().equals(((EnggStudent) obj).getCollegeName())) &&
				super.equals(obj);
	}
	 
	
}
