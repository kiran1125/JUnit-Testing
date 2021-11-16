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

    /**
     * this method is to verify the user entered last name
     * @param str
     * @return
     */

    public boolean validationOfLastName(String str) {
        //regex is the string pattern that to be matched
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }

    /**
     * this method is to verify the user entered emailId
     * @param emailId
     * @return
     */
    public boolean validationOfEmailId(String emailId) {
        //regex is the string pattern that to be matched
        String regex = "^[A-Za-z0-9-+._]+@[a-z0-9]+(.[a-z]{2,3})+$";
        return emailId.matches(regex);
    }

    /**
     * this method is to check the user entered mobile number
     * @param mobileNumber
     * @return
     */
    public boolean validationOfMobileNumber(String mobileNumber) {
        //regex is the string pattern that to be matched
        String regex = "^[0-9]{2}+ +[0-9]{10}$";
        return mobileNumber.matches(regex);
    }

    /**
     * this is to check the password with minimum eight characters
     * @param password
     * @return
     */
    public boolean validationOfPasswordRuleOne(String password) {
        String regex = "^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
}
