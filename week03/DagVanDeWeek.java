package week03;
import java.util.Calendar;

public class DagVanDeWeek {
    public static void main(String[] args) {
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        String dag = "";
        /*switch (dayOfWeek) {

            case 1: dag = "zondag";
                break;

            case 2: dag = "maandag";
                break;
            case 3: dag = "dinsdag";
                break;
            case 4: dag = "woensdag";
                break;
            case 5: dag = "donderdag";
                break;
            case 6: dag = "vrijdag";
                break;

            case 7: dag = "Zaterdag";
                break;
                
        }*/

        dag = switch (dayOfWeek) {
            case 1 -> "zondag";
            case 2 -> "maandag";
            case 3 -> "dinsdag";
            case 4 -> "woensdag";
            case 5 -> "donderdag";
            case 6 -> "vrijdag";
            case 7 -> "zaterdag";
            default -> "";
        };



        System.out.println("Het is " + dag + "!");
        
    }
}
