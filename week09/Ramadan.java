package week09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ramadan {
    static void main() {
        LocalDate ramadan;

        double dagenInEenJaar = 29.53059 * 12;
        double dagen = 0;

        System.out.println("Dit programma schat dat de Ramadan op volgende datums zal starten:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (int jaar = 2023; jaar <= 2025; jaar++) {
            dagen += dagenInEenJaar;
            ramadan = LocalDate.of(2022, 4, 2).plusDays((long)dagen);
            System.out.println(ramadan.format(formatter));
        }
    }
}
