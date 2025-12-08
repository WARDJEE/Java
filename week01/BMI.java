import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        double gewicht;
        double lengte;
        System.out.println("Beste patiënt, dit programma berekent je BMI.");
        Scanner scan  = new Scanner(System.in);

        System.out.print("Geef je gewicht in kg: ");
        gewicht = scan.nextDouble();

        System.out.print("Geef je lengte in m: ");
        lengte = scan.nextDouble();

        scan.close();

        double BMI = gewicht / (lengte * lengte);
        System.out.println("BMI is " + BMI);
        if (BMI >= 30){
            System.out.println("Je bent obesitas.");
        }
        else if (BMI >= 25){
            System.out.println("Je hebt overgewicht.");
        }
        else if (BMI >= 18){
            System.out.println("Je bent in orde.");
        }
        else{
            System.out.println("Je hebt ondergewicht.");
        }



    }
}
