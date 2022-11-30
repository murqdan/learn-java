package mypackage.app;

import mypackage.data.Customer;
import mypackage.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Rafiq");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
