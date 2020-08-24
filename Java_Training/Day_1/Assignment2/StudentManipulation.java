public class StudentManipulation {

	Student[] createStudents() {

		Student[] students = new Student[5];
        
		students[0] = new Student();
		students[0].setId(111);
		students[0].setName("Akash");
		students[0].setAge(22);
		students[0].setMarks(new int[]{34 , 43  , 30 , 30 , 25});
        
		students[1] = new Student();
		students[1].setId(222);
		students[1].setName("Lokesh");
		students[1].setAge(24);
		students[1].setMarks(new int[]{44 , 43  , 20 , 12 , 28});
		
		students[2] = new Student();
		students[2].setId(333);
		students[2].setName("Nikita");
		students[2].setAge(21);
		students[2].setMarks(new int[]{23 , 21  , 18 , 40 , 24});
		
		students[3] = new Student();
		students[3].setId(444);
		students[3].setName("Ankit");
		students[3].setAge(23);
		students[3].setMarks(new int[]{20 , 20  , 20 , 20 , 20});
		
		students[4] = new Student();
		students[4].setId(555);
		students[4].setName("Anuj");
		students[4].setAge(24);
		students[4].setMarks(new int[]{30, 42  , 34 , 34 , 25});
		
		
		return students;
		
		
	}

	int total(Student student) {

		int total = 0;
		for (int m : student.getMarks()) {

			total += m;
		}

		return total;
	}

	Student findMax(Student students[]) {

		int max = Integer.MIN_VALUE;
		Student topper = new Student();
		
		for(Student student : students) {
			
			int tot = total(student);
			
			if(tot > max) {
				topper = student;
			}
		}
		
		
		return topper;
	}

}
