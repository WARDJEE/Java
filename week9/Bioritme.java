package week9;

import java.time.*;
import java.util.Scanner;

public class Bioritme {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int dag = scan.nextInt();

        System.out.print("Geef je geboortemaand: ");
        int maand = scan.nextInt();

        System.out.print("Geef je geboortejaar: ");
        int jaar = scan.nextInt();

        LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);

        long daysOld = (Duration.between(geboortedatum.atStartOfDay(), LocalDate.now().atStartOfDay())).toDays();

        System.out.println("Je bent vandaag " + daysOld + " dagen oud." );

        double fysical = Math.abs(Math.sin(daysOld / 23.0 * 2 * Math.PI));
        double emotional = Math.abs(Math.sin(daysOld / 28.0 * 2 * Math.PI));
        double intellectual = Math.abs(Math.sin(daysOld / 33.0 * 2 * Math.PI));

        System.out.println("Je bioritmes zijn:");
        System.out.println("- fysiek: " + conditie(fysical));
        System.out.println("- emotioneel: " + conditie(emotional));
        System.out.println("- intellectueel: " + conditie(intellectual));


    }

    public static String conditie(double waarde){
        if (waarde < 0.2) return "kritieke waarde";
        else if (waarde < 0.5) return "ok";
        else if (waarde < 0.8) return "goed";
        else return "topconditie";
    }
}
