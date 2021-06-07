package UserRegistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserValidatorTest2 {

    @Test
    public void givenFirstName_whenEmpty__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        try {
            validator2.validateFirstName(" ");
        } catch (InvalidValidationException e) {
            Assert.assertEquals(InvalidValidationException.ExceptionType.Empty_Type, e.type);
        }
    }
    @Test
    public void givenFirstName_whenNull__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        try {
            boolean status = validator2.validateFirstName(null);
            Assert.assertTrue(status);
        }catch (RuntimeException e){
            Assert.assertEquals("Please enter valid first name", e.getMessage());
        }
    }

    @Test
    public void givenLastName_whenNull__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        ExpectedException expectedRule = ExpectedException.none();
        expectedRule.expect(InvalidValidationException.class);
        try {
            boolean status = validator2.validateLastName(null);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_whenEmpty__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        ExpectedException expectedRule = ExpectedException.none();
        expectedRule.expect(InvalidValidationException.class);
        try {
            boolean status = validator2.validateLastName(" ");
            Assert.assertTrue(status);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_whenNull__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        try {
            boolean status = validator2.validateEmail(null);
            Assert.assertTrue(status);
        }catch (RuntimeException e){
            Assert.assertEquals("Please enter valid email", e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenEmpty__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        try {
            boolean status = validator2.validateEmail(" ");
        }catch (RuntimeException e){
            Assert.assertEquals("Don't leave email address empty", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_whenNull__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        try {
            boolean status = validator2.validatePhoneNumber(null);
        }catch (RuntimeException e){
            Assert.assertEquals(InvalidValidationException.class, e.getClass());
        }
    }

    @Test
    public void givenPassword_whenNull__returnInvalidationException() {
        Validator2 validator2 = new Validator2();
        ExpectedException expectedRule = ExpectedException.none();
        expectedRule.expect(InvalidValidationException.class);
        try {
            validator2.validatePassword(null);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

}
