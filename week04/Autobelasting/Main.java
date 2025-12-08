package week04.Autobelasting;

public class Main {
    public static void auto(String merk, String type, int fiscaalvermogen){
        Auto auto = new Auto();

        auto.setMerk(merk);
        auto.setType(type);
        auto.setFiscaalVermogen(fiscaalvermogen);

        System.out.println(auto.getMerk() + " " + auto.getType() + " met " + auto.getFiscaalvermogen() + "PK. U betaalt €" + auto.berekenVerkeersbelasting(fiscaalvermogen));
    }

    public static void main(String[] args) {
        auto("Renault", "Scénic", 8);
        auto("Porsche", "911 GT3", 19);
        auto("Rolls-Royce", "Phantom", 32);





    }
}
