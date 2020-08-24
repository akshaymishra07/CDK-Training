public class Assignment1 {

	static void printArray(int arr[]) {

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int numbers[] = new int[10];
		int counter = 34;
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = counter;

			if (i % 2 == 0) {
				counter += 8;
			} else {
				counter -= 3;
			}
		}

		printArray(numbers);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int number : numbers) {

			if (number < min) {
				min = number;
			}

			if (number > max) {
				max = number;
			}
		}

		System.out.println("Minimum : " + min + "   Maximum : " + max);
	}

}
