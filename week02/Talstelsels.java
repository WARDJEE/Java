package week02;

import java.util.Scanner;

public class Talstelsels {
    public static String naarTalstelsel(int getal, int talstelsel) {
        StringBuilder sb = new StringBuilder();

        while (getal > 0){
            char karakter;
            int rest = getal%talstelsel;
            if (rest < 10){
                karakter = (char) ('0' + rest);
            }
            else{
                karakter = (char) ('A' + (rest - 10));
            }

            sb.insert(0, karakter);
            getal = getal/talstelsel;
        }
        return "[" + sb + "]"+talstelsel;
    }

    public static String naarDecimaal(int getal, int talstelsel) {
        return "hallo";

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int keuze;
        do {
            System.out.print("""
                1 - Van decimaal naar talstelsel
                2 - Van talstelsel naar decimaal
                """);

            keuze = scan.nextInt();

        }while(keuze < 1 || keuze > 2);

        System.out.print("Geef een getal: ");
        int getal = scan.nextInt();

        System.out.print("Geef het talstelsel: ");
        int talstelsel = scan.nextInt();

        if (keuze == 1){
            System.out.println(naarTalstelsel(getal, talstelsel));
        }
        else {

        }
    }
}
