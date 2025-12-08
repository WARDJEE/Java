package week08;

import java.util.Objects;

public class Student {
    private String name;
    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return number == student.number && Objects.equals(name, student.name);
    }

    /*static void main() {
        Student student1 = new Student("Kris", 1234);
        Student student2 = new Student("Kris", 1234);
        if (student1 == student2) {
            System.out.println("De studenten zijn gelijk");
        } else {
            System.out.println("De studenten zijn niet gelijk");
        }
    }*/

    static void main() {
        Student student1 = new Student("Kris", 1234);
        Student student2 = new Student("Kris", 1234);
        if (student1.equals(student2)) {
            System.out.println("De studenten zijn gelijk");
        } else {
            System.out.println("De studenten zijn niet gelijk");
        }
    }
}
