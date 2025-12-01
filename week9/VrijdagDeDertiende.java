package week9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class VrijdagDeDertiende {
    static void main() {
        String[] maanden = {
                "januari", "februari", "maart", "april", "mei", "juni",
                "juli", "augustus", "september", "oktober", "november", "december"
        };

        for (int jaar = 2020; jaar <= 2029; jaar++) {
            for (int maand = 1; maand <= 12 ; maand++) {
                LocalDate datum = LocalDate.of(jaar, maand, 13);

                if (datum.getDayOfWeek() == DayOfWeek.FRIDAY){
                    System.out.println("13 " + maanden[maand-1] + " " + jaar);
                }
            }
        }
    }
}
