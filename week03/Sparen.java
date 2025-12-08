package week03;
import java.util.Scanner;
public class Sparen {
    public static void main(String[] args) {
        double bedrag;
        double percentage;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef het bedrag: ");
        bedrag = scan.nextDouble();

        System.out.print("Geef het percentage: ");
        percentage = scan.nextDouble();

        for (int i = 1; i < 11; i++){
            double nieuwBedrag = bedrag * Math.pow(1 + (percentage/100), i);
            System.out.printf("Bedrag na %d jaar: %.2f",i, nieuwBedrag);
            System.out.println();
        }

        scan.close();
    }
}
