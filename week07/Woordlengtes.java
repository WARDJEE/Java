package week07;

import java.util.Scanner;

public class Woordlengtes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hoeveel woorden ga je intikken? ");
        int woorden = scan.nextInt();
        scan.nextLine();

        String[] woordenLijst = new String[woorden];

        for (int i = 0; i < woorden; i++) {
            System.out.print("Woord " + (i+1) + ": ");
            woordenLijst[i] = scan.nextLine();
        }

        String langsteWoord = woordenLijst[0];
        String kortsteWoord = woordenLijst[0];


        for (int i = 0; i < woorden; i++) {
            if (woordenLijst[i].length() > langsteWoord.length()){
                langsteWoord = woordenLijst[i];
            }
            else {
                kortsteWoord = woordenLijst[i];
            }
        }
        System.out.println("Kortste woord: " + kortsteWoord);
        System.out.println("Langste woord: " + langsteWoord);

    }
}
