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
    public boolean validationOfFirstName(String str) throws InvalidUserException {
        //regex is the string pattern that to be matched
        String regex = "^[A-Z]+[a-z]{2,}";
        if (!str.matches(regex))
            throw new InvalidUserException("Invalid FirstName");
        return str.matches(regex);
    }

    /**
     * this method is to verify the user entered last name
     * @param str
     * @return
     */

    public boolean validationOfLastName(String str) throws InvalidUserException {
        //regex is the string pattern that to be matched
        String regex = "^[A-Z]+[a-z]{2,}";
        if (!str.matches(regex))
            throw new InvalidUserException("Invalid LastName");
        return str.matches(regex);
    }

    /**
     * this method is to verify the user entered emailId
     * @param emailId
     * @return
     */
    public boolean validationOfEmailId(String emailId) throws InvalidUserException {
        //regex is the string pattern that to be matched
        String regex = "^[A-Za-z0-9-+._]+@[a-z0-9]+(.[a-z]{2,3})+$";
        if (!emailId.matches(regex))
            throw new InvalidUserException("Invalid EmailId");
        return emailId.matches(regex);
    }

    /**
     * this method is to check the user entered mobile number
     * @param mobileNumber
     * @return
     */
    public boolean validationOfMobileNumber(String mobileNumber) throws InvalidUserException {
        //regex is the string pattern that to be matched
        String regex = "^[0-9]{2}+ +[0-9]{10}$";
        if (!mobileNumber.matches(regex))
            throw new InvalidUserException("Invalid MobileNumber");
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

    /**
     * this method is to validate the password with atleast one Upper case
     * @param password
     * @return
     */
    public boolean validationOfPasswordRuleTwo(String password) {
        String regex = "^(?=.*[A-Z])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }

    /**
     * this method is to validate password with atleast one number
     * @param password
     * @return
     */
    public boolean validationOfPasswordRuleThree(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }

    /**
     * this method is to validate password with Exactly one special character
     * @param password
     * @return
     */
    public boolean validationOfPasswordRuleFour(String password) throws InvalidUserException {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[._@#$%&^*()+:?])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        if (!password.matches(regex))
            throw new InvalidUserException("Invalid Password");
        return (password.matches(regex));
    }

    public String validationOfAllDetails(UserDetails userDetails) {
        try {
            if ((this.validationOfFirstName(userDetails.firstName)) && (this.validationOfLastName(userDetails.lastName))
                    && (this.validationOfEmailId(userDetails.email)) && (this.validationOfMobileNumber(userDetails.mobile)) &&
                        (this.validationOfPasswordRuleFour(userDetails.password))){
                return "Happy";
            }
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        return "Sad";
    }
}
