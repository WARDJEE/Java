package week9;

import java.time.*;

public class Wapenstilstand {
    static void main() {
        int[] jaren = new int[9];
        int datums = 0;

        LocalDate wapenstilstand = LocalDate.of(1918, 11, 11);

        String dag = switch (wapenstilstand.getDayOfWeek()){
            case MONDAY -> "maandag";
            case TUESDAY -> "dinsdag";
            case WEDNESDAY -> "woensdag";
            case THURSDAY -> "donderdag";
            case FRIDAY -> "vrijdag";
            case SATURDAY -> "zaterdag";
            case SUNDAY -> "zondag";
        };

        System.out.println("Wapenstilstand (11 november 1918) viel op een " + dag);
        System.out.println();

        for (int i = 1980; i < 2041; i++) {
            LocalDate datum = LocalDate.of(i, 11, 11);
            if (datum.getDayOfWeek() == DayOfWeek.SUNDAY){
                jaren[datums++] = i;
            }
        }

        for (int jaar : jaren){
            System.out.print(jaar + " ");
        }

    }
}
