package com.task;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

}
