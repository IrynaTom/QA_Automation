package com.task;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ира on 18.02.2016.
 */

public class Validation {
    private static final String email_valid = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean isValidName(String name) {
        if (name.isEmpty() || name.length() < 4) {
            System.out.println("The name is required field and more 4");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isValidStringAge(String age) {

        if (age.isEmpty()  ) {
            System.out.println("The age is required field");
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean isValidAge(int age) {

        if ( age > 100 || age < 0 ) {
            System.out.println("The age is more 0 and less 100");
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean isValidEmail(String email){
        Boolean em= email.matches(email_valid);
        if(em==false){
            System.out.println("Email is invalid");
            return false;
        }
        else{
            return true;
        }
    }

}
