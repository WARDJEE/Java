package week11.WinkelmandjeMetSet;

import java.util.*;

public class ShoppingBasket{
    private Set<OrderLine> orderlines;

    public ShoppingBasket() {
        this.orderlines = new HashSet<>();
    }

    public void addItem(Item item){
        for (OrderLine line : orderlines) {
            if (line.getItem() == item) {
                line.incrementAmount();
                return;
            }
        }
        orderlines.add(new OrderLine(item, 1));
    }

    public void removeItem(Item item){
        Iterator<OrderLine> iterator = this.orderlines.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getItem() == item) {
                iterator.remove();
            }
        }
    }

    public String getPrice(){
        double totaal = 0;
        for (OrderLine orderLine : this.orderlines){
            totaal += orderLine.getPrice();
        }
        return String.format("%.2f EUR", totaal);
    }

    public List<OrderLine> itemsSortedById(){
        List<OrderLine> orderLines = new ArrayList<>(this.orderlines);
        Collections.sort(orderLines, new CompareById());
        return orderLines;
    }

    public List<OrderLine> itemsSortedByName(){
        List<OrderLine> orderLines = new ArrayList<>(this.orderlines);
        Collections.sort(orderLines, new CompareByName());
        return orderLines;

    }

    public List<OrderLine> itemsSortedByPrice(){
        List<OrderLine> orderLines = new ArrayList<>(this.orderlines);
        Collections.sort(orderLines, new CompareByPrice());
        return orderLines;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("nummer  beschrijving                            aantal  totaal \n");
        for (OrderLine orderLine : this.orderlines){
            sb.append(orderLine).append("\n");
        }
        return sb.toString();
    }
}
