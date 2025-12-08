package week09.EenMooiFiguur;

public abstract class Figure {
    private String name;

    public Figure(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
