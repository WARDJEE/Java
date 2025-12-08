package week03;
import java.util.Scanner;
public class Morse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een woord: ");
        String woord = scan.nextLine();
        StringBuilder morseWoord = new StringBuilder("De morsecode is: ");
        int lengte = woord.length();

        for(int x = 0; x !=lengte;x++) {

            char letter = woord.toUpperCase().charAt(x);

            String morse = switch (letter) {
                case 'A' -> "._";
                case 'B' -> "_...";
                case 'C' -> "_._.";
                case 'D' -> "_..";
                case 'E' -> ".";
                case 'F' -> ".._.";
                case 'G' -> "__.";
                case 'H' -> "....";
                case 'I' -> "..";
                case 'J' -> ".___";
                case 'K' -> "_._";
                case 'L' -> "._..";
                case 'M' -> "__";
                case 'N' -> "_.";
                case 'O' -> "___";
                case 'P' -> ".__.";
                case 'Q' -> "__._";
                case 'R' -> "._.";
                case 'S' -> "...";
                case 'T' -> "_";
                case 'U' -> ".._";
                case 'V' -> "..._";
                case 'W' -> ".__";
                case 'X' -> "_.._";
                case 'Y' -> "_.__";
                case 'Z' -> "__..";
                default -> " ";
            };
            morseWoord.append(morse).append(" ");
    }
        System.out.println(morseWoord);
}
}
