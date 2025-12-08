package week02;
import java.util.Scanner;
public class Unicode {
    public static void main(String[]args){
        String s;
        int lengte;
        int c = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een string: ");
        s = scan.nextLine();

        lengte = s.length();

        while (c != lengte){
            int waarde = s.charAt(c);
            System.out.println((char) waarde + " heeft een codepoint gelijk aan " + waarde);
            c++;
        }
        scan.close();
    }
}
