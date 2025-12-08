package week09.Vervaldatums;

public enum Variety {
    WHITE, BROWN;

    public String toString(){
        return switch (this) {
            case WHITE -> "Wit";
            case BROWN -> "Bruin";
        };
    }
}
