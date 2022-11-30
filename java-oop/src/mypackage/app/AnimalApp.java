package mypackage.app;

import mypackage.annotation.Fancy;
import mypackage.data.Animal;
import mypackage.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Moci";

        animal.run();
    }
}
