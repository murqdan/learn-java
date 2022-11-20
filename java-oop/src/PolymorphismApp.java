public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Rafiq");
        employee.sayHello("Paiman");

        employee = new Manager("Rafiq");
        employee.sayHello("Paiman");

        employee = new VicePresident("Rafiq");
        employee.sayHello("Paiman");
    }
}
