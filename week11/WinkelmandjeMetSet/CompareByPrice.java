package week11.WinkelmandjeMetSet;

import java.util.Comparator;

public class CompareByPrice implements Comparator<OrderLine> {
    public int compare(OrderLine o1, OrderLine o2){
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
