package mypackage.app;

import mypackage.data.Tesla;

public class CarApp {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();

        tesla.drive();
        System.out.println(tesla.getTier());
    }
}
