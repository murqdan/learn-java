public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Rafiq");
        manager.sayHello("Tukimin");

        var vp = new VicePresident("Suparman");
        vp.sayHello("Budi");
    }
}
