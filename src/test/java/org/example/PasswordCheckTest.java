package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

        @Test
    void IsPasswordLengthValid_returnFalse_whenLengthIsLessThan8() {
        String password = "short";
        boolean actual = PasswordCheck.isPasswordLengthValid(password);
        assertFalse(actual);

    }
    @Test
    void IsPasswordLengthValid_returnTrue_whenLengthIsMoreThan8() {
        String password = "looooooong";
        boolean actual = PasswordCheck.isPasswordLengthValid(password);
        assertTrue(actual);
    }
    @Test
    void IsPasswordLengthValid_returnTrue_whenLength8() {
        String password = "llllllll";
        boolean actual = PasswordCheck.isPasswordLengthValid(password);
        assertTrue(actual);
    }
    @Test
    void IsPasswordLengthValid_returnFalse_whenLengthIs0() {
        String password = "";
        boolean actual = PasswordCheck.isPasswordLengthValid(password);
        assertFalse(actual);
    }

    @Test
    void CheckPasswordDigits_returnTrue_whenContainsDigits() {
        String password = "12345";
        boolean actual = PasswordCheck.checkPasswordDigits(password);
        assertTrue(actual);
    }
    @Test
    void CheckPasswordDigits_returnFalse_whenDoesNotContainDigits() {
        String password = "abrakadabra";
        boolean actual = PasswordCheck.checkPasswordDigits(password);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordDigits_returnTrue_whenContainDigit() {
        String password = "abrakadabra1";
        boolean actual = PasswordCheck.checkPasswordDigits(password);
        assertTrue(actual);
    }
    @Test
    void CheckPasswordDigits_returnFalse_whenContainCharactersAndQuestionMark() {
        String password = "abrakadabra?";
        boolean actual = PasswordCheck.checkPasswordDigits(password);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordUpperLowerCases_returnTrue_whenContainsUpperCases() {
        String password = "Abrakadabra";
        boolean actual = PasswordCheck.checkPasswordCases(password);
        assertTrue(actual);
    }
    @Test
    void CheckPasswordUpperLowerCases_returnFalse_whenDoesNotContainUpperCases() {
        String password = "abrakadabra";
        boolean actual = PasswordCheck.checkPasswordCases(password);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordLowerUpperCases_returnFalse_whenDoesNotContainLowerCases() {
        String password = "ABRAKADABRA";
        boolean actual = PasswordCheck.checkPasswordCases(password);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordLowerUpperCases_returnFalse_whenContainsOthers() {
        String password = "@@@@@@@@@";
        boolean actual = PasswordCheck.checkPasswordCases(password);
        assertFalse(actual);
    }

    String[] commonPasswords = {"Password1", "Aa345678", "Password3"};
    @Test
    void CheckPasswordsCommonlyUsed_returnFalse_whenIs12345678() {
        String password = "Aa345678";
        boolean actual = PasswordCheck.checkPasswordsCommonlyUsed(password, commonPasswords);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordsCommonlyUsed_returnTrue_whenGoodExample() {
        String password = "hJ!5zLw9*pDq";
        boolean actual = PasswordCheck.checkPasswordsCommonlyUsed(password, commonPasswords);
        assertTrue(actual);
    }
    @Test
    void CheckPasswordsCommonlyUsed_returnFalse_whenContainsPassword() {
        String password = "Password2";
        boolean actual = PasswordCheck.checkPasswordsCommonlyUsed(password, commonPasswords);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordsCommonlyUsed_returnFalse_whenContains_password() {
        String password = "passWord2";
        boolean actual = PasswordCheck.checkPasswordsCommonlyUsed(password, commonPasswords);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordsCommonlyUsed_returnFalse_whenContainsPasswort() {
        String password = "Passwort";
        boolean actual = PasswordCheck.checkPasswordsCommonlyUsed(password, commonPasswords);
        assertFalse(actual);
    }
    @Test
    void CheckPasswordsCommonlyUsed_returnFalse_whenContainsThreeConsecutiveDigits() {
        String password = "12345";
        boolean actual = PasswordCheck.checkPasswordsCommonlyUsed(password, commonPasswords);
        assertFalse(actual);
    }
    @Test
    void ContainsThreeConsecutiveDigits_returnFalse_whenContains12345() {
        String password = "12345";
        boolean actual = PasswordCheck.containsThreeConsecutiveDigits(password);
        assertFalse(actual);
    }
    @Test
    void ContainsThreeConsecutiveDigits_returnTrue_whenDoesNotContainConsecutiveDigits() {
        String password = "awfgklfkg321";
        boolean actual = PasswordCheck.containsThreeConsecutiveDigits(password);
        assertTrue(actual);
    }




    }

//    @Test
//    void checkPassword() {
//    }
