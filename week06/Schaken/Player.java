package week06.Schaken;

import java.util.Random;

public class Player {
    private String name;
    private int birthYear;
    private double winRatio;
    private boolean retired;
    private final int YEAR = 2025;
    static Random random = new Random();


    private void checkName(String name){
        if (name.isEmpty()){
            System.out.println("Naam mag niet leeg zijn.");
            this.name = "ONBEKEND";
        }
        else {this.name = name;}

    }
    private void checkBirthYear(int birthYear){
        if (birthYear > this.YEAR){
            System.out.println("Jaar kan niet in de toekomst liggen.");
            this.birthYear = 1;
        }
        if (this.YEAR - birthYear > 120){
            System.out.println("Je kan niet ouder zijn dan 120 jaar.");
            this.birthYear = 1;
        }
        else{this.birthYear = birthYear;}
    }

    private void checkWinRatio(double winRatio){
        if (winRatio < 0 || winRatio > 1){
            System.out.println("Winratio moet tussen 0 en 1 liggen.");
            this.winRatio = 0.5;
        }
        else{this.winRatio = winRatio;}
    }


    public Player(String name, int birthYear, double winRatio, boolean retired){
        checkName(name);

        checkBirthYear(birthYear);

        checkWinRatio(winRatio);

        this.retired = retired;
    }

    public void setName(String name){
        checkName(name);
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int birthYear){
        checkBirthYear(birthYear);
    }

    public int getAge(){
        return this.birthYear;
    }

    public void setWinRatio(double winRatio){
        checkWinRatio(winRatio);
    }

    public double getWinRatio(){
        return this.winRatio;
    }

    public void setRetired(boolean retired){
        this.retired = retired;
    }

    public boolean getRetired(){
        return this.retired;
    }

    public String toString(){
        return this.name + " (" + this.birthYear + ": Winratio: " + String.format("%.2f", this.winRatio) + " " + (this.retired? "active":"retired")  + ".)";
    }

    public boolean play(){
        return random.nextDouble() < this.winRatio;
    }

    public boolean play(Player player){
        double getal1 = random.nextDouble();
        double getal2 = random.nextDouble();

        return player.getWinRatio() - getal1 - getal2 > this.winRatio - getal1 - getal2;

    }



}
