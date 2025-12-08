package week05.Kotbaas;

public class Room {
    private int roomNumber;
    private Student student;
    private double pricePerMonth;

    public Room(int roomNumber, double pricePerMonth){
        this.roomNumber = roomNumber;
        this.pricePerMonth = pricePerMonth;
        this.student = null;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public Student getStudent(){
        return this.student;
    }

    public void setPricePerMonth(double pricePerMonth){
        this.pricePerMonth = pricePerMonth;
    }

    public double getPricePerMonth(){
        return this.pricePerMonth;
    }

    public String toString(){
        if (student == null){
            return "Kamer "+ this.roomNumber+ ": leegstaand (€"+this.pricePerMonth+")";

        }
        else{
        return "Kamer "+ this.roomNumber+ ": "+this.student+" (€"+this.pricePerMonth+")";}
    }

}
