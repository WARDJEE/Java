package week9.Vervaldatums;

import java.time.LocalDate;

public class Bread{
    private int number;
    private Variety variety;

    LocalDate expirationDate;

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
        return this.number + " " + this.variety.toString() + " " + this.expirationDate;
    }
}
