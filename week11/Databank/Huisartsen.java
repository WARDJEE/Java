package week11.Databank;

import java.util.HashMap;
import java.util.Map;

public class Huisartsen {
    private static int volgendeId = 0;
    private Map<Integer, Huisarts> huisartsen;

    public Huisartsen(){
        this.huisartsen = new HashMap<>();
    }

    public void insert(Huisarts arts){
        arts.setId(volgendeId);
        this.huisartsen.put(volgendeId++, arts);
    }

    public boolean delete(int id){
        if (this.huisartsen.containsKey(id)){
            this.huisartsen.remove(id);
            return true;
        }

        return false;
    }

    public Huisarts findById(int id){
        return this.huisartsen.get(id);

    }
}
