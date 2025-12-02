package week8.LijstVanObjecten;

import java.util.Arrays;
import java.util.Objects;

public class List {
    private final int MAX_CAPACITY = 100;
    Object[] objects = new Object[MAX_CAPACITY];
    private int size = 0;

    public boolean add(Object object){
        if (this.size < this.MAX_CAPACITY){
            this.objects[size++] = object;
            return true;
        }
        return false;
    }

    public Object get(int index){
        if (index < 0 || index >= this.size){
            return null;
        }
        return this.objects[index];
    }

    public int getSize(){
        return this.size;
    }

    // Stap 3
    public int get(Object object){


        for (int i = 0; i < this.size; i++) {
            if (object != null && object.getClass().isArray() && this.objects[i] != null && this.objects[i].getClass().isArray()) {
                if (object instanceof int[] && this.objects[i] instanceof int[]) {
                    if (Arrays.equals((int[]) object, (int[]) this.objects[i])) {
                        return i;
                    }
                }
                // Voeg eventueel andere arraytypen toe zoals double[], Object[], etc.
            } else {
                // Normale vergelijking met equals()
                if (object.equals(this.objects[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
}
