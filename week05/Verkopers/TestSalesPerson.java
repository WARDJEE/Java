package week05.Verkopers;

import java.util.Scanner;

public class TestSalesPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de omzet van de eerste verkoper: ");
        double revenue = scanner.nextDouble();
        SalesPerson viktor = new SalesPerson("Viktor", revenue);

        System.out.print("Geef de omzet van de tweede verkoper: ");
        revenue = scanner.nextDouble();
        SalesPerson tine = new SalesPerson("Tine", revenue);

        System.out.print("Geef de omzet van de derde verkoper: ");
        revenue = scanner.nextDouble();
        SalesPerson kubra = new SalesPerson("Kubra", revenue);

        // Vul hier aan
        System.out.println();
        if (viktor.generatesMoreRevenueThan(tine) && viktor.generatesMoreRevenueThan(kubra)){
            System.out.println("De beste verkoper is "+viktor.toString());
        }
        else if (tine.generatesMoreRevenueThan(viktor)&& tine.generatesMoreRevenueThan(kubra)){
            System.out.println("De beste verkoper is "+tine.toString());
        }
        else {System.out.println("De beste verkoper is "+kubra.toString());}
    }

}
