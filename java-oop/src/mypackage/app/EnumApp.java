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
    }
}
