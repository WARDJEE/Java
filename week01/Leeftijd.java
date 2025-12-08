package week01;
import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wat is je naam? ");
        String naam = scan.nextLine();

        System.out.print("Beste " + naam + ", geef je geboortejaar: ");
        int geboortejaar = scan.nextInt();
        scan.close();
        int jaar =  LocalDate.now().getYear();
        int leeftijd = jaar - geboortejaar;
        System.out.println("Als alles goed loopt, wordt je dit jaar " + leeftijd);
    }
}
