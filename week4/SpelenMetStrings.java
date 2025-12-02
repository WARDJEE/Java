package week4;
import java.util.Scanner;
public class SpelenMetStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een zin: ");
        String zin = scan.nextLine();

        System.out.println("Er zijn " + zin.length() + " tekens in deze zin.");
        System.out.println(zin.toUpperCase());
        System.out.println(zin.toLowerCase());
        System.out.println("Het eertse karakter is een '" + zin.charAt(0) + "'.");
        System.out.println("Het laatste karakter is een '" + zin.charAt(zin.length()-1) + "'.");

        String zonderSpaties = zin.replace(" ", "");
        System.out.println("Er zijn " + zonderSpaties.length() + " karakters als je de spaties niet meetelt.");

        System.out.println(zin.replace("e", "_"));
        System.out.println(zonderSpaties);

        String zonderKlinkers = zin.replaceAll("[aeuoiAEUOI]", "");

        System.out.println(zonderKlinkers);
    }
}
