package mypackage.app;

import mypackage.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        Avanza avanza = new Avanza();

        avanza.drive();
        System.out.println(avanza.getTier());
    }
}
