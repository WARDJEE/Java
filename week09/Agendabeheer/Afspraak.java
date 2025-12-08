package week09.Agendabeheer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Afspraak {
    private AfspraakType type;
    private LocalDateTime datum;
    private static int totaalAantalAfspraken;

    public Afspraak(AfspraakType type, LocalDateTime datum) {
        this.type = type;
        this.datum = datum;
        totaalAantalAfspraken++;
    }

    public AfspraakType getType() {
        return this.type;
    }

    public LocalDateTime getDatum() {
        return this.datum;
    }

    public static int getTotaalAantalAfspraken() {
        return totaalAantalAfspraken;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM. yyyy HH:mm", new Locale("nl"));
        return this.type.toString() + ": " + this.datum.format(formatter);
    }
}
