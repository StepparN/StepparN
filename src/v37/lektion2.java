package v37;

import java.util.Scanner;

public class lektion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String namn1 = "Kalle Favoryt";
		String namn2 = "Pancek Men";
		String namn3 = "ScraeM";
		
		System.out.println("Skriv ett namn: "); // skriver in ett meddelande
		
		String namn4 = input.nextLine(); // läser in ett namn från konsolen
		
		System.out.println("Skriv ett namn: ");
		
		String namn5 = input.nextLine();
		
		System.out.println("\nNAMN:");
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5 + "\n");
		
				
	}

}
