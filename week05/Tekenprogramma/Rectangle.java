package week05.Tekenprogramma;

public class Rectangle {
    private double width;
    private double height;
    private int colour;


    public Rectangle(double width, double height, int colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setColour(int colour){
        this.colour = colour;
    }

    public int getColour(){
        return this.colour;
    }

    public double area(){
        return this.width * this.height;
    }

    public String toString(){
        return "Rechthoek "+this.height+" x "+this.width+" in kleur "+ Colours.getColourName(colour);

    }

}
