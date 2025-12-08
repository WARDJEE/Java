package week07.FlexibeleLijst;

public class List {
    private int[] numbers;
    private int size;

    public List(int capacity) {
        // de array wordt gecreëerd
        this.numbers = new int[capacity];
    }

    public boolean add(int number) {
        // het getal wordt op het einde in de array gestockeerd en size wordt verhoogd
        //  als de maximum capaciteit overschreden werd, wordt false teruggegeven
        if (size >= numbers.length) {
            return false; // lijst is vol
        }
        else {
            this.numbers[size] = number;
            this.size++;
            return true;
        }
    }

    public int size() {
        // geeft het aantal elementen in de lijst terug
        return this.size;
    }

    public int get(int i) {
        // geeft het i-de element terug of -1 als het niet bestaat.
        if (i >=0 && i < this.size) {
            return this.numbers[i];
        }
        else{return -1;}
    }

    // Gevorderd: kan je deze methode aanvullen?
    public boolean remove(int index) {
        // deze methode verwijdert het element op de gegeven plaats
        // alle elementen hierna moeten dus 1 plaats opgeschoven worden
        // de return value geeft weer of het element bestond en succesvol verwijderd is
        this.numbers[index] = 0;
        if (index < 0 || index >= this.size) {
            return false;
        }
        else {
            for (int i = index; i < size - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            size--;
            return true;
        }
    }
}