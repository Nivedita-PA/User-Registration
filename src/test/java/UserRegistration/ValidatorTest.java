package UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    @Test
    public void givenFirstName_Whenproper_returnTrue(){
        Validator validator = new Validator();
        boolean status = validator.validateFirstName("Nivedita");
        Assert.assertTrue(status);
    }

    @Test
    public void givenFirstName_WhenShort_returnFalse(){
        Validator validator = new Validator();
        boolean status = validator.validateFirstName("nivedita");
        Assert.assertFalse(status);
    }
    @Test
    public void givenFirstName_WhenContain_SpecialCharachters_returnFalse(){
        Validator validator1 = new Validator();
        boolean status = validator1.validateFirstName("Nivedita1@");
        Assert.assertFalse(status);
    }


    @Test
    public void givenLastName_Whenproper_returnTrue(){
        Validator validator = new Validator();
        boolean status = validator.validateLastName("Pal");
        Assert.assertTrue(status);
    }

    @Test
    public void givenLastName_WhenShort_returnFalse(){
        Validator validator = new Validator();
        boolean status = validator.validateLastName("pal");
        Assert.assertFalse(status);
    }

    @Test
    public void givenLastName_WhenContain_SpecialCharachters_returnFalse(){
        Validator validator = new Validator();
        boolean status = validator.validateLastName("pal@");
        Assert.assertFalse(status);
    }

    @Test
    public void givenEmail_WhenProper_returnTrue(){
        Validator validator = new Validator();
        boolean status = validator.validateEmail("npal4661@gmail.com.in");
        Assert.assertTrue(status);
    }
    @Test
    public void givenEmail_WhenContain_twoAtTheRate_returnFalse(){
        Validator validator = new Validator();
        boolean status = validator.validateEmail("npal4661@@gmail.com");
        Assert.assertFalse(status);
    }
    @Test
    public void givenEmail_WhenContain_IrregularSequence_returnFalse(){
        Validator validator = new Validator();
        boolean status = validator.validateEmail("@npalgmail.com");
        Assert.assertFalse(status);
    }

    @Test
    public void givenPhoneNumber_WhenProper_returnTrue(){
        Validator validator = new Validator();
        boolean status = validator.validatePhoneNumber("91 8675640000");
        Assert.assertTrue(status);
    }

    @Test
    public void givenPhoneNumber_WhenContain_MoreThan_TenDigits_returnFalse(){
        Validator validator = new Validator();
        boolean status = validator.validatePhoneNumber("4599999999999");
        Assert.assertFalse(status);
    }
    @Test
    public void givenPassword_WhenProper_returnTrue(){
        Validator validator = new Validator();
        boolean status = validator.validatePassword("Nivedita1@");
        Assert.assertTrue(status);
    }
    @Test
    public void givenPassword_WhenContain_UnevenFormat_returnFalse(){
        Validator validator = new Validator();
        boolean status = validator.validateLastName("nivi@");
        Assert.assertFalse(status);
    }
}

