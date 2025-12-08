package week02;
import java.util.Scanner;
public class Verbruik {
    public static void main(String[] args) {
        int vorigeKilometerStand;
        int huidigeKilometerStand;
        double getankteLiter;
        int afstand;
        double verbruik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef de vorige kilometerstand: ");
        vorigeKilometerStand = scan.nextInt();

        System.out.print("Geef de huidige kilometerstand: ");
        huidigeKilometerStand = scan.nextInt();

        System.out.print("Geef het aantal getankte liters: ");
        getankteLiter = scan.nextDouble();

        afstand = huidigeKilometerStand - vorigeKilometerStand;
        verbruik = 100 * getankteLiter / afstand;
        System.out.printf("Verbruik voor %dkm is %.2f liter/100km.", afstand, verbruik);
    }
}
