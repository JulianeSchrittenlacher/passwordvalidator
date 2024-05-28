package org.example;

public class PasswordCheck {

    public static void main(String[] args) {

    }

    public static boolean checkPasswordLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkPassword(String password) {}
}
