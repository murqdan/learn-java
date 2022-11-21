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
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }

        System.out.println("I'm " + employee.name);

    }
}
