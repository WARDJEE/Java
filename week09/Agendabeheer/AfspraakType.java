package week09.Agendabeheer;

public enum AfspraakType {
    TELEFOONGESPREK, VERGADERING, AFSPRAAK, LUNCH, BORREL;

    public String toString(){
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
