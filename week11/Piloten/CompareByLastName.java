package week11.Piloten;

import java.util.Comparator;

public class CompareByLastName implements Comparator<F1Pilot> {
    public int compare(F1Pilot p1, F1Pilot p2){
        String naamP1 = p1.getName().substring(p1.getName().indexOf(" ") + 1);
        String naamP2 = p2.getName().substring(p2.getName().indexOf(" ") + 1);
        return naamP1.compareTo(naamP2);
    }
}
