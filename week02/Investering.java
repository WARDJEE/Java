package week02;
import java.util.Scanner;
public class Investering {
    public static void main(String[] args) {
        double rentePercentage;
        int jaren;
        double startBedrag;
        double eindSaldo;
        char valuta;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hoeveel wil je investeren? ");
        startBedrag = scan.nextDouble();

        System.out.print("Welke valuta gebruikt u? ");
        valuta = scan.next().charAt(0);

        System.out.print("Wat is het jaarlijkse rentepercentage (in %)? ");
        rentePercentage = scan.nextDouble();

        System.out.print("Hoeveel jaar wilt u investeren? ");
        jaren = scan.nextInt();

        scan.close();

        eindSaldo = Math.pow((1 + rentePercentage / 100), jaren);

        System.out.printf("Na %d jaar hebt u %c%.2f.", jaren, valuta, (startBedrag * eindSaldo));

    }
}
