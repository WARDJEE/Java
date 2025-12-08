import java.util.Scanner;
public class Reeksen {
    public static void main(String[] args){
        int getallen;
        int startWaarde;
        int verhogen;
        int x = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hoeveel getallen wil je afdrukken? ");
        getallen = scan.nextInt();

        System.out.print("Met welke waartde wil je starten? ");
        startWaarde = scan.nextInt();

        System.out.print("Met welke waarde wil je verhogen? ");
        verhogen = scan.nextInt();

        scan.close();

        while(x != getallen){
            System.out.print(startWaarde + " ");
            startWaarde += verhogen;
            x++;
        }

    }
}
