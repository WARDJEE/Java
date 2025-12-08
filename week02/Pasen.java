package week02;

import java.util.Scanner;

public class Pasen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int jaar;

        do {
            System.out.print("Geef het jaar: ");
            jaar = scan.nextInt();
            if (jaar < 1583){
                System.out.println("Het jaartal moet groter of gelijk zijn aan 1583!");
            }
        }while (jaar < 1583);

        int n = jaar % 19;
        int c = jaar / 100;
        int u = jaar % 100;
        int s = c / 4;
        int t = c % 4;
        int p = (c + 8) / 25;
        int q = (c - p + 1) / 3;
        int e = (19 * n + c - s - q + 15) % 30;
        int b = u / 4;
        int d = u % 4;
        int L = (2 * t + 2 * b - e - d + 32) % 7;
        int h = (n + 11 * e + 22 * L) / 451;
        int maand = (e + L - 7 * h + 114) / 31;
        int dag = ((e + L - 7 * h + 114) % 31) + 1;

        if (maand == 3){
            System.out.printf("In %d valt Pasen op %d maart.", jaar, dag);
        }
        else {System.out.printf("In %d valt Pasen op %d april.", jaar, dag);}
    }
}
