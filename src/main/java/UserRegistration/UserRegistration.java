package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    private static final String First_Name = "[A-Z][a-z]{2,}";
    private static final String Last_Name = "[A-Z][a-z]{2,}";

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

    public static void main(String[] args) {

        //First Name
        System.out.println("Enter first name of user");
        String userName = sc.next();
        System.out.println(isValidFirstName(userName));

        //Last Name
        System.out.println("Enter last Name");
        String userLastName = sc.next();
        System.out.println(isValidLastName(userLastName));
        
    }

}
