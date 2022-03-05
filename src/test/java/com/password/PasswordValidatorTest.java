package com.password;

import org.junit.Assert;
import org.junit.Test;

 public class PasswordValidatorTest {
    @Test
    public void testPasswordLength() {
        PasswordValidator pv = new PasswordValidator();
        Assert.assertEquals(true, pv.isValid("ABC12"));

    }
}
