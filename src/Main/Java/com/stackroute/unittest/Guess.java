package com.stackroute.unittest;

public class Guess {

    public String Guess (char indata){

        if(Character.isUpperCase(indata))
            return ("Upper case");
        else if (Character.isLowerCase(indata))
            return ("Lower case");
        else if(Character.isDigit(indata))
            return ("Number");
        else
            return ("Special Character");

    }

}
