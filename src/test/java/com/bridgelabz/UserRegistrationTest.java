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
    void givenEmailIdValidatingWithRegexReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfEmailId("makamkiran95@@gmail.com"));
    }

    @Test
    void givenMobileNumberValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfMobileNumber("91 9666069291"));
    }

    @Test
    void givenMobileNumberValidatingWithRegexReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfMobileNumber("919666069291"));
    }
    @Test
    void givenPasswordValidatingWithMinEightCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleOne("kiran123"));
    }
    @Test
    void givenPasswordValidatingWithMinEightCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleOne("kin123"));
    }
    @Test
    void givenPasswordValidatingWithAtleastOneCapitalLetterReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleTwo("Kiran123"));
    }
    @Test
    void givenPasswordValidatingWithoutOneCapitalLetterReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleTwo("kiran123"));
    }
    @Test
    void givenPasswordValidatingWithAtLeastOneNumberReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleThree("Kiran123"));
    }
    @Test
    void givenPasswordValidatingWithoutOneNumberReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleTwo("kirankiran"));
    }
    @Test
    void givenPasswordValidatingWithAtLeastOneSpecialCharacterReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleFour("Kiran123@"));
    }
    @Test
    void givenPasswordValidatingWithoutOneSpecialCharacterReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleTwo("kirankiran12234"));
    }
}
