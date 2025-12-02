package week8.Modelbouwclub;

import java.util.Objects;

public class Member {
    private String name;
    private long number;

    public Member(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public long getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return this.name;
    }

    // Stap 1
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;
        return number == member.number;
    }

}
