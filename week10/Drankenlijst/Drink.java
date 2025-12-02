package week10.Drankenlijst;

public class Drink {
    private String name;
    private double price;
    private boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isAlcoholic() {
        return this.isAlcoholic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public String toString() {
        return this.name + " €" + this.price;
    }
}
