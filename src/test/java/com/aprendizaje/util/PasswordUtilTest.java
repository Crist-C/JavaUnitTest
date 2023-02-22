package com.aprendizaje.util;

import org.junit.Test;

import static com.aprendizaje.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakWhenHasLessThan8Letters() {
        assertEquals(WEAK, PasswordUtil.assessPasword("1234567"));
    }

    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(WEAK, PasswordUtil.assessPasword("asdasdasdasd"));
    }

    @Test
    public void mediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPasword("abcAS34567"));
    }

    @Test
    public void mediumWhenHasLettersNumbersSymbols() {
        assertEquals(STRONG, PasswordUtil.assessPasword("@1234ghjkl!"));
    }
}