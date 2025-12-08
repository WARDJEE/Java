package week03;
import java.util.Scanner;
public class Validatie {
    static int valideren(int getal){
        Scanner scan = new Scanner(System.in);

        while (getal < 0 || getal > 100 || ((getal > 50) && (getal % 2 != 0))){
            if(getal < 0){
                System.out.print("Getal mag niet negatief zijn, geef een nieuw getal: ");
                getal = scan.nextInt();
            } else if (getal > 100) {
                System.out.print("Getal is groter dan 100, geef een nieuw getal: ");
                getal = scan.nextInt();
            }else {
                System.out.print("Getal is groter dan 50 maar niet deelbaar door 2, geef een nieuw getal: ");
                getal = scan.nextInt();
            }
        }
        return getal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totaal = 0;
        final int AANTAL = 5;
        for (int i = 1; i < 6; i++) {
            System.out.printf("Geef %de getal: ", i);
            int getal = scan.nextInt();
            totaal += valideren(getal);
        }
        double gemiddelde = (double) totaal / AANTAL;
        System.out.println("Het gemiddelde van deze getallen is: " + gemiddelde);
    }
}
