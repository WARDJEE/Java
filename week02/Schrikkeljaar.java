package week02;
import java.util.Scanner;
public class Schrikkeljaar {
    public static void main(String[] args) {
        int jaartal;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een jaartal: ");
        jaartal = scan.nextInt();

        if (jaartal % 4 == 0 && jaartal % 100 != 0 || jaartal % 400 == 0){
            System.out.printf("Het jaar %d is een schrikkeljaar.", jaartal);
        }
        else {System.out.printf("Het jaar %d is geen schrikkeljaar.", jaartal);}
    }
}
