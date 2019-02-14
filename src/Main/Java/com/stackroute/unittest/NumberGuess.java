package com.stackroute.unittest;

public class NumberGuess {
    public String NumberGuess(int num,int value){

        if (num<value)
            return ("less");
        else if (num>value)
            return("more");
        else
            return ("equal");
    }
}