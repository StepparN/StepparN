import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 5, 3, 5, 7, 0, 4, 3, 6, 9, 7, 10 };
		boolean swapped;
		int temp;
		
		System.out.println(Arrays.toString(numbers));
		
		do {

			swapped = false; // nollst�ller swapped i b�rjan p� j�mf�relsen
			
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats p� tv� intilliggande tal
					temp = numbers[i]; // sparar tillf�lligt v�rdet p� v�nstra sidan
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