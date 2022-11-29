package mypackage.app;

import mypackage.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Rafiq", "secret");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("eko"));
        System.out.println(new LoginRequest("eko", "rahasia"));
    }
}
