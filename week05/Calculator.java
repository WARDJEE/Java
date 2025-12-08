package week05;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int curve;

        System.out.print("Geef een minimum x-waarde: ");
        double min = scan.nextDouble();

        System.out.print("Geef een maximum x-waarde: ");
        double max = scan.nextDouble();

        do {
            System.out.print("""
                    Welke curve wil je tekenen?
                    1 = sinus
                    2 = cosinus hyperbolicus
                    3 = wortel
                    """);
            System.out.print("Jouw keuze: ");
            curve = scan.nextInt();
        }while (curve > 3 || curve < 1);
        

        switch (curve){
            case 1 -> {
                for (int i = 0; i < 20;i++ ) {
                    double stap = min + (i * (max - min)) / 19;
                    double positie  = 10*sin(stap)+10;

                    for (int j = 0; j < positie; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
            case 2 ->{
                for (int i = 0; i < 20;i++ ) {
                    double stap = min + (i * (max - min)) / 19;
                    double positie  = 10*cosh(stap);

                    for (int j = 0; j < positie; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
            case 3 ->{
                for (int i = 0; i < 20;i++ ) {
                    double stap = min + (i * (max - min)) / 19;
                    double positie  = sqrt(10*stap);

                    for (int j = 0; j < positie; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }

            }



    }
}
