package com.bridgelabz;

/**
 * This class is to verify the user information which is entered in the correct pattern or not
 */
public class UserRegistration {
    /**
     * this method is to verify or validate the user first name
     * @param str
     * @return true or false
     */
    public boolean validationOfFirstName(String str) {
        //regex is the string pattern that to be matched
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }

    public boolean validationOfLastName(String str) {
        //regex is the string pattern that to be matched
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }
    public boolean validationOfEmailId(String emailId) {
        String regex = "^[A-Za-z0-9-+._]+@[a-z0-9]+(.[a-z]{2,3})+$";
        return emailId.matches(regex);
    }
}
