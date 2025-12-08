import java.util.Scanner;
public class Kassa {
    public static void main(String[]args){
        double aantal;
        double groteKinderen;
        double volwassenen;
        double senioren;
        double prijs;
        double grootouderenkorting;


        Scanner scan = new Scanner(System.in);

        System.out.print("Aantal kinderen kleiner dan 1m: ");
        scan.nextInt();

        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        groteKinderen = scan.nextInt();

        System.out.print("Aantal volwassenen en kinderen groter dan 1,40m: ");
        volwassenen = scan.nextInt();

        System.out.print("Aantal senioren (55+): ");
        senioren = scan.nextInt();

        scan.close();

        System.out.println("*******************************");
        System.out.println("*   Welkom in het pretpark!   *");
        System.out.println("*******************************");


        aantal = groteKinderen + volwassenen + senioren;


        if(aantal >= 10){
            prijs = (26 * groteKinderen) + (31 * volwassenen) + (15.5 * senioren);
            System.out.printf("* Prijs: €%.2f", prijs);
            prijs -= prijs * 0.1;
            System.out.println("\n* Groepskorting: 10%");
            System.out.printf("* Totaal: €%.2f", prijs);

        }

        else if ((senioren == 2) && (groteKinderen >= 1)){
            prijs = (26 * groteKinderen) + (31 * volwassenen) + (15.5 * senioren);
            System.out.printf("* Totaal: €%.2f", prijs);
            grootouderenkorting = 13 * groteKinderen;
            System.out.printf("\n* Grootouderkorting: -€%.2f", grootouderenkorting);
            System.out.printf("\n* Totaal: €%.2f", (prijs - grootouderenkorting));

        }
        else {
            prijs = (26 * groteKinderen) + (31 * volwassenen) + (15.5 * senioren);
            System.out.printf("* Totaal: €%.2f", prijs);

        }
        System.out.println("\n*******************************");

    }
}
