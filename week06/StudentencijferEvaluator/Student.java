package week06.StudentencijferEvaluator;

public class Student {
    private String naam;
    private int id;
    private double cijfer;

    public Student(String naam, int id, double cijfer){
        this.naam = naam;
        this.id = id;
        this.cijfer = cijfer;
    }

    public boolean isCorrect(){
        if (this.getNaam().isEmpty()){
            System.out.println();
            System.out.println("Fout! Naam is leeg!");
            return false;
        }

        else if (!this.getNaam().contains(" ")){
            System.out.println();
            System.out.println("Fout! De naam moet minstens 1 spatie bevatten!");
            return false;
        }

        else if(this.getId() < 0){
            System.out.println();
            System.out.println("Fout! Id moet positief zijn!");
            return false;
        }

        else if (this.getCijfer() < 0 || cijfer > 100){
            System.out.println();
            System.out.println("Fout! Cijfer moet tussen 0 en 100 liggen!");
            return false;
        }

        else {return true;}
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public String getNaam(){
        return this.naam;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setCijfer(double cijfer){
        this.cijfer = cijfer;
    }

    public double getCijfer() {
        return cijfer;
    }

    public String getPrestatieCategorie(){
        int cijfer = (int)Math.round(this.cijfer/10)*10;
        return switch(cijfer){
            case 100,90 -> "Excellent";
            case 80,75 ->  "Goed";
            case 70,60,50 -> "voldoende" ;
            default -> "onvoldoende";
        };
    }
}
