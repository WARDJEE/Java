package week03;
import java.util.Scanner;
public class Konijnen {
    public static void main(String[] args) {
        int maanden;
        int aantal1 = 1;
        int aantal2 = 1;
        int aantal3;

        Scanner scan = new Scanner(System.in);

        System.out.print("Aantal maanden: ");
        maanden = scan.nextInt();
        for (int n = maanden; n > 2; n--) {
            aantal3 = aantal1 + aantal2;
            aantal1 = aantal2;
            aantal2 = aantal3;

        }

        System.out.printf("Na %d maanden heb je %d paar konijnen.", maanden, aantal2);

    }
}
