package mypackage.data;

public class Avanza implements Car, IsMaintenance{
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
}
