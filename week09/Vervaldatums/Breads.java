package week09.Vervaldatums;

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

    public int addBread(Variety variety, LocalDate expirationDate){
        this.breads[this.amount] = new Bread(this.nextNumber++, variety, expirationDate);
        return breads[amount++].getNumber();
    }

    public void printBreads(){
        for (int i = 0; i < this.amount; i++) {
            System.out.println(breads[i].toString());
        }
    }

    public void printExpired(LocalDate date){
        for (int i = 0; i < this.amount; i++) {
            if(date.isAfter(this.breads[i].getExpirationDate())){
                System.out.println(breads[i].toString());
            }
        }

    }
}
