package com.example.jdolan.lab_3;

import android.widget.EditText;

import java.util.regex.Pattern;

/**
 * Created by jdolan on 16/02/16.
 */
public class my_validation {

    // Validation criteria
    private static final String PHONE_REGEX = "^(0|\\+\\d{3}|00\\d{3})8[3-8]\\d{7}$" ;//^(08[3-8]|\+\d{3}8[3-7]|00\d{3}8[3-7])\d{7}$

    // Error Messages
    private static final String REQUIRED_MSG = "required";
    private static final String PHONE_MSG = "Invalid Phone Number";


    // call this method when you need to check phone number validation
    public static boolean isPhoneNumber(String phoneno, boolean required) {
        return isValid(phoneno, PHONE_REGEX, PHONE_MSG, required);
    }

    // return true if the input field is valid, based on the parameter passed
    public static boolean isValid(String phoneno, String regex, String errMsg, boolean required) {

        String text = phoneno.trim();
        // clearing the error, if it was previously set by some other values
        //editText.setError(null);

        // text required and editText is blank, so return false
        //if ( required && !hasText(phoneno) ) return false;

        // pattern doesn't match so returning false
        if (required && !Pattern.matches(regex, text)) {
           // editText.setError(errMsg);
            return false;
        };

        return true;
    }

    // check the input field has any text or not
    // return true if it contains text otherwise false
    public static boolean hasText(EditText editText) {

        String text = editText.getText().toString().trim();
        editText.setError(null);

        // length 0 means there is no text
        if (text.length() == 0) {
            editText.setError(REQUIRED_MSG);

            return false;
        }

        return true;
    }
}
