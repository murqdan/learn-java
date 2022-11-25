package mypackage.app;

import mypackage.data.Animal;
import mypackage.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Moci";

        animal.run();
    }
}
