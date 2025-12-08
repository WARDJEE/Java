package week03;
import java.util.Scanner;
public class Kerstboom {
    public static void main(String[] args) {
        int breedte;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Geef de breedte de van kerstboom vanaf 9: ");
            breedte = scan.nextInt();
        }while (breedte %2 == 0 || breedte < 9);
        scan.close();

        for (int i = 1;i != breedte + 2; i += 2){
            int helft = (breedte - i) / 2;
            for (int j = 0; j != helft; j++){
                System.out.print(" ");
            }
            for (int k = 1; k != i + 1;k++){
            System.out.print("*");}
            System.out.println();
        }
        int helft = (breedte - 3) / 2;
        for (int i = 1;i != 4; i += 1){
            for (int j = 0; j != helft; j++){
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}
