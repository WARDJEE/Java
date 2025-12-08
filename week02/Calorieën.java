package week02;
import java.util.Scanner;
public class Calorieën {
    public static void main(String[]args) {
        String land;
        long aantalMensen;
        long calorieën;
        long pizza;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef de naam van het land: ");
        land = scan.nextLine();

        while (true) {

            System.out.print("Hoeveel mensen wonen er in " + land + "? ");
            aantalMensen = scan.nextInt();

            if (aantalMensen >= 1000000){
                calorieën = aantalMensen * 2256;
                System.out.println("In België verbruiken alle inwoners samen " + calorieën + " calorieën per dag.");
                pizza = calorieën / 906;
                System.out.println("Dat kom overeen met " + pizza + " pizza's per dag.");
                break;
            }
            else {
                System.out.println("Fout! Dit getal is te klein!");
            }


        }
        scan.close();
    }
}
