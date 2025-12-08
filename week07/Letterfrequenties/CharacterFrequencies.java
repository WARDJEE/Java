package week07.Letterfrequenties;

public class CharacterFrequencies {
    private int aantal = 0;
    private char[] alfabet = {
            'a','b','c','d','e','f','g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t','u','v','w','x','y','z'};

    private int[] letters = new int[26];

    public void adaptFrequencies(String zin) {
        zin = zin.toLowerCase();
        for (int i = 0; i < zin.length(); i++) {
            char karakter = zin.charAt(i);
            if (karakter >= 'a' && karakter <= 'z') {
                letters[karakter - 'a']++;
                aantal++;
            }
        }
    }

    public void printFrequencies() {
        System.out.println("Letterfrequenties tot nu toe:");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(alfabet[i] + " --> " + letters[i] + "x  ");
            if ((i + 1) % 8 == 0) System.out.println();
        }
        System.out.println();
        System.out.println("Totaal aantal letters: " + aantal);
        System.out.println();
    }
}
