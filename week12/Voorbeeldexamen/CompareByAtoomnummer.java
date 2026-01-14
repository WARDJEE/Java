package week12.Voorbeeldexamen;

import java.util.Comparator;

public class CompareByAtoomnummer implements Comparator<Atoom> {
    public int compare(Atoom a1, Atoom a2){
        return a1.getAtoomnummer() - a2.getAtoomnummer();
    }
}


