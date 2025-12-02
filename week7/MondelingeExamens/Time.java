package week7.MondelingeExamens;

public class Time {
    private int hour;
    private int minutes;

    public Time(String time){
        String[] delen = time.split(":");
        this.hour = Integer.parseInt(delen[0]);
        this.minutes = Integer.parseInt(delen[1]);
    }

    public Time(Time other){
        this.hour = other.hour;
        this.minutes = other.minutes;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getHour(){
        return this.hour;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public String toString(){
        return String.format("%02d:%02d", this.hour, this.minutes);
    }

    public void addMinutes(int minutes){
        int minuten = this.hour * 60 + this.minutes + minutes;
        this.hour = minuten / 60;
        this.minutes = minuten % 60;
    }
}
