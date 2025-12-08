package week05.Kotbaas;

public class Student {
    private String name;
    private String streetNr;
    private String city;
    private int postalCode;

    public Student(String name, String streetNr, String city, int postalCode){
        this.name = name;
        this.streetNr = streetNr;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void getName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setStreetNr(String streetNr){
        this.streetNr = streetNr;
    }

    public String getStreetNr(){
        return this.streetNr;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }

    public int getPostalCode(){
        return this.postalCode;
    }

    public String toString(){
        return this.name + ", " + this.streetNr + ", " + this.postalCode + " " + this.city;

    }
}
