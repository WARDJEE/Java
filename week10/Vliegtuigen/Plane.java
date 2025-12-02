package week10.Vliegtuigen;

public class Plane {
    private PlaneType type;
    private String name;
    private String airline;

    public Plane(PlaneType type, String name, String airline) {
        this.type = type;
        this.name = name;
        this.airline = airline;
    }

    public PlaneType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getAirline() {
        return this.airline;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", airline='" + airline + '\'' +
                '}';
    }
}
