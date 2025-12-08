package week05.Tekenprogramma;

public class Circle {
    private double radius;
    private int colour;


    public Circle(double radius, int colour){
        this.radius = radius;
        this.colour = colour;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setColour(int colour){
        this.colour = colour;
    }

    public int getColour(){
        return this.colour;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "Cirkel met straal "+this.radius+" in kleur "+ Colours.getColourName(colour);
    }
}
