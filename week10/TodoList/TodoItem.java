package week10.TodoList;

import java.time.LocalDate;

class TodoItem {
    private String description;
    private int priority;
    private LocalDate deadline;

    TodoItem(String description, int priority, String deadline) {
        this.description = description;
        this.priority = priority;

        String[] parts = deadline.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if ((LocalDate.of(year, month, day)).isBefore(LocalDate.now())) {
            System.out.println("Fout: de deadline ligt voor vandaag!");
            this.deadline = LocalDate.now();
        } else {
            this.deadline = LocalDate.of(year, month, day);
        }
    }

    public String getDescription() {
        return this.description;
    }

    public int getPriority() {
        return this.priority;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }

    public String toString() {
        return String.format("%-5d %-40s %s", priority, description, deadline);
    }
}
