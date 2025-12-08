package week04;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
public class Statistiek {
    public static void main(String[] args) {
        IntSummaryStatistics stat = new IntSummaryStatistics();
        Scanner scan = new Scanner(System.in);
        int getal;
        int aantal = 0;
        do {
            System.out.print("Geef een getal (-1 = stop): ");
            getal = scan.nextInt();
            if (getal != -1){
                stat.accept(getal);
                aantal++;
            }
        }while (getal != -1);
        System.out.println("Je gaf " + aantal + " keer een getal in.");
        System.out.println("Het gemiddelde is " + stat.getAverage());
    }
}
