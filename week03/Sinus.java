package week03;
import java.util.Scanner;
public class Sinus {
    public static void main(String[] args) {
        int amplitude;
        int periode;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef de amplitude: ");
        amplitude = scan.nextInt();

        System.out.print("Geef de periode: ");
        periode = scan.nextInt();

        for (int teller = 0;teller < 3*periode; teller++) {
            int positie = (int) (Math.sin(teller * 2 * Math.PI / periode) * amplitude + amplitude);
            for(int i = 1; i < positie; i++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
