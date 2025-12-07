package week10.TodoList;

public class TestTodoList {
    static void main() {

        TodoList lijst = new TodoList();

        lijst.addTodoItem("Uitblazen na examens P2", 1,"19/01/2025");
        lijst.addTodoItem("Studeren voor Java", 1, "20/12/2025");
        lijst.addTodoItem("Boodschappen doen", 5, "22/12/2025");
        lijst.addTodoItem("Kerstcadeaus kopen", 3, "18/12/2025");
        lijst.addTodoItem("Fitness", 10, "30/12/2025");

        lijst.show();
    }
}
