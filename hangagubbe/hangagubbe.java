import java.util.Scanner;

public class hangagubbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Välkommen till hänga gubbe!");
		System.out.println("Välj svårighetsgrad");
		System.out.println("(1) - Enkelt");
		System.out.println("(2) - Medelsvårt");
		System.out.println("(3) - Svårt");
		
		int choice = input.nextInt();
		
        switch (choice) {
		
		case 1:
			System.out.println("Du har valt svårighetsgraden enkelt, du får 12 gissningar på dig.");
	
}
}
}