import java.util.Scanner;

public class lektion {

	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	int tal1 = 0;
	int tal2 = 0;
	
	System.out.println("Skriv ut heltal");
	
	tal1 = input.nextInt();
	tal2 = input.nextInt();
	
	if (tal1 >= tal2) {
		System.out.println("Lägsta numret");
	}
	else {
		System.out.println("Lägsta numret" + tal2);
	
	}
		
	}
}
