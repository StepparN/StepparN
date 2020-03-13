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
		    System.out.println("Du har valt sv�righetsgraden Enkelt. Gissa p� ett tal mellan 0-100, du f�r 12 gissningar p� dig.");
		    int min1 = 0; //* Dessa tv� ints visar vilket spann talet ligger p�
		    int max1 = 100;
		    
		    int randomnummer1 = (int) (Math.random() * ((max1 - min1) + 1) + min1); //* Detta �r slumpgeneratorn som generar ett random tal
		    
		    int gissningar1 = 0;
		   
		    for (int i = 12; i > gissningar1; gissningar1++) { //* Det h�r visar antalet gissningar man f�r p� sig
		    
		    int tal1 = input.nextInt();
		    if (tal1 == randomnummer1) {
		    	System.out.println("Du vann!!!");
		    	gissningar1 ++;
		    }
		    else if (randomnummer1 < tal1) {
		    	System.out.println("Det slumpade talet �r l�gre.");
		    	gissningar1 ++;	
		    }
		    else if (randomnummer1 > tal1) {
		    	System.out.println("Det slumpade talet �r h�gre.");
		    	gissningar1 ++;
		    }
		    }
		    break;
		
		case 2:
			System.out.println("Du har valt sv�righetsgraden Medelsv�rt. Gissa p� ett tal mellan 0-100, du f�r 10 gissningar p� dig.");
			int min2 = 0;
			int max2 = 100;
            
			int randomnummer2 = (int) (Math.random() * ((max2 - min2) + 1) + min2); //* Detta �r slumpgeneratorn som generar ett random tal
		    
			int gissningar2 = 0;
		   
		    for (int i = 10; i > gissningar2; gissningar2++) {
		    
		    int tal1 = input.nextInt();
		    if (tal1 == randomnummer2) {
		    	System.out.println("Du vann!!!");
		    	gissningar2 ++;
		    }
		    else if (randomnummer2 < tal1) { //* Det h�r s�ger till spelaren om talet �r l�gre �n det man gissat p�
		    	System.out.println("Det slumpade talet �r l�gre.");
		    	gissningar2 ++;	
		    }
		    else if (randomnummer2 > tal1) { //* Det h�r s�ger till spelaren om talet �r h�gre �n det man gissat p�
		    	System.out.println("Det slumpade talet �r h�gre.");
		    	gissningar2 ++;
		    }
		    }
			break;
			
		case 3:
			System.out.println("Du har valt sv�righetsgraden Sv�rt. Gissa p� ett tal mellan 0-100, du f�r 8 gissningar p� dig.");
			int min3 = 0;
			int max3 = 100;
            
			int randomnummer3 = (int) (Math.random() * ((max3 - min3) + 1) + min3); //* Detta �r slumpgeneratorn som generar ett random tal
		    
			int gissningar3 = 0;
		   
		    for (int i = 8; i > gissningar3; gissningar3++) {
		    
		    int tal1 = input.nextInt();
		    if (tal1 == randomnummer3) {
		    	System.out.println("Du vann!!!");
		    	gissningar3 ++;
		    }
		    else if (randomnummer3 < tal1) {
		    	System.out.println("Det slumpade talet �r l�gre.");
		    	gissningar3 ++;	
		    }
		    else if (randomnummer3 > tal1) {
		    	System.out.println("Det slumpade talet �r h�gre.");
		    	gissningar3 ++;
		    }
		    }
			break;
			
		
		
		}
  
	}

}
