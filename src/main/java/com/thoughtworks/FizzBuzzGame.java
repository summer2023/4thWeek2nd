package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            if (judge1stSpecialest(3, i)) {
                results.add("Fizz");
            }else if(judge1stSpecial(3,i)){
                if (judge2ndSpecial(5, i)) {
                    if (judge3rdSpecial(7, i)) {
                        results.add("FizzBuzzWhizz");
                    }else{
                        results.add("FizzBuzz");
                    }
                } else if (judge3rdSpecial(7, i)) {
                    results.add("FizzWhizz");
                }else{
                    results.add("Fizz");
                }
            } else if (judge2ndSpecial(5, i)) {
                if (judge3rdSpecial(7, i)) {
                    results.add("BuzzWhizz");
                }else {
                    results.add("Buzz");
                }
            } else if (judge3rdSpecial(7, i)) {
                results.add("Whizz");
            }else{
                results.add(String.valueOf(i));
            }

        }

    }

    public List<String> getResults() {
        return results;
    }

    public static boolean judge1stSpecial(int n1,int num) {
        boolean result = false;
        if (num%n1==0) {
            result = true;
        }
        return result;
    }
    public static boolean judge1stSpecialest(int n1,int num) {
        boolean result = false;
        if (String.valueOf(num).contains(String.valueOf(n1))) {
            result = true;
        }
        return result;
    }

    public static boolean judge2ndSpecial(int n2,int num) {
        boolean result=false;
        if (num % n2 == 0) {
            result =true;
        }
        return result;
    }

    public static boolean judge3rdSpecial(int n3, int num) {
        boolean result=false;
        if (num % n3 == 0) {
            result = true;
        }
        return result;

    }
}


