package week11.Databank;

public class Patiënt {
    private int id;
    private String naam;
    private int huisartId;

    public Patiënt(String naam){
        this.naam = naam;
        this.id = -1;
        this.huisartId = -1;
    }

    public int getId() {
        return this.id;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getHuisartsId() {
        return this.huisartId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHuisartsId(int huisartId) {
        this.huisartId = huisartId;
    }
}
