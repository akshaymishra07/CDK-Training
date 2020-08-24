public class Student {

	private int id;
	private String name;
	private int age;
	private int marks[];
 
	public Student() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("-------------------------------------------------------");
		System.out.println(this.id + " " + this.name + " " + this.age);
		System.out.println("Marks Obtained are :");
		for (int sm : this.marks) {

			System.out.print(sm + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
	}

}
