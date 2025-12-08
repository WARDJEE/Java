package week02;
import java.util.Scanner;
public class Codering {
    public static void main(String[] args) {
        String bericht;
        StringBuilder nieuwBericht = new StringBuilder();
        String optie;
        int lengte;
        int newChar;

        Scanner scan = new Scanner(System.in);

        do {System.out.print("Geef een bericht: ");
        bericht = scan.nextLine();}while (bericht.isEmpty());
        lengte = bericht.length();

        do {System.out.print("Wil je dit encoderen of decoderen? ");
        optie = scan.nextLine();} while (!optie.equals("decoderen") && !optie.equals("encoderen"));

        if (optie.equals("encoderen")){
            for (int i = 0; i < lengte; i++){
                if ((int) bericht.charAt(i) < 96){
                newChar = bericht.charAt(i);
                nieuwBericht.append((char) newChar);}
                else {newChar = (int) bericht.charAt(i) + 3;
                    if (newChar > 122){
                        newChar -= 26;
                        nieuwBericht.append((char) newChar);
                    }
                    else{
                    nieuwBericht.append((char) newChar);}
                }
            }
            System.out.println(nieuwBericht);
        }
        else {for (int i = 0; i < lengte; i++){
                if ((int) bericht.charAt(i) < 96){
                    newChar = bericht.charAt(i);
                    nieuwBericht.append((char) newChar);}
                else {newChar = (int) bericht.charAt(i) - 3;
                    if (newChar < 97){
                        newChar += 26;
                        nieuwBericht.append((char) newChar);
                    }
                    else{
                        nieuwBericht.append((char) newChar);}
                }
            }
        System.out.println(nieuwBericht);
        }
    }
}
