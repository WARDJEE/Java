package week8.Modelbouwclub;

import java.util.Objects;

public class BoardMember extends Member {
    private String function;

    public BoardMember(String name, long number, String function) {
        super(name, number);
        this.function = function;
    }

    public String getFunction() {
        return this.function;
    }

    @Override
    public String toString() {
        return "bestuurslid " + super.toString();
    }

    // Stap 2
    @Override
    public boolean equals(Object o) {
        if (o instanceof BoardMember boardMember) {
            return super.equals(o)
                    && Objects.equals(super.getName(), boardMember.getName())
                    && Objects.equals(function, boardMember.function);
        }

        // Stap 3
        if (o instanceof Member member) {
            return super.equals(o)
                    && Objects.equals(super.getName(), member.getName());

        }

        return false;
    }


}
