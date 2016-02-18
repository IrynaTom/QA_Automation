package com.task;

/**
 * Created by Ира on 18.02.2016.
 */
public class Validation {
    public static boolean isValidName(String name) {
        if (name.isEmpty() || name.length() < 4) {
            System.out.println("The name is required field and more 4");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isValidAge(String age) {
        int temp =Integer.parseInt(age);
        if (age.isEmpty() || temp > 100 || temp < 0 ) {
            System.out.println("The age is required field and more 0 and less 100");
            return false;
        }
        else{
            return true;
        }
    }
}
