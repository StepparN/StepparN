import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] numbers = new int[37];
		boolean swapped;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.random()*100;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {

			swapped = false; // nollställer swapped i början på jämförelsen
			
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats på två intilliggande tal
					temp = numbers[i]; // sparar tillfälligt värdet på vänstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
					System.out.println(Arrays.toString(numbers));
				}

			}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));

	}
}