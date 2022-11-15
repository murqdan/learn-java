public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Muhammad Rafiqul", "Adnan");
        sayHello("Elon", "Musk");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
