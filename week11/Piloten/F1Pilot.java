package week11.Piloten;

import java.util.HashSet;
import java.util.Set;

public class F1Pilot {
    private String nationality;
    private String name;
    private int numberOfTitles;
    private Set<Integer> seasons;

    public F1Pilot(String nat, String name, int numberOfTitles) {
        this.nationality = nat;
        this.name = name;
        this.numberOfTitles = numberOfTitles;
        this.seasons = new HashSet<>();
    }

    public void addSeason(int year){
        this.seasons.add(year);
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfTitles() {
        return this.numberOfTitles;
    }

    public String toString(){
        return String.format("%-20s %-20s %-3s %s", this.nationality, this.name, this.numberOfTitles, this.seasons);
    }
}
