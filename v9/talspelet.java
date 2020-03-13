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
		    System.out.println("Du har valt svårighetsgraden Enkelt. Gissa på ett tal mellan 0-100, du får 12 gissningar på dig.");
		    int min1 = 0; //* Dessa två ints visar vilket spann talet ligger på
		    int max1 = 100;
		    
		    int randomnummer1 = (int) (Math.random() * ((max1 - min1) + 1) + min1); //* Detta är slumpgeneratorn som generar ett random tal
		    
		    int gissningar1 = 0;
		   
		    for (int i = 12; i > gissningar1; gissningar1++) { //* Det här visar antalet gissningar man får på sig
		    
		    int tal1 = input.nextInt();
		    if (tal1 == randomnummer1) {
		    	System.out.println("Du vann!!!");
		    	gissningar1 ++;
		    }
		    else if (randomnummer1 < tal1) {
		    	System.out.println("Det slumpade talet är lägre.");
		    	gissningar1 ++;	
		    }
		    else if (randomnummer1 > tal1) {
		    	System.out.println("Det slumpade talet är högre.");
		    	gissningar1 ++;
		    }
		    }
		    break;
		
		case 2:
			System.out.println("Du har valt svårighetsgraden Medelsvårt. Gissa på ett tal mellan 0-100, du får 10 gissningar på dig.");
			int min2 = 0;
			int max2 = 100;
            
			int randomnummer2 = (int) (Math.random() * ((max2 - min2) + 1) + min2); //* Detta är slumpgeneratorn som generar ett random tal
		    
			int gissningar2 = 0;
		   
		    for (int i = 10; i > gissningar2; gissningar2++) {
		    
		    int tal1 = input.nextInt();
		    if (tal1 == randomnummer2) {
		    	System.out.println("Du vann!!!");
		    	gissningar2 ++;
		    }
		    else if (randomnummer2 < tal1) { //* Det här säger till spelaren om talet är lägre än det man gissat på
		    	System.out.println("Det slumpade talet är lägre.");
		    	gissningar2 ++;	
		    }
		    else if (randomnummer2 > tal1) { //* Det här säger till spelaren om talet är högre än det man gissat på
		    	System.out.println("Det slumpade talet är högre.");
		    	gissningar2 ++;
		    }
		    }
			break;
			
		case 3:
			System.out.println("Du har valt svårighetsgraden Svårt. Gissa på ett tal mellan 0-100, du får 8 gissningar på dig.");
			int min3 = 0;
			int max3 = 100;
            
			int randomnummer3 = (int) (Math.random() * ((max3 - min3) + 1) + min3); //* Detta är slumpgeneratorn som generar ett random tal
		    
			int gissningar3 = 0;
		   
		    for (int i = 8; i > gissningar3; gissningar3++) {
		    
		    int tal1 = input.nextInt();
		    if (tal1 == randomnummer3) {
		    	System.out.println("Du vann!!!");
		    	gissningar3 ++;
		    }
		    else if (randomnummer3 < tal1) {
		    	System.out.println("Det slumpade talet är lägre.");
		    	gissningar3 ++;	
		    }
		    else if (randomnummer3 > tal1) {
		    	System.out.println("Det slumpade talet är högre.");
		    	gissningar3 ++;
		    }
		    }
			break;
			
		
		
		}
  
	}

}
