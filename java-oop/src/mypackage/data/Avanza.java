package mypackage.data;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 3;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return false;
    }
}
