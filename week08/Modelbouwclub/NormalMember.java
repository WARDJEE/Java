package week08.Modelbouwclub;

import java.util.Objects;

public class NormalMember extends Member{
    private String speciality;

    public NormalMember(String name, long number, String speciality) {
        super(name, number);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    @Override
    public String toString() {
        return "gewoon lid " + super.toString();
    }

    // Stap 4
    @Override
    public boolean equals(Object o){
        if (o instanceof Member member){
            return super.equals(o)
                    && Objects.equals(super.getName(), member.getName());
        }

        return false;
    }
}
