package week03;
import java.util.Scanner;
public class Rangschikken {
    public static void main(String[] args) {
        int voorwerpen;
        int mannieren = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Hoeveel voorwerpen? ");
        voorwerpen = scan.nextInt();

        for (int i = 1; i <= voorwerpen; i++){
            mannieren *= i;
        }

        System.out.printf("Je kan %d voorwerpen op %d verschillende manieren rangschikken.", voorwerpen, mannieren );
    }
}
