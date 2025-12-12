package week11.WinkelmandjeMetSet;

import java.util.Comparator;

public class CompareById implements Comparator<OrderLine> {
    public int compare(OrderLine o1, OrderLine o2){
        return o1.getItem().getId().compareTo(o2.getItem().getId());
    }
}
