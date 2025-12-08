package week07.Oxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board bord = new Board();
        Scanner scanner = new Scanner(System.in);
        char huidigeSpeler = 'X';
        boolean gameOver = false;

        System.out.println("Welkom bij het spel OXO!");

        while (!gameOver) {
            bord.printBoard();
            System.out.println("Speler " + huidigeSpeler + " is aan zet.");
            System.out.print("Geef de rij: ");
            int rij = scanner.nextInt();
            System.out.print("Geef de kolom: ");
            int kolom = scanner.nextInt();

            // Probeer de zet
            if (bord.zetSpeler(rij, kolom, huidigeSpeler)) {
                if (bord.isWin(huidigeSpeler)) {
                    bord.printBoard();
                    System.out.println("Speler " + huidigeSpeler + " heeft gewonnen!");
                    gameOver = true;
                } else if (bord.isVol()) {
                    bord.printBoard();
                    System.out.println("Het spel eindigt in een gelijkspel!");
                    gameOver = true;
                } else {
                    // Wissel speler
                    huidigeSpeler = (huidigeSpeler == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Ongeldige zet, probeer opnieuw.");
            }
        }
    }
}
