package week05.Verhuisfirma;

public class Box {
    private String type;
    private double width;
    private double height;
    private double length;

    public Box(String type, double width, double height, double length){
        this.type = type;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(String type){
        switch (type){
            case "Type1" -> {
                this.length = 100;
                this.width = 50;
                this.height = 50;
            }
            case "Type2" -> {
                this.length = 50;
                this.width = 25;
                this.height = 25;
            }

            case "Type3" -> {
                this.length = 25;
                this.width = 12.5;
                this.height = 12.5;
            }
            default -> {
                System.out.println("Fout! De type 'onbekend type' bestaat niet!");
                this.length = -1;
                this.width = -1;
                this.height = -1;
            }
        }
        this.type = type;
    }

    public double groundArea(){
        return this.length * this.width;
    }

    public double volume(){
        return this.length * this.width * this.height;
    }

    public double tapeLength(){
        return 2*(this.length + this.width);
    }

    public String toString(){
        return "Doos van het type "+this.type+":\n" +
                "    "+this.length+" * "+this.width+" * "+this.height+"\n" +
                "    oppervlakte: "+groundArea()+"\n" +
                "    volume: "+volume()+"\n" +
                "    tape lengte: "+tapeLength();
    }
}
