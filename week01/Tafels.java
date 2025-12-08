import java.util.Objects;
import java.util.Scanner;
public class Tafels {
    public static void main(String[]args){
        int tafel;
        int x = 0;
        int antwoord;
        int fout = 0;
        String keuze;

        Scanner scan = new Scanner(System.in);

        System.out.print("Wil je leren of oefenen? ");
        keuze = scan.next();

while (!Objects.equals(keuze, "leren") || !Objects.equals(keuze, "oefenen")) {

    if (keuze.toLowerCase().trim().equals("leren")) {
        System.out.print("Welke tafel wil je leren? ");
        tafel = scan.nextInt();
        while (x != 11) {
            System.out.println(x + " * " + tafel + " = " + (x * tafel));
            x++;
        }
        x = 0;
        scan.nextLine();

        }

    else if (keuze.toLowerCase().trim().equals("oefenen")) {
        System.out.print("Welke tafel wil je oefenen? ");
        tafel = scan.nextInt();
        while (x != 11) {
            System.out.print(x + " * " + tafel + " = ");
            antwoord = scan.nextInt();
            if (antwoord == x * tafel) {
                System.out.println("Correct!");
                x++;
            } else {
                System.out.println("Fout!");
                fout++;
            }}
            x = 0;
            scan.nextLine();



        if (fout <= 2) {
            System.out.println("Je hebt de tafel van " + tafel + " onder de knie, je maakte " + fout + " fouten.");
        } else if (fout <= 5) {
            System.out.println("Blijven oefenen, je hebt de tafel van " + tafel + " bijna onder de knie, je maakte " + fout + " fouten.");
        } else {
            System.out.println("Ai ai, je zult veel meer moeten oefenen aan de tafel van " + tafel + "Je maakte " + fout + " fouten.");
        }}

    else if (keuze.toLowerCase().trim().equals("stoppen")){
        System.out.println("Tot ziens!");
        break;
    }
    else {
        System.out.print("Het is leren of oefenen: ");
        keuze = scan.nextLine();
        scan.nextLine();
    }
    System.out.print("Wilt u nog leren, oefenen of stoppen? ");
    keuze = scan.nextLine();

}
scan.close();
    }
}
