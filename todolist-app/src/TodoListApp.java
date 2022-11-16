public class TodoListApp {
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodoList();
    }

    // Model

    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodoList();
    }

    public static void addTodoList(String todo) {
        // is the model full?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        // if full, resize array
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // add it to the position where the data array is null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 1; i <= 25; i++) {
            addTodoList("Todo-" + i);
        }

        showTodoList();
    }

    public static boolean removeTodoList(Integer number) {
        if(number - 1 >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            model[number - 1] = null;
            return true;
        }
    }

    // View

    public static void viewShowTodoList() {

    }

    public static void viewAddTodoList() {

    }

    public static void viewRemoveTodoList() {

    }


}
