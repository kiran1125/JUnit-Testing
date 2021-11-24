package com.bridgelabz;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validationOfFirstName("kiran");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        try {
            userRegistration.validationOfLastName("kiran");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }
}
