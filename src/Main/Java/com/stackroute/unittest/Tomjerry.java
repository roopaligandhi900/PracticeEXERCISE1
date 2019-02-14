package com.stackroute.unittest;

public class Tomjerry {

    public String tomjerry (int indata) {
        int data;
        int a;

        data = indata;
        a = data;

        if (a >= 20 && a <= 30) {
            if (a % 2 != 0) {
                return ("Tom");
            } else {
                return ("Jerry");
            }
        }
        return ("Error");
    }
}