package v37;

import java.util.Scanner;

public class laxa1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Vad heter du?");

        Scanner namnInput = new Scanner (System.in);
        String namn = namnInput.nextLine();

        System.out.println("Hur gammal �r du?");

        Scanner �lderInput = new Scanner (System.in);
        String �lder = namnInput.nextLine();

        System.out.println("Vad �r din adress?");

        Scanner adressInput = new Scanner (System.in);
        String adress = adressInput.nextLine();

        System.out.println("Vad �r ditt postnummer?");

        Scanner postnummerInput = new Scanner (System.in);
        String postnummer = postnummerInput.nextLine();
        
        System.out.println("Vad �r ditt telefonnummer?");

        Scanner telefonnummerInput = new Scanner (System.in);
        String telefonnummer = adressInput.nextLine();

        System.out.println("Information" + "\n");
        System.out.println("Namn:Kalle" + "\n");
        System.out.println("�lder:17" + "\n");
        System.out.println("Adress:�v�gen 123" + "\n");
        System.out.println("Postnummer:12345" + "\n");
        System.out.println("Telefonnummer:0123456789" + "\n");

    }

}