package week01;
import java.util.Scanner;
public class Begroeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wat is je naam? ");
        String naam = scan.nextLine();
        scan.close();
        System.out.println("Welkom " + naam + "!");
    }
}