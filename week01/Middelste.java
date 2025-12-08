import java.util.Scanner;
public class Middelste {
    public static void main(String[]args){
        int getal1;
        int getal2;
        int getal3;

        Scanner scan  = new Scanner(System.in);


        System.out.print("Geef het eerste getal (tussen 1 en 100): ");
        getal1 = scan.nextInt();

        while (getal1 < 0 || getal1 > 100) {
                System.out.println("Het getal moet tussen 1 en 100 liggen!");
                System.out.print("Geef het eerste getal (tussen 1 en 100): ");
                getal1 = scan.nextInt();}

        System.out.print("Geef het tweede getal (tussen 1 en 100): ");
        getal2 = scan.nextInt();

        while (getal2 < 0 || getal2 > 100) {
            System.out.println("Het getal moet tussen 1 en 100 liggen!");
            System.out.print("Geef het tweede getal (tussen 1 en 100): ");
            getal2 = scan.nextInt();}

        System.out.print("Geef het derde getal (tussen 1 en 100): ");
        getal3 = scan.nextInt();

        while (getal3 < 0 || getal3 > 100) {
            System.out.println("Het getal moet tussen 1 en 100 liggen!");
            System.out.print("Geef het derde getal (tussen 1 en 100): ");
            getal3 = scan.nextInt();}

        scan.close();

        if(getal1 > getal2){
            if (getal3 > getal1){
                System.out.println("Het middelste getal is " + getal1);
            }
            else if(getal2 > getal3) {System.out.println("Het middelste getal is " + getal2);}

            else {System.out.println("Het middelste getal is " + getal3);}
        }
        else {
            if (getal3 < getal1){
            System.out.println("Het middelste getal is " + getal1);
            }
            else if(getal2 < getal3) {System.out.println("Het middelste getal is " + getal2);}

            else {System.out.println("Het middelste getal is " + getal3);}
        }

    }
}