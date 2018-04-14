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

    @Test
    public void should_return_Buzz_when_have_5() {
        int n1=5;
        int n2=20;

        Assert.assertEquals("Buzz",FizzBuzzGame.judge2ndSpecial(5,n1));
        Assert.assertEquals("Buzz",FizzBuzzGame.judge2ndSpecial(5,n2));
    }

    @Test
    public void should_return_Whizz_when_have_7() {
        int n1=7;
        int n2=14;

        Assert.assertEquals("Whizz",FizzBuzzGame.judge3rdSpecial(7,n1));
        Assert.assertEquals("Whizz",FizzBuzzGame.judge3rdSpecial(7,n2));
    }
}
