import java.util.Scanner;
public class StartToRun {
    public static void main(String[] args){
        System.out.println("Deze applicatie berekent je ideale trainingshartslag " +
                "aan de hand van de formule van Karvonen.");

        int leefijd;
        int hartslagRust;
        int keuze;
        int intensiteit = 0;
        int hartslagIdeaal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef je leeftijd: ");
        leefijd = scan.nextInt();

        System.out.print("Geef je hartslag in rust: ");
        hartslagRust = scan.nextInt();

        System.out.print("Welk soort training wil je doen? \n" +
                "1 : recuperatie training \n" +
                "2 : LSD training (Long Slow Distance) \n" +
                "3 : extensieve uithouding \n" +
                "4 : intensieve uithouding \n" +
                "5 : tempo-interval \n" +
                "6 : intensieve interval \n" +
                "Maak je keuze: ");
        keuze = scan.nextInt();

        scan.close();

        if(keuze == 1){
            intensiteit = 65;
        }
        else if(keuze == 2){
            intensiteit = 70;
        }
        else if(keuze == 3){
            intensiteit = 75;
        }
        else if(keuze == 4){
            intensiteit = 85;
        }
        else if(keuze == 5){
            intensiteit = 90;
        }
        else if(keuze == 6){
            intensiteit = 95;
        }
        else{
            System.out.println("Dit is geen optie.");

        }

        int hartslagMax = 220 - leefijd;

        System.out.println("Je maximale hartslag is " + hartslagMax + ".");

        hartslagIdeaal = hartslagRust + (hartslagMax - hartslagRust) * intensiteit/100;
        System.out.println("Je traint best met een hartslag rond de " + hartslagIdeaal + ".");
    }
}
