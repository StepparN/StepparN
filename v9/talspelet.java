import java.util.Scanner;

public class talspelet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Välkommen till talspelet!");
		System.out.println("Välj svårighetsgrad");
		System.out.println("(1) - Enkelt");
		System.out.println("(2) - Medelsvårt");
		System.out.println("(3) - Svårt");
		
		int choice = input.nextInt();
		
		switch (choice) {
		
		case 1:
		    System.out.println("Du har valt svårighetsgraden Enkelt.");
		    int min1 = 0;
		    int max1 = 100;
		    break;
		
		case 2:
			System.out.println("Du har valt svårighetsgraden Medelsvårt.");
			int min2 = 0;
			int max2 = 100;
			break;
			
		case 3:
			System.out.println("Du har valt svårighetsgraden Svårt.");
			int min3 = 0;
			int max3 = 100;
			break;
		
		
		}
  
	}

}
