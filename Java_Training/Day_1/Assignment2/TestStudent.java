public class TestStudent {

	public static void main(String[] args) {
        StudentManipulation obj = new StudentManipulation();
		Student students[] = obj.createStudents();
		
		System.out.println("List of All Students");
		
		for(Student st : students) {
			st.display();
		}

		System.out.println("---------------------------------------");
		
		System.out.println("The Topper is :");
		Student topper = obj.findMax(students);
		topper.display();
	}

}
