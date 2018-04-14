package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGameTest {

    @Test
    public void should_return_Fizz_when_have_3() {
        int n1 = 3;
        int n2 = 13;
        int n3 = 15;

        Assert.assertEquals("Fizz",FizzBuzzGame.judge1stSpecial(3,n1));
        Assert.assertEquals("Fizz",FizzBuzzGame.judge1stSpecial(3,n2));
        Assert.assertEquals("Fizz",FizzBuzzGame.judge1stSpecial(3,n3));

    }
}
