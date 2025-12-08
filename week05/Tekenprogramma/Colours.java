package week05.Tekenprogramma;

public class Colours {
    public static final int CYAN = 0;
    public static final int MAGENTA = 1;
    public static final int YELLOW = 2;


    public static String getColourName(int colour) {
        return switch (colour) {
            case CYAN -> "cyaan";
            case MAGENTA -> "magenta";
            case YELLOW -> "geel";
            default -> "ONBEKEND";
        };
    }


}
