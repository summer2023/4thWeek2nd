package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {

    }

    public List<String> getResults() {
        return results;
    }

    public static String judge1stSpecial(int n1,int num) {
        String result = null;
        if (String.valueOf(num).contains(String.valueOf(n1))||num%n1==0) {
            result = "Fizz";
        }else{
            result = String.valueOf(num);
        }
        return result;
    }

    public static String judge2ndSpecial(int n2,int num) {
        String result=null;
        if (num % n2 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(num);
        }
        return result;
    }

    public static String judge3rdSpecial(int n3, int num) {
        String result=null;
        if (num % n3 == 0) {
            result = "Whizz";
        } else {
            result = String.valueOf(num);
        }
        return result;

    }
}


