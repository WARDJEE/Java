package week4.SmartLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lamp livingLamp = new Lamp();
        Lamp keukenLamp = new Lamp();
        Lamp slaapkamerLamp = new Lamp();


        Scanner scan = new Scanner(System.in);
        int keuze;


        do {
            System.out.println("""
                    Wat wil je doen?
                    1  Alle lampen aan
                    2  Alle lampen uit
                    3  Living en keuken aan (slaapkamer gaat uit)
                    4  Slaapkamer aan (living en keuken gaan uit)
                    5  Stoppen""");
            keuze = scan.nextInt();
        }while (keuze < 1 || keuze > 5);

        System.out.println("Jouw keuze: " + keuze);

        switch (keuze){
            case 1 ->{
                livingLamp.zetAan();
                keukenLamp.zetAan();
                slaapkamerLamp.zetAan();
            }
            case 2 -> {
                livingLamp.zetUit();
                keukenLamp.zetUit();
                slaapkamerLamp.zetUit();
            }
            case 3 -> {
                livingLamp.zetAan();
                keukenLamp.zetAan();
                slaapkamerLamp.zetUit();
            }
            case 4 ->{
                livingLamp.zetUit();
                keukenLamp.zetUit();
                slaapkamerLamp.zetAan();
            }
        }
        System.out.println("- Lamp in de living: " + livingLamp.getLamp());
        System.out.println("- Lamp in de keuken: " + keukenLamp.getLamp());
        System.out.println("- Lamp in de slaapkamer: " + slaapkamerLamp.getLamp());




    }
}
