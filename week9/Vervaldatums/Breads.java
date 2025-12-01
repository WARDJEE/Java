package week9.Vervaldatums;

import java.time.LocalDate;

public class Breads {
    private Bread[] breads;
    private int amount;
    private int nextNumber;

    public Breads() {
        this.breads = new Bread[100];
        this.amount = 0;
        this.nextNumber = 1000;
    }

    public void addBread(Variety variety, LocalDate expirationDate){
        breads[amount] = new Bread(nextNumber++, variety, expirationDate);
    }

    public void printBreads(){
        for (int i = 0; i < this.amount; i++) {
            System.out.println(breads[i].toString());
        }
    }

}
