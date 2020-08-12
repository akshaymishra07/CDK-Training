
public class Stack {
	static int size = 20;
	int top;
	String arr[];

	Stack() {
		arr = new String[size];
		top = -1;
	}

	public void push(String str) {

		if (top == size - 1) {

			System.out.println("Stack Overflow !!");
		} else {
			top++;
			arr[top] = str;
			System.out.println(str+" Added to the stack");
		}

	}

	public String peek() {

		if (top == -1) {
			System.out.println("Stack Empty!! ");
			return null;
		} else
			return arr[top];
	}

	public String pop() {
		if (top == -1) {
			System.out.println("Stack Empty!! ");
			return null;
		} else {
			String res = arr[top];
			top--;
			return res;
		}

	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		} else
			return false;
	}

}
