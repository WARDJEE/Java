package week02;
import java.util.Scanner;

public class Belasting {
    public static void main(String[] args) {
        double btwPercentage;
        double bedrag;
        String keuze;
        boolean ok = true;

        Scanner scan = new Scanner(System.in);

        while (ok) {

            System.out.print("Geef het BTW percentage: ");
            btwPercentage = scan.nextDouble();

            System.out.print("Geef het bedrag: ");
            bedrag = scan.nextDouble();

            scan.nextLine();

            System.out.print("Is het inclusief of exclusief de BTW? ");
            keuze = (scan.nextLine()).toLowerCase().strip();

            switch (keuze) {
                case "inclusief" -> {
                    double totaal = bedrag / (1 + btwPercentage / 100);
                    System.out.println("Het bedrag zonder BTW is " + totaal);
                    ok = false;
                }
                case "exclusief" -> {
                    double totaal = bedrag * (1 + btwPercentage / 100);
                    System.out.println(("Het bedrag met BTW is " + totaal));
                    ok = false;
                }
                default -> System.out.println("Dit is geen optie!");
            }
        }
    }
}
