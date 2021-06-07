package UserRegistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class UserEmailValidator {
    public String email;
    public boolean status;
    Validator validator = new Validator();
    public void emailValidator(String email, boolean status){
        this.email = email;
        this.status = status;
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"nivi@gmail.com", true},
                {"nivedita12@gmail.com", true}});
    }

    @Test
    public void emailChecker(){
        boolean result = validator.validateEmail(email);
        Assert.assertEquals(this.status, result);
    }

}
