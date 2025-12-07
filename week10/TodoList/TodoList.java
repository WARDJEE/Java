package week10.TodoList;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoItem> items;

    public TodoList() {
        this.items = new ArrayList<>();
    }

    public void addTodoItem(String description, int priority, String deadline){
        TodoItem todoItem = new TodoItem(description, priority, deadline);

        int plaats = 0;
        while (plaats < items.size() && items.get(plaats).getPriority() <= todoItem.getPriority()) {
            plaats++;
        }

        this.items.add(plaats, todoItem);
    }

    public void show() {
        for (TodoItem item : this.items) {
            System.out.println(item);
        }
    }
}
