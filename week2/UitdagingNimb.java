package week2;
import java.util.Random;
import java.util.Scanner;
public class UitdagingNimb {
    public static void main(String[]args){

        int startAantal = 21;
        String beginner;
        int lucifers;
        int start = 1;

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        while (startAantal > 0){
            while (start == 1){
                System.out.print("Wie begint er? (ik/computer) ");
                beginner = scan.nextLine().toLowerCase().strip();

                if (beginner.equals("ik")){
                    start--;
                }
                else if (beginner.equals("computer")) {
                    lucifers = random.nextInt(1, 4);
                    startAantal -= lucifers;
                    System.out.println("De computer heeft " + lucifers + " lucifers genomen, er zijn er nog " + startAantal + " over.");
                    start--;
                }
                else{
                    System.out.println("Dit is geen keuze.");
                }
            }

            do {
                System.out.print("Hoeveel lucifers wil je nemen? (1-3) ");
                lucifers = scan.nextInt();

            } while (lucifers > startAantal || lucifers > 3 || lucifers < 1);

            startAantal -= lucifers;
            System.out.println("Jij hebt " + lucifers + " lucifers genomen, er zijn er nog " + startAantal + " over.");

            if (startAantal <= 0){
                System.out.println("Jij verliest.");
                break;
            }

            do {
                lucifers = random.nextInt(1, 4);
            }while (lucifers > startAantal);
            startAantal -= lucifers;

            System.out.println("De computer heeft er " + lucifers + " genomen, er zijn er nog " + startAantal + " over.");
            if (startAantal <= 0){
                System.out.println("Jij wint.");
                break;
            }
        }
    }
}