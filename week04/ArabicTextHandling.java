package week04;

public class ArabicTextHandling {
    public static void main(String[] args) {
        String arabicText = "مرحبا بك في عالم البرمجة"; // "Welkom in de wereld van programmeren"

        String englishText = "Learning Java with Arabic text.";

        String combined1 = arabicText + " " + englishText;
        String combined2 = englishText + " " + arabicText;

        System.out.println("Arabisch eerst: " + combined1);
        System.out.println();
        System.out.println("Engels eerst: " + combined2);

        String substring = arabicText.substring(0, 8);
        System.out.println();
        System.out.println("Substring: " + substring);

        System.out.println();
        System.out.println("Lengte arabicText: " + arabicText.length());
        System.out.println("Lengte englishText: " + englishText.length());

        System.out.println();
        System.out.println("Arabische karakters: ");
        for (int i = 0; i < arabicText.length(); i++) {
            System.out.println("[" + i + "] " + arabicText.charAt(i));
        }

        System.out.println();
        System.out.println("Engelse karakters:");
        for (int i = 0; i < englishText.length(); i++) {
            System.out.println("[" + i + "] " + englishText.charAt(i));
        }
    }
}
