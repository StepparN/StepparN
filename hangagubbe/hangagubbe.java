import java.util.Scanner;
import java.util.Random;

public class hangagubbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
			String[] ord = { "SANDL�DA", "PARFYM", "GITARR", "LEKPLATS", "SM�RG�S", "DATOR",
			"PENNA", "SK�L", "PAPPER", "V�SKA"};
			
			boolean spela = true;
			while (spela) { 
				System.out.println("V�lkommen till h�nga gubbe, du f�r 10 gissningar p� dig.");
				char[]slumpatord = ord[random.nextInt(ord.length)].toCharArray();
				int Gissningar = 10; 
				char[]Spelargissning = new char[slumpatord.length];
				for (int i = 0; i < Spelargissning.length; i++) {
					Spelargissning[i]='_';
				}
				
				int f�rs�k = 0;
				boolean gissatord = false;
				
				while (!gissatord && f�rs�k != Gissningar) {
					System.out.println("Gissningar:" + f�rs�k);
					printArray(Spelargissning);
					System.out.printf("Du har %d f�rs�k kvar \n", Gissningar - f�rs�k);
					System.out.println("Skriv en bokstav");
					f�rs�k++;
					char input = scanner.next().toUpperCase().charAt(0);
					if (input == '_') {
						spela = false;
						gissatord = true;
					} else {
					for (int i = 0; i < slumpatord.length; i++) {
		                if (slumpatord[i]==input) {
		                	Spelargissning[i] = input;
		            }
							}
					if(r�ttord(Spelargissning)){
						gissatord = true;
						System.out.println("Du vann!");
					}
					}
				}
					if(!gissatord)
						System.out.println("Du har slut p� f�rs�k.");
					
					}
					}
			
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "");
		} System.out.println();
	}
	public static boolean r�ttord(char[]array) {
		for (int i = 0; i < array.length;i++) {
			if (array[i] =='_') return false;
		}
		return true;
	}
		
	}