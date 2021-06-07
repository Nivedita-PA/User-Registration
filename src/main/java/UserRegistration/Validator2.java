package UserRegistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator2 { private static final String NamePattern = "^[A-Z][aA-zZ]{2,}";
    private static final String email =
            "^[a-z A-Z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})$";
    private static final String phoneNumber = "^[1-9]{2}[ ][0-9]{10}$";
    private static final String password = "^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})"
            + "(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";


    public boolean validateFirstName(String firstName) {
        try {
            if(firstName.length() == 0)
                throw new InvalidValidationException(InvalidValidationException.ExceptionType.Empty_Type, "Don't leave first name empty");
            return checkValidation(firstName, NamePattern);
        }catch(RuntimeException e){
        } throw new InvalidValidationException(InvalidValidationException.ExceptionType.Null_Type,"Please enter valid first name");
    }
    public boolean validateLastName(String lastName) {
        try {
            if(lastName.length() == 0)
                throw new InvalidValidationException(InvalidValidationException.ExceptionType.Empty_Type, "Don't leave last name empty");
            return checkValidation(lastName, NamePattern);
        }catch(NullPointerException e){
            throw new InvalidValidationException(InvalidValidationException.ExceptionType.Null_Type, "Please enter valid last name");
        }
    }
    public boolean validateEmail(String eMail) {
        try {
            if(eMail.length() == 0)
                throw new InvalidValidationException(InvalidValidationException.ExceptionType.Empty_Type, "Don't leave email address empty");
            return checkValidation(eMail, email);
        }catch(NullPointerException e){
            throw new InvalidValidationException("Please enter valid email");
        }
    }
    public boolean validatePhoneNumber(String phonenumber) {
        try {
            if(phonenumber.length() == 0)
                throw new InvalidValidationException(InvalidValidationException.ExceptionType.Empty_Type, "Don't leave phone number empty");
            return checkValidation(phonenumber, phoneNumber);
        } catch (RuntimeException e) {
            throw new InvalidValidationException("Please enter valid phone number");
        }
    }
    public boolean validatePassword(String passWord) {
        try {
            if(passWord.length() == 0)
                throw new InvalidValidationException(InvalidValidationException.ExceptionType.Empty_Type, "Don't leave password empty");
            return checkValidation(passWord, password);
        } catch (RuntimeException e) {
            throw new InvalidValidationException("Please enter valid password");
        }
    }
    public boolean checkValidation(String input, String inputPattern){
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}


