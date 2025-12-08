package week07.Kaartspelletjes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] suits = { "Harten", "Schoppen", "Ruiten", "Klaveren" };
        String[] values = {
                "Aas", "Twee", "Drie", "Vier", "Vijf",
                "Zes", "Zeven", "Acht", "Negen", "Tien",
                "Boer", "Dame", "Heer"
        };

        Scanner scan = new Scanner(System.in);

        System.out.print("Hoeveel kaarten wens je: ");
        int kaarten  = scan.nextInt();

        Card[] cards = Card.createCards(kaarten, suits, values);

        Card.showCards(cards);

    }
}
