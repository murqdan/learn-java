package mypackage.app;

import mypackage.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Rafiq", "Rafiq");
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
