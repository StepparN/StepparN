import java.util.Scanner;

public class hangagubbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("V�lkommen till h�nga gubbe!");
		System.out.println("V�lj sv�righetsgrad");
		System.out.println("(1) - Enkelt");
		System.out.println("(2) - Medelsv�rt");
		System.out.println("(3) - Sv�rt");
		
		int choice = input.nextInt();
		
        switch (choice) {
		
		case 1:
			System.out.println("Du har valt sv�righetsgraden enkelt, du f�r 12 gissningar p� dig.");
	
}
}
}