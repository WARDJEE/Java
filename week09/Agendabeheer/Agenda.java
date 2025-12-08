package week09.Agendabeheer;

public class Agenda {
    private String naam;
    private Afspraak[] afspraken;
    private int aantal;
    private final int MAX_AANTAL = 10;

    public Agenda(String naam) {
        this.naam = naam;
        this.afspraken = new Afspraak[MAX_AANTAL];
        this.aantal = 0;
    }

    public boolean voegAfspraakToe(Afspraak afspraak){
        if (this.aantal >= this.MAX_AANTAL){
            return false;
        }
        else {
            this.afspraken[this.aantal++] = afspraak;
            return true;
        }
    }

    public Afspraak getAfspraak(int index){
        if (index >= 0 && index <= this.aantal)return this.afspraken[index];
        else return null;
    }

    public int getAantal() {
        return this.aantal;
    }

    public String getNaam() {
        return this.naam;
    }
}
