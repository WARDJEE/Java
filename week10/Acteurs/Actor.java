package week10.Acteurs;

import java.util.Objects;

public class Actor implements Comparable <Actor> {
    private String name;
    private int birthYear;

    public Actor(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Actor actor)) return false;
        return birthYear == actor.birthYear && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }

    @Override
    public String toString() {
        return this.name + " " + this.birthYear;
    }

    @Override
    public int compareTo(Actor o) {
        return 0;
    }
}
