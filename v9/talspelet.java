import java.util.Scanner;

public class talspelet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("V�lkommen till talspelet!");
		System.out.println("V�lj sv�righetsgrad");
		System.out.println("(1) - Enkelt");
		System.out.println("(2) - Medelsv�rt");
		System.out.println("(3) - Sv�rt");
		
		int choice = input.nextInt();
		
		switch (choice) {
		
		case 1:
		    System.out.println("Du har valt sv�righetsgraden Enkelt.");
		    int min1 = 0;
		    int max1 = 100;
		    break;
		
		case 2:
			System.out.println("Du har valt sv�righetsgraden Medelsv�rt.");
			int min2 = 0;
			int max2 = 100;
			break;
			
		case 3:
			System.out.println("Du har valt sv�righetsgraden Sv�rt.");
			int min3 = 0;
			int max3 = 100;
			break;
		
		
		}
  
	}

}
