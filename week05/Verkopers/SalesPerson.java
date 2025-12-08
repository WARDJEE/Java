package week05.Verkopers;

public class SalesPerson {
    final String name;
    final double revenue;

    public SalesPerson(String name, double revenue){
        this.name = name;
        this.revenue = revenue;
    }

    public boolean generatesMoreRevenueThan(SalesPerson other){
        return this.revenue > other.revenue;
    }

    public String toString(){
        return this.name+" met een omzet van €"+this.revenue;

    }
}
