public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Rafiq";
        manager.sayHello("Tukimin");

        var vp = new VicePresident();
        vp.name = "Suparman";
        vp.sayHello("Budi");
    }
}
