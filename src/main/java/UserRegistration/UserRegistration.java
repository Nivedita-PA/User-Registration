package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    private static final String First_Name = "[A-Z][a-z]{2,}";
    private static final String Last_Name = "[A-Z][a-z]{2,}";
    private static final String Email = "^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+."
            + "[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
    private static final String Number = "^[1-9]{2}[ ][0-9]{10}$";
    private static final String Password = "^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})"
            + "(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";

    //method validation
    public static boolean checkValidation(String input, String inputPattern)
    {
        Pattern p = Pattern.compile(inputPattern);
        if (input == null) {
            return false;
        }
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean isValidFirstName(String firstName)
    {
        return checkValidation(firstName, First_Name);
    }

    public static boolean isValidLastName(String lastName)
    {
        return checkValidation(lastName, Last_Name);
    }

    public static boolean emailValidation(String email)
    {
        return checkValidation(email, Email);
    }

    public static boolean mobileNoValidation(String number)
    {
        return checkValidation(number, Number);
    }

    public static boolean passwordValidation(String password)
    {
        return checkValidation(password, Password);
    }

    public static void main(String[] args) {

        //First Name
        System.out.println("Enter first name of user");
        String userName = sc.next();
        System.out.println(isValidFirstName(userName));

        //Last Name
        System.out.println("Enter last Name");
        String userLastName = sc.next();
        System.out.println(isValidLastName(userLastName));

        //Email ID
        System.out.println("Enter the email for user");
        String userEmail = sc.next();
        System.out.println(emailValidation(userEmail));

        //Mobile Number
        System.out.println("Enter the number for user");
        String userNo = sc.next();
        System.out.println(mobileNoValidation(userNo));

        //Password
        System.out.println("Enter the password for user");
        String userPassword = sc.next();
        System.out.println(passwordValidation(userPassword));
        
    }

}
