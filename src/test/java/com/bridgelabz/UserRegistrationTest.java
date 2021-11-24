package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    @Test
    void givenFirstNameWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertTrue(userRegistration.validationOfFirstName("Kiran"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenFirstNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertFalse(userRegistration.validationOfFirstName("kiran"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenLastWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertTrue(userRegistration.validationOfLastName("Kiran"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenLastNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertFalse(userRegistration.validationOfLastName("kiran"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenEmailIdValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertTrue(userRegistration.validationOfEmailId("makamkiran95@gmail.com"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenEmailIdValidatingWithRegexReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertFalse(userRegistration.validationOfEmailId("makamkiran95@@gmail.com"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenMobileNumberValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertTrue(userRegistration.validationOfMobileNumber("91 9666069291"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenMobileNumberValidatingWithRegexReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertFalse(userRegistration.validationOfMobileNumber("919666069291"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
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
        try {
            Assertions.assertTrue(userRegistration.validationOfPasswordRuleFour("Kiran123@"));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }
    @Test
    void givenPasswordValidatingWithoutOneSpecialCharacterReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleTwo("kirankiran12234"));
    }
    @ParameterizedTest
    @ValueSource (strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com",
            "abc-100@abc.net", "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    void givenEmailIdsShouldReturnTrue(String str){
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertTrue(userRegistration.validationOfEmailId(str));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }
    @Test
    void givenUserDetailsShouldReturnHappy(){
        UserDetails userDetails = new UserDetails("Kiran","Karthik","mkamkiran95@gmail.com","91 9666069291","9966988298Ki@");
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Happy",userRegistration.validationOfAllDetails(userDetails));
    }
    @Test
    void givenUserDetailsShouldReturnSad(){
        UserDetails userDetails = new UserDetails("Kiran","thik","mkamkiran95@gmail.com","91 9666069291","9966988298Ki@");
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Sad",userRegistration.validationOfAllDetails(userDetails));
    }
}
