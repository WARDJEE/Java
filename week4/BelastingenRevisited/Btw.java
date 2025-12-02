package week4.BelastingenRevisited;

public class Btw {
    private int percentage;

    public void setPercentage(int percentage){
        this.percentage = percentage;
    }

    public double voegBtwBij(double bedrag){
        return bedrag + (bedrag*this.percentage/100);
    }

    public double neemBtwWeg(double bedrag){
        return bedrag / (1 + (double)this.percentage / 100);
    }


}
