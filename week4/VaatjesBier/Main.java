package week4.VaatjesBier;

public class Main {
    public static void main(String[] args) {
        Biervat biervat = new Biervat();

        biervat.setCapaciteit(15);

        biervat.vullVolledig();

        System.out.println("Percentage = " + biervat.percentageGevuld());

        if(biervat.isVol()){
            System.out.println("Het vat is vol.");
        }
        else{
            System.out.println("Het vat is niet vol");
        }

        biervat.tap(3.75);

        System.out.println("Percentage = " + biervat.percentageGevuld());


        if(biervat.isVol()){
            System.out.println("Het vat is vol.");
        }
        else{
            System.out.println("Het vat is niet vol.");
        }
    }
}
