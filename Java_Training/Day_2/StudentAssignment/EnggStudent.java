package assignment;

public class EnggStudent extends Student {

	private String stream;
	private String collegeName;

	public EnggStudent() {
		// TODO Auto-generated constructor stub
	}

	public EnggStudent(int rollNo, String name, String stream, String collegeName) {
		super(rollNo , name);
		this.stream = stream;
		this.collegeName = collegeName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	@Override
	public boolean equals(Student obj) {
		// TODO Auto-generated method stub
		
		
		
		return (this.getStream().equals(((EnggStudent) obj).getStream())) &&
				(this.getCollegeName().equals(((EnggStudent) obj).getCollegeName())) &&
				super.equals(obj);
	}
	
	

}
