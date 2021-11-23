package com.bridgelabz;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails("Kiran","Karthik","mkamkiran95@gmail.com","91 9666069291","9966988298Ki@");
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(userRegistration.validationOfAllDetails(userDetails));
    }
}
