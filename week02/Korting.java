package week02;
import java.util.Scanner;
public class Korting {
    public static void main(String[]args){
        double bedrag;
        int artikelen;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef het bedrag: ");
        bedrag = scan.nextDouble();

        System.out.print("Geef het aantal artikelen: ");
        artikelen = scan.nextInt();

        scan.close();

        if((bedrag > 150 && artikelen >= 10 && artikelen <= 100) || artikelen > 100){
            System.out.println("De klant krijgt WEL KORTING.");
        }
        else{
            System.out.println("De klant krijgt GEEN KORTING.");
        }
    }
}
