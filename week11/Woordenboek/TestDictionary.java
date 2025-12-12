package week11.Woordenboek;

public class TestDictionary {
    static void main() {
        Dictionary dict = DictionaryCreator.createFinnishDictionary();

        System.out.println("Aantal woorden: " + dict.numberOfWords());
        System.out.println("een - " + dict.translate("een"));
        System.out.println("drie - " + dict.translate("drie"));
        System.out.println("zeven - " + dict.translate("zeven"));
        System.out.println("twaalf - " + dict.translate("twaalf"));
    }
}