package v37;

import java.util.Scanner;

public class laxa1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String namn1 = input.nextLine();
		
		System.out.println("Hur gammal ‰r du?");
		String alder = input.nextLine();
		
		System.out.println("Vad ‰r din adress?");
		String adress = input.nextLine();
		
		System.out.println("Vad ‰r ditt postnummer?");
		String postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextLine();
		
		System.out.println("Vad ‰r ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println("\nInformation:");
		System.out.println("\nNamn:");
		System.out.println(namn1);
		
		System.out.println("\n≈lder:");
		System.out.println(alder);
		
		System.out.println("\nAdress:");
		System.out.println(adress);
		
		System.out.println("\nPostnummer:");
		System.out.println(postnummer);
		
		System.out.println("\nStad:");
		System.out.println(stad);
		
		System.out.println("\nTelefeonnummer:");
		System.out.println(telefonnummer);
		
	}

}
