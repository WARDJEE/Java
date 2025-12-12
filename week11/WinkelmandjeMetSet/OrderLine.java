package week11.WinkelmandjeMetSet;

import java.util.Objects;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return this.item;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getPrice(){
        return this.item.getPrice() * this.amount;
    }

    public void incrementAmount(){
        this.amount++;
    }

    public String toString(){
        return String.format("%-50s %d %8.2f EUR", this.item.toString(), this.amount, this.getPrice());
    }


    public boolean equals(OrderLine orderLine) {
        if (orderLine == null) return false;
        return Objects.equals(item, orderLine.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }
}
