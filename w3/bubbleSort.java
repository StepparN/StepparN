import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] numbers = new int[37];
		boolean swapped;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) { //slumpar 37 heltal mellan 0-1000
			numbers[i] = (int) (Math.random()*1000);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {

			swapped = false; // nollst�ller swapped i b�rjan p� j�mf�relsen
			
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats p� tv� intilliggande tal
					temp = numbers[i]; // sparar tillf�lligt v�rdet p� v�nstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
				}

			}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));

	}
}