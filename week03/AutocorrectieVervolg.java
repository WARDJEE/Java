package week03;
import java.util.Scanner;
public class AutocorrectieVervolg {
    static int afstand(String woord){
        int lengte = woord.length();
        int som = 0;
        int waarde;

        for (int x = 0; x != lengte; x++){
            waarde = woord.charAt(x);
            som += waarde;
        }
        return som;
    }
    static String autoCorrect(String woord){

        String[] woordenlijst =
                //region
                {"bier", "water", "kebab", "hamburger", "fiets", "auto", "huis", "boom", "computer", "boek", "stoel", "tafel", "deur", "raam",
                "lamp", "telefoon", "water", "lucht", "zon", "maan", "ster", "regen", "wind", "berg",
                "zee", "strand", "bloem", "gras", "dier", "kat", "hond", "paard", "vogel", "vis",
                "mens", "kind", "vriend", "school", "werk", "spel", "muziek", "film", "theater", "schip",
                "brug", "straat", "plein", "winkel", "markt", "stad", "dorp", "land", "wereld", "taal",
                "woord", "zin", "boek", "blad", "bladzijde", "schrift", "pen", "potlood", "gum", "papier",
                "computer", "programma", "applicatie", "code", "website", "internet", "server", "database",
                "netwerk", "bestand", "map", "schijf", "scherm", "beeld", "kleur", "vorm", "lijn", "vlak",
                "cirkel", "vierkant", "driehoek", "punt", "hoek", "kant", "zijde", "breedte", "lengte", "hoogte",
                "gewicht", "maat", "getal", "nummer", "tijd", "uur", "minuut", "seconde", "dag", "week",
                "maand", "jaar", "seizoen", "voorjaar", "zomer", "herfst", "winter", "morgen", "avond", "nacht",
                "eten", "drinken", "brood", "kaas", "melk", "water", "koffie", "thee", "fruit", "appel",
                "banaan", "peer", "sinaasappel", "druif", "citroen", "groente", "wortel", "tomaat", "sla",
                "komkommer", "aardappel", "rijst", "pasta", "vlees", "vis", "ei", "soep", "salade", "taart",
                "koek", "ijs", "chocolade", "snoep", "suiker", "zout", "peper", "olie", "boter", "azijn"};
                //endregion

        String correctWoord = woordenlijst[0];
        int dichtste = Math.abs(afstand(woord)-afstand(woordenlijst[0]));

        for (int i = 1; i < woordenlijst.length; i++) {
            int verschil = Math.abs(afstand(woord)-afstand(woordenlijst[i]));

            if (verschil < dichtste){
                dichtste = verschil;
                correctWoord = woordenlijst[i];
            }
        }
        return correctWoord;


    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een woord: ");
        String woord = scan.nextLine().toLowerCase();
        scan.close();

        System.out.println("Bedoelde je \"" + autoCorrect(woord) + "\"?");
    }
}
