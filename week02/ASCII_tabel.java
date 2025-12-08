package week02;
import java.util.Scanner;
public class ASCII_tabel {
    public static void main(String[] args) {
        int perRij = 6;
        int rij = 0;
        int beginwaarde;
        int einwaarde;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef beginwaarde: ");
        beginwaarde = scan.nextInt();

        System.out.print("Geef eindwaarde: ");
        einwaarde = scan.nextInt();

        scan.close();
        while (beginwaarde <= einwaarde) {
            while (rij != perRij) {
                System.out.print((char) beginwaarde + "(" + beginwaarde + ") ");
                rij++;
                beginwaarde++;
            }
            rij = 0;
            System.out.print("\n");
        }
    }
}
