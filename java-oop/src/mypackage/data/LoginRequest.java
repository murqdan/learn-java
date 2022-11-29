package mypackage.data;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("make object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    public void sayHello() {
        System.out.println("Hello " + this.username);
    }
}
