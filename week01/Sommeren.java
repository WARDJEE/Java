import java.util.Scanner;
public class Sommeren {
    public static void main(String[] args){

        String keuze = "j";
        Scanner scan = new Scanner(System.in);

while (keuze.equals("j")) {
    double getal = 0;
    double som = 0;
    int aantal = -1;
    double gemiddelde = 0;
    System.out.print("Geef een getal: ");
    getal = scan.nextDouble();
    som += getal;
    aantal++;

    while (getal != 0) {
        System.out.print("Geef een getal: ");
        getal = scan.nextDouble();
        som += getal;
        aantal++;
    }

    System.out.println("De som van de getallen is " + som);
    System.out.println("Het aantal ingegeven getallen is " + aantal);
    gemiddelde = som / aantal;
    System.out.println("Het gemiddelde is " + gemiddelde);
    scan.nextLine();
    System.out.print("Wilt u nog eens? (j/n): ");
    keuze = scan.nextLine();
}
        System.out.println("Tot de volgende keer.");
scan.close();

    }
}
