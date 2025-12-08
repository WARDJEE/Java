package week03;
import java.util.Random;
public class Dobbelsteen {
    static void rolDobbelsteen(){
        int getal;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        for (int i = 0; i < 6001; i++){
            Random random = new Random();
            getal = random.nextInt(1, 7);
            switch (getal) {
                case 1 -> a++;
                case 2 -> b++;
                case 3 -> c++;
                case 4 -> d++;
                case 5 -> e++;
                case 6 -> f++;
            }

        }
        System.out.println("Aantal enen: " + a);
        System.out.println("Aantal tweeën: " + b);
        System.out.println("Aantal drieën: " + c);
        System.out.println("Aantal vieren: " + d);
        System.out.println("Aantal vijven: " + e);
        System.out.println("Aantal zessen: " + f);

    }
    public static void main(String[] args) {
        rolDobbelsteen();
    }
}
