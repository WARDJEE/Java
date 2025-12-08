package week05.Tekenprogramma;

import static week05.Tekenprogramma.Colours.*;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3.5, 6, CYAN);
        Rectangle rectangle2 = new Rectangle(3.1, 7.3, MAGENTA);
        Circle circle1 = new Circle(5, YELLOW);
        Circle circle2 = new Circle(2, MAGENTA);

        // print de vier figuren
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(circle1);
        System.out.println(circle2);
        double totalArea = rectangle1.area() + rectangle2.area() + circle1.area() + circle2.area();  // vul aan

        // bepaal de oppervlakte per kleur door de kleur van iedere figuur te bekijken en op te tellen

        colourArea(rectangle1);
        colourArea(rectangle2);
        colourArea(circle1);
        colourArea(circle2);

        System.out.println();
        System.out.printf("Totale oppervlakte is: %f%n", totalArea);
        System.out.println();
        System.out.printf("Totale oppervlakte cyaan is: %f%n", cyanArea);
        System.out.printf("Totale oppervlakte magenta is: %f%n", magentaArea);
        System.out.printf("Totale oppervlakte geel is: %f%n", yellowArea);
    }
    private static double cyanArea = 0;
    private static double magentaArea = 0;
    private static double yellowArea = 0;
    static public void colourArea(Rectangle rectangle){
        if (rectangle.getColour() == CYAN){
            cyanArea += rectangle.area();
        }
        else if (rectangle.getColour() == MAGENTA){
            magentaArea += rectangle.area();
        }
        else {yellowArea += rectangle.area();}
    }

    static public void colourArea(Circle circle){
        if (circle.getColour() == CYAN){
            cyanArea += circle.area();
        }
        else if (circle.getColour() == MAGENTA){
            magentaArea += circle.area();
        }
        else {yellowArea += circle.area();}
    }
}