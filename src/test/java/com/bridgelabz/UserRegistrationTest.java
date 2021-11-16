package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstNameWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfFirstName("Kiran"));
    }

    @Test
    void givenFirstNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfFirstName("kiran"));
    }

    @Test
    void givenLastWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfLastName("Kiran"));
    }

    @Test
    void givenLastNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfLastName("kiran"));
    }

    @Test
    void givenEmailIdValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfEmailId("makamkiran95@gmail.com"));
    }
    @Test
    void givenEmailIdValidatingWithRegexReturnsFalse(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfEmailId("makamkiran95@@gmail.com"));
    }
}
