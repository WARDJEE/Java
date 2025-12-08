import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int eersteGetal;
        int tweedeGetal;
        int derdeGetal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Eerste getal: ");
        eersteGetal = scan.nextInt();

        System.out.print("Tweede getal: ");
        tweedeGetal = scan.nextInt();

        System.out.print("Derde getal");
        derdeGetal = scan.nextInt();

        scan.close();
        int totaal = eersteGetal * tweedeGetal * derdeGetal;
        System.out.println("Het product is: " + totaal );


    }
}
