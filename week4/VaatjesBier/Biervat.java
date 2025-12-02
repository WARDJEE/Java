package week4.VaatjesBier;

public class Biervat {
    private double capaciteit;
    public double getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(double capaciteit){
        this.capaciteit = capaciteit;
    }

    private double inhoud;
    public double getInhoud() {
        return inhoud;
    }

    public void setInhoud(double inhoud){
        this.inhoud = inhoud;
    }

    public void vullVolledig() {
        this.inhoud = this.capaciteit;
    }

    public boolean isVol(){
        return this.inhoud == this.capaciteit;
    }

    public void tap(double liter){
        this.inhoud -= liter;
    }

    public double percentageGevuld(){
        return 100*this.inhoud/this.capaciteit;
    }
}
