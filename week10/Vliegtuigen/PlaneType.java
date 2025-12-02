package week10.Vliegtuigen;

public class PlaneType {
    private String code;
    private String description;

    public PlaneType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "PlaneType{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
