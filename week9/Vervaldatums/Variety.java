package week9.Vervaldatums;

public enum Variety {
    WHITE, BROWN;

    public String toString(){
        return switch (this) {
            case WHITE -> "Witte";
            case BROWN -> "Bruine";
        };
    }
}
