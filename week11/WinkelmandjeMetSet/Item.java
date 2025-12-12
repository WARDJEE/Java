package week11.WinkelmandjeMetSet;

import java.util.Objects;

public abstract class Item {
    private String id;
    private double price;

    public Item(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean equals(Item item) {
        if (item == null) return false;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
