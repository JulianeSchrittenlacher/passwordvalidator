package org.example;

public class PasswordCheck {

    public static void main(String[] args) {

    }

    public static boolean isPasswordLengthValid(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }

    }


   public static boolean checkPasswordDigits(String password) {
        if (password.matches(".*\\d.*")) {
            return true;
        }
        return false;
   }

    public static boolean checkPasswordCases(String password) {
        if (password.matches(".*[A-Z].*")) {
            if (password.matches(".*[a-z].*")) {
                return true;
            }
        }
        return false;
    }

//
//    public static boolean checkPasswordsCommonlyUsed(String password, String [] commonPasswords) {
//        boolean result = true;
//
//    }
}