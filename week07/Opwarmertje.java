package week07;

import java.util.Scanner;

public class Opwarmertje {
    final static int NUMBER_OF_TEMPERATURES = 7;

    public static void main(String[] args) {
        double[] temperatuurLijst = inputTemperatures();
        printTemperatures(temperatuurLijst);
        System.out.printf("Gemiddelde: %.2f", calculateAverage(temperatuurLijst));
    }

    static double[] inputTemperatures(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Geef de "+ NUMBER_OF_TEMPERATURES + " temperaturen: ");

        double[] temperatuurLijst = new double[NUMBER_OF_TEMPERATURES];

        for (int i = 0; i < NUMBER_OF_TEMPERATURES; i++) {
            System.out.print("Dag " + (i+1) + ": ");
            temperatuurLijst[i] = scan.nextDouble();
        }
        return temperatuurLijst;
    }

    static void printTemperatures(double[] temperatuurLijst){
        System.out.println("Overzicht:");
        System.out.println("=================");
        for (int i = 0; i < NUMBER_OF_TEMPERATURES; i++) {
            System.out.println("Dag "+ (i+1) + ":        " + temperatuurLijst[i] );

        }

        System.out.println("=================");
    }
    
    static double calculateAverage(double[] temperatuurLijst){
        double som = 0;
        for (double nummer : temperatuurLijst){
            som += nummer;
        }
        return som/NUMBER_OF_TEMPERATURES;
    }
}
