package com.task;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by 1512 on 26.02.2016.
 */
public class EmailValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public static boolean isValidEmail(String email) {

        if ( validate(email)) {
            System.out.println("The email is not valid");
            return false;
        }
        else{
            return true;
        }
    }


    public boolean validate(final String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
