package week7.MondelingeExamens;

import java.util.Scanner;

public class TestExam {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wanneer start het examen? ");
        String start = scan.nextLine();

        System.out.print("Hoeveel minuten per examen? ");
        int minutenPerStudent = scan.nextInt();

        System.out.print("Hoeveel studenten? ");
        int studenten = scan.nextInt();

        Time startTime = new Time(start);
        Schedule schedule = new Schedule();

        schedule.createSchedule(studenten, minutenPerStudent, startTime);
        schedule.printSchedule();
    }
}
