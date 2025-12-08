package week03;
import java.util.Scanner;
public class Wachtwoorden {
    static boolean isCorrect(String wachtwoord){
        int lengte;
        int hoofdletter;
        int kleineLetter;
        int cijfer;
        int teken;

        Scanner scan = new Scanner(System.in);
        do {
            lengte = wachtwoord.length();
            hoofdletter = 0;
            kleineLetter = 0;
            cijfer = 0;
            teken = 0;

            for (int i = 0; i < lengte; i++) {
                if ((wachtwoord.charAt(i) > 32 && wachtwoord.charAt(i) < 48) || (wachtwoord.charAt(i) > 57 && wachtwoord.charAt(i) < 65)
                        || (wachtwoord.charAt(i) > 90 && wachtwoord.charAt(i) < 97) || (wachtwoord.charAt(i) > 122 && wachtwoord.charAt(i) <= 127)) {
                    teken++;
                } else if (wachtwoord.charAt(i) > 47 && wachtwoord.charAt(i) < 58) {
                    cijfer++;
                } else if ((wachtwoord.charAt(i) > 64 && wachtwoord.charAt(i) < 91)) {
                    hoofdletter++;
                } else if ((wachtwoord.charAt(i) > 96 && wachtwoord.charAt(i) < 123)) {
                    kleineLetter++;
                }
            }
            if (lengte < 8 || teken == 0 || cijfer == 0 || hoofdletter == 0 || kleineLetter == 0) {
                System.out.println("Je nieuwe wachtwoord is niet goed!");
                if (lengte < 8) {
                    System.out.println("Het moet minstens 8 karakters lang zijn.");
                } else if (teken == 0) {
                    System.out.println("Het moet minstens 1 leesteken bevatten!");
                } else if (cijfer == 0) {
                    System.out.println("Het moet minstens 1 cijfer bevatten!");
                } else if (hoofdletter == 0) {
                    System.out.println("Het moet minstens 1 hoofdletter bevatten!");
                } else {
                    System.out.println("Het moet minstens 1 kleine letter bevatten!");
                }

                System.out.print("Geef een nieuw wachtwoord: ");
                wachtwoord = scan.nextLine();

            }
            } while (lengte < 8 || teken == 0 || cijfer == 0 || hoofdletter == 0 || kleineLetter == 0) ;

        return true;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een nieuw wachtwoord: ");
        String wachtwoord = scan.nextLine();

        if (isCorrect(wachtwoord)){
            System.out.println("Je nieuwe wachtwoord is goedgekeurd!");
        }
    }
}
