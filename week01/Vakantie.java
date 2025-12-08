package week01;
import java.util.Scanner;

public class Vakantie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double yousra;
        double quinten;
        double jan;
        double schuldYousra;
        double schuldQuinten;
        double schuldJan;

        System.out.print("Hoeveel heeft Yousra uitgegeven: ");
        yousra = scan.nextDouble();

        System.out.print("Hoeveel heeft Quinten uitgegeven: ");
        quinten = scan.nextDouble();

        System.out.print("Hoeveel heeft Jan uitgegeven: ");
        jan = scan.nextDouble();

        scan.close();

        double totaal = yousra + quinten + jan;
        System.out.println("In totaal werd er €" +  totaal + " uitgegeven.");

        double perPersoon = (yousra + quinten + jan) / 3;
        System.out.printf("Dat is €%.2f per persoon.\n", perPersoon);

        schuldYousra = perPersoon - yousra;

        schuldQuinten = perPersoon - quinten;

        schuldJan = perPersoon - jan;

        double gemiddeldeSchuld = (schuldYousra + schuldQuinten + schuldJan) / 3;

        if (schuldYousra > 0 && schuldQuinten > 0){
            System.out.println("Yousra moet €" + schuldYousra + " betalen aan Jan en Quinten moet €" + schuldQuinten + " betalen aan Jan.");
        }

        else if (schuldJan > 0 && schuldQuinten > 0){
            System.out.println("Jan moet €" + schuldJan + " betalen aan Jan en Quinten moet €" + schuldQuinten + " betalen aan Yousra.");
        }

        else if (schuldJan > 0 && schuldYousra > 0){
            System.out.println("Jan moet €" + schuldJan + " betalen aan Jan en Yousra moet €" + schuldYousra + " betalen aan Quinten.");
        }

        else if (schuldYousra < 0 && schuldQuinten < 0){
            System.out.println("Jan moet €" + Math.abs(gemiddeldeSchuld - schuldYousra) + " betalen aan Yousra en €" + Math.abs(gemiddeldeSchuld - schuldQuinten) + " aan Quinten.");
        }

        else if (schuldJan < 0 && schuldQuinten < 0){
            System.out.println("Yousra moet €" + Math.abs(gemiddeldeSchuld - schuldJan) + " betalen aan Jan en €" + Math.abs(gemiddeldeSchuld - schuldQuinten) + " aan Quinten.");
        }

        else if (schuldYousra < 0 && schuldJan < 0){
            System.out.println("Quinten moet €" + Math.abs(gemiddeldeSchuld - schuldYousra) + " betalen aan Yousra en €" + Math.abs(gemiddeldeSchuld - schuldJan) + " aan Jan.");
        }

        System.out.println();



    }
}
