package assignment;

public class TestStudents {

	public static boolean search(Student students[], Student student) {

		for (Student st : students) {
            if(st.getName().equals(student.getName())) {
			if (st.equals(student)) {
				return true;
			}
		}
		}
		return false;
	}

	public static void main(String[] args) {

		Student students[] = new Student[7];

		students[0] = new EnggStudent(12, "Akshay", "Computer", "SIT");
		students[1] = new EnggStudent(32, "Lokesh", "Civil", "IIT");
		students[2] = new EnggStudent(10, "Shweta", "ENTC", "NIT");

		students[3] = new BscStudent(43, "Shyam", "Physics", "ABC Science College");
		students[4] = new BscStudent(42, "John", "Maths", "XYZ Science College");

		students[5] = new CommerceStudent(27, "Tim", "Accounts", "PQR Commerce College");
		students[6] = new CommerceStudent(30, "Adams", "Economics", "DEF Commerce College");

		System.out.println("--------Displaying All Students-----");

		for (Student st : students) {
			System.out.println(st);
			System.out.println();
		}
		System.out.println("------------------------------------");

		CommerceStudent cs = new CommerceStudent(30, "Adams", "Economics", "DEF Commerce College");
		System.out.println(cs);
		boolean result = search(students, cs);
		if (result) {
			System.out.println("Found!!");
		} else
			System.out.println("Not Found!!");

		EnggStudent es = new EnggStudent(20, "Shivani", "Electrical", "CIT");
		System.out.println(es);
		boolean result1 = search(students, es);
		if (result1) {
			System.out.println("Found!!");
		} else
			System.out.println("Not Found!!");

	}

}
