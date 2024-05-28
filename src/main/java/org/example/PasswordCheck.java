package org.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


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




    public static boolean checkPasswordsCommonlyUsed(String password, String [] commonPasswords) {

        for (String commonPassword : commonPasswords) {
            if (commonPassword.equals(password)) {
                return false;
            }
        }

        if (password.contains("Password")) {
            return false;
        } else if (password.toLowerCase().contains("password")) {
            return false;
        } else if (password.toLowerCase().contains("passwort")) {
            return false;
        }
//        else if () {
//            return false;
//        }

        return true;

    }

    public static boolean containsThreeConsecutiveDigits(String password) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}