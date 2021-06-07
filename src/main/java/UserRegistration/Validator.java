package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String NamePattern = "^[A-Z][a-zA-Z]{2,}";
    private static final String email =
            "^[a-z A-Z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})$";
    private static final String phoneNumber = "^[1-9]{2}[ ][0-9]{10}$";
    private static final String password = "^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})"
            + "(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";


    public boolean validateFirstName(String firstName){
        return checkValidation(firstName, NamePattern);
    }

    public boolean validateLastName(String lastName){
        return checkValidation(lastName, NamePattern);
    }
    public boolean validateEmail(String eMail){
        return checkValidation(eMail, email);
    }
    public boolean validatePhoneNumber(String phonenumber){
        return checkValidation(phonenumber, phoneNumber);
    }
    public boolean validatePassword(String passWord){
        return checkValidation(passWord,password);
    }
    public boolean checkValidation(String input, String inputPattern){
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
