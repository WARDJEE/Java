import java.util.Scanner;
public class Cowsay {
    public static void main(String[]args){
        String zin;
        int lengte;
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een zin: ");
        zin = scan.nextLine();
        lengte = zin.length();

        String lijn = "*".repeat(lengte + 4);


        System.out.println(lijn);
        System.out.println("* " + zin + " *");
        System.out.println(lijn);
        System.out.println("     \\   ^__^");
        System.out.println("      \\  (oo)\\_______");
        System.out.println("         (__)\\       )\\/\\");
        System.out.println("          U ||----w |");
        System.out.println("            ||      ||");

scan.close();
    }
}
