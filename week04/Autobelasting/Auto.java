package week04.Autobelasting;

public class Auto {
    private String merk;
    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return this.merk;
    }

    private String type;
    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }


    private int fiscaalVermogen;
    public void setFiscaalVermogen(int fiscaalVermogen){
        this.fiscaalVermogen = fiscaalVermogen;
    }

    public int getFiscaalvermogen(){
        return this.fiscaalVermogen;
    }

    public double berekenVerkeersbelasting(int fiscaalVermogen){
        double belasting = switch (fiscaalVermogen) {
            case 0, 1, 2, 3, 4 -> 91.68;
            case 5 -> 114.84;
            case 6 -> 165.96;
            case 7 -> 216.84;
            case 8 -> 268.20;
            case 9 -> 319.44;
            case 10 -> 370.08;
            case 11 -> 480.36;
            case 12 -> 590.52;
            case 13 -> 700.44;
            case 14 -> 810.72;
            case 15 -> 920.88;
            case 16 -> 1206.24;
            case 17 -> 1491.84;
            case 18 -> 1777.32;
            case 19 -> 2062.20;
            case 20 -> 2347.68;
            default -> 2347.68 + (fiscaalVermogen - 20) * 127.92; // pk boven 20
        };
        return belasting;
    }

}
