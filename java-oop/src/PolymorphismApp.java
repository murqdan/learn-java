public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Rafiq");
        employee.sayHello("Paiman");

        employee = new Manager("Rafiq");
        employee.sayHello("Paiman");

        employee = new VicePresident("Rafiq");
        employee.sayHello("Paiman");

        introduce(new Employee("Gagah"));
        introduce(new Manager("Gigih"));
        introduce(new VicePresident("Guguh"));
    }

    static void introduce(Employee employee) {
        System.out.println("I'm " + employee.name);
    }
}
