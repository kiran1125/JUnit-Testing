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
}
