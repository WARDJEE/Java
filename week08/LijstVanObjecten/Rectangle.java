package week08.LijstVanObjecten;

public class Rectangle {
    private int lengte;
    private int breedte;

    public Rectangle(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public double getLengte() {
        return this.lengte;
    }

    public double getBreedte() {
        return this.breedte;
    }

    // Stap 2
    @Override
    public String toString() {
        return "rechthoek met lengte " + this.lengte + " en breedte " + this.breedte;
    }

    // Stap 3

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle rectangle)) return false;
        return lengte == rectangle.lengte
                && breedte == rectangle.breedte;
    }
}
