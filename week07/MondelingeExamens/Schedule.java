package week07.MondelingeExamens;

public class Schedule {
    private Time[] times;

    public void createSchedule(int numberOfStudents, int minutesPerExam, Time start) {
        this.times = new Time[numberOfStudents];
        Time nieuw = new Time(start);
        for (int i = 0; i < numberOfStudents; i++) {
            this.times[i] = new Time(nieuw);
            nieuw.addMinutes(minutesPerExam);
            if (nieuw.getHour() == 10 && nieuw.getMinutes() == 30) {
                nieuw.addMinutes(15);
            }
            if (nieuw.getHour() == 12 && nieuw.getMinutes() == 0) {
                nieuw.addMinutes(60);
            }
            if (nieuw.getHour() == 14 && nieuw.getMinutes() == 30) {
                nieuw.addMinutes(15);
            }

        }
    }

    public void printSchedule(){
        System.out.println("Je schema is: ");
        for(Time time : times){
            System.out.println(time);
        }

        Time einde = new Time(times[times.length-1]);
        einde.addMinutes(15);
        System.out.println("Je eindigt om " + einde);
    }
}
