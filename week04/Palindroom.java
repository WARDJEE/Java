package week04;
import java.util.Scanner;
public class Palindroom {
    static boolean pallingdroom(String woord){
        int zelfde = 0;

        int lengte = woord.length() - 1;
        for (int i = 0; i < lengte; i++){
            if (woord.charAt(i) == woord.charAt(lengte - i)){
                zelfde++;
            }
        }

        if (zelfde == lengte){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een woord: ");
        String woord = scan.nextLine().toLowerCase().strip();

        if (pallingdroom(woord)){
            System.out.println("\"" + woord + "\" is een pallindroom.");
        }
        else {
            System.out.println("\"" + woord + "\" is geen pallindroom");
        }

    }
}
