package com.password;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestPassword {
    @Test
    void TestPasswordLength() {
        PasswordValidator pv = new PasswordValidator();
        Assert.assertEquals(true, pv.isValid("Abc12"));

    }
}
