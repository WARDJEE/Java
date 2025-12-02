package week4;
import java.util.Scanner;

public class GetallenFormatteren {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een getal: ");
        int getal = scan.nextInt();

        StringBuilder getalString = new StringBuilder("" + getal);

        int lengte = getalString.length();

        for (int i = lengte; i > 0; i -= 3){
            getalString.insert(i, " ");
        }
        System.out.println(getalString);

    }
}
