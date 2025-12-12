package week11.Databank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Patiënten {
    private static int volgendeId = 0;
    private Map<Integer, Patiënt> patiënten;

    public Patiënten(){
        this.patiënten = new HashMap<>();
    }

    public void insert(Patiënt patiënt){
        patiënt.setId(volgendeId);
        this.patiënten.put(volgendeId++, patiënt);
    }

    public boolean delete(int id){
        if (this.patiënten.containsKey(id)){
            this.patiënten.remove(id);
            return true;
        }

        return false;
    }

    public Patiënt findById(int id){
        return this.patiënten.get(id);
    }

    public Set<Patiënt> findByHuisarts(int huisartId){
        Set<Patiënt> patiënten = new HashSet<>();
        for (Patiënt patiënt : this.patiënten.values()) {
            if (patiënt.getHuisartsId() == huisartId){
                patiënten.add(patiënt);
            }
        }

        return patiënten;
    }

    public Map<Integer, Patiënt> getAll(){
        return this.patiënten;
    }
}
