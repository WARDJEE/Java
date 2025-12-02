package week9.Vervaldatums;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bread{
    private int number;
    private Variety variety;
    private LocalDate expirationDate;

    public Bread(int number, Variety variety, LocalDate expirationDate) {
        this.number = number;
        this.variety = variety;
        this.expirationDate = expirationDate;
    }

    public int getNumber() {
        return this.number;
    }

    public Variety getVariety() {
        return this.variety;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.number + " " + this.variety.toString() + " brood " + this.expirationDate.format(formatter);
    }
}
