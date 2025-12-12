package week11.Databank;

public class Huisarts {
    private int id;
    private String naam;

    public Huisarts(String naam){
        this.naam = naam;
        this.id = -1;
    }

    public int getId() {
        return this.id;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setId(int id) {
        this.id = id;
    }
}
