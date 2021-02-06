package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserValidationTest {

    @Test
    public void firstNameIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.firstNameIsValid.validate("Suraj");
        Assertions.assertTrue(result);
    }
    @Test
    public void firstNameIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.firstNameIsInValid.validate("suraj");
        Assertions.assertFalse(result);
    }
    @Test
    public void lastNameIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.lastNameIsValid.validate("Temkar");
        Assertions.assertTrue(result);
    }
    @Test
    public void lastNameIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.lastNameIsInValid.validate("Te@mkar");
        Assertions.assertFalse(result);
    }
    @Test
    public void emailIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.emailIsValid.validate("Temkar@92gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void emailIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.emailIsInValid.validate("Te@.add.");
        Assertions.assertFalse(result);
    }
    @Test
    public void mobileNumberIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.mobileNumberIsValid.validate("91 9503076240");
        Assertions.assertTrue(result);
    }
    @Test
    public void mobileNumberIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.mobileNumberIsInValid.validate("45466786886867");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.passwordIsValid.validate("surajtemkar");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.passwordIsInValid.validate("suraj");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsValidSecond() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.passwordIsValidSecond.validate("Suraj@123");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsInValidSecond() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.passwordIsInValidSecond.validate("sueah567");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsValidThree() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.passwordIsValidThree.validate("Suraj@123");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsInValidThree() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.passwordIsInValidThree.validate("Te@mkar");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsValidForth() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.passwordIsValidForth.validate("Suraj@123");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsInValidForth() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.passwordIsInValidForth.validate("Te@mkar");
        Assertions.assertFalse(result);
    }

}


