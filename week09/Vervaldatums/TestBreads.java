package week09.Vervaldatums;

import java.time.LocalDate;
import java.util.Random;

public class TestBreads {
    static void main() {
        Breads breads = new Breads();
        Random random = new Random();
        LocalDate vandaag = LocalDate.now();

        for (int i = 0; i < 30; i++) {
            int dagen = random.nextInt(3);
            breads.addBread(random.nextBoolean() ? Variety.WHITE : Variety.BROWN, vandaag.plusDays(dagen));
        }


        System.out.println("Alle broden:");
        System.out.println();
        breads.printBreads();

        System.out.println();
        System.out.println("Broden die morgen vervallen:");
        System.out.println();
        breads.printExpired(vandaag.plusDays(1));

    }
}
