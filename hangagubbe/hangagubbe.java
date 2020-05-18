import java.util.Scanner;
import java.util.Random;

public class hangagubbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
			String[] ord = { "SANDLÅDA", "PARFYM", "GITARR", "LEKPLATS", "SMÖRGÅS", "DATOR",
			"PENNA", "SKÅL", "PAPPER", "VÄSKA"}; //* Här är  orden som används och koden som slumpar orden
			
			boolean spela = true; 
			while (spela) { 
				System.out.println("Välkommen till hänga gubbe, du får 10 gissningar på dig.");
				char[]slumpatord = ord[random.nextInt(ord.length)].toCharArray();
				int Gissningar = 10; 
				char[]Spelargissning = new char[slumpatord.length];
				for (int i = 0; i < Spelargissning.length; i++) {
					Spelargissning[i]='_';
				}
				
				int försök = 0;
				boolean gissatord = false; 
				
				while (!gissatord && försök != Gissningar) {
					System.out.println("Gissningar:" + försök);
					printArray(Spelargissning);
					System.out.printf("Du har %d försök kvar \n", Gissningar - försök); //* Information om hur många försök man har kvar
					System.out.println("Skriv en bokstav"); //* Information om vad man ska göra
					försök++;
					char input = scanner.next().toUpperCase().charAt(0); //* Gör så att det inte spelar någon roll om man använder stora eller små bokstäver
					if (input == '_') {
						spela = false;
						gissatord = true;
					} else {
					for (int i = 0; i < slumpatord.length; i++) {
		                if (slumpatord[i]==input) {
		                	Spelargissning[i] = input;
		            }
							}
					if(rättord(Spelargissning)){
						gissatord = true; //* Kollar om man gissade rätt
						System.out.println("Du vann!");
					}
					}
				}
					if(!gissatord)
						System.out.println("Du har slut på försök.");
					
					}
					}
			
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "");
		} System.out.println();
	}
	public static boolean rättord(char[]array) {
		for (int i = 0; i < array.length;i++) {
			if (array[i] =='_') return false;
		}
		return true;
	}
		
	}