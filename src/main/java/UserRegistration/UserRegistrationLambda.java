package UserRegistration;


import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface checkFunction {
    boolean check(String input);

//   public static void showResult(checkFunction func, String input) {
//       Scanner sc = new Scanner(System.in);
//       input = sc.next();
//       System.out.println("Result for the given input" +func.check(input));
//   }
}

public class UserRegistrationLambda {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        checkFunction firstName = ((input) -> (Pattern.compile("^[A-Z][a-zA-Z]{2,}").matcher(input).matches()));
        checkFunction lastName = ((input) ->  (Pattern.compile("^[A-Z][a-zA-Z]{2,}").matcher(input).matches()));
        checkFunction email = (input) -> (Pattern.compile("^[a-z A-Z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]" +
                "{2,3}([.][a-z A-Z]{2})$").matcher(input).matches());
        checkFunction password = (input) -> (Pattern.compile("^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})"
                + "(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$").matcher(input).matches());
        checkFunction phoneNum = (input) -> (Pattern.compile("^[1-9]{2}[ ][0-9]{10}$").matcher(input).matches());


        System.out.println("First name results: "+firstName.check("Neha"));
        System.out.println("Last name results: "+lastName.check("Singh"));
        System.out.println("Email results: "+email.check("npal4661@gmail.com.in"));
        System.out.println("Password name results: "+password.check("Nivedita1"));
        System.out.println("PhoneNumber results: "+phoneNum.check("918899009011"));

    }
}

