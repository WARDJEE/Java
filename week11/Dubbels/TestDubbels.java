package week11.Dubbels;

public class TestDubbels {
    static void main() {
        Dubbels dubbels = new Dubbels(Data.getData());

        System.out.println("Origineel:\n\n" + dubbels);
        dubbels.verwijderDubbels();
        System.out.println("\n\nNa verwijderen dubbels:\n\n" + dubbels);
    }
}
