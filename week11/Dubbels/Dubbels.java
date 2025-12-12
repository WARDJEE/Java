package week11.Dubbels;

import java.util.*;

public class Dubbels {
    private List<String> data;

    public Dubbels(List<String> data) {
        this.data = new ArrayList<>(data);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.data.size(); i++) {
            sb.append(String.format("%-13s", this.data.get(i)));
            if ((i + 1) %4 == 0){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public void verwijderDubbels(){
        Set<String> zonderDubbels = new HashSet<>(this.data);

        this.data.clear();
        this.data.addAll(zonderDubbels);

        Collections.sort(this.data);
    }
}
