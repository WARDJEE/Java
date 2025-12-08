package week01;
import java.util.Scanner;
public class Bewerkingen {
    public static void main(String[] args){
        double eersteGetal;
        double tweedeGetal;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een getal: ");
        eersteGetal = scan.nextDouble();

        System.out.print("Geef nog een getal: ");
        tweedeGetal = scan.nextDouble();

        System.out.println("Kies een bewerking (getal): \n 1 Optellen \n 2 Aftrekken \n 3 Vermenigvuldigen \n 4 Delen");
        System.out.print("Jouw keuze: ");
        int bewerking = scan.nextInt();
        scan.close();

        if (bewerking == 1){
            System.out.println(eersteGetal + " + " + tweedeGetal + " = " + (eersteGetal+tweedeGetal));
        }
        else if (bewerking == 2){
            System.out.println(eersteGetal + " - " + tweedeGetal + " = " + (eersteGetal-tweedeGetal));
        }
        else if (bewerking == 3){
            System.out.println(eersteGetal + " * " + tweedeGetal + " = " + (eersteGetal*tweedeGetal));
        }
        else if (bewerking == 4){
            System.out.println(eersteGetal + " / " + tweedeGetal + " = " + eersteGetal/tweedeGetal);
        }
        else{
            System.out.println("Dit is geen optie!");
        }



    }
}
