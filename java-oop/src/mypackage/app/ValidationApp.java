package mypackage.app;

import mypackage.data.LoginRequest;
import mypackage.error.ValidationException;
import mypackage.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Data null : " + exception.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }
    }
}
