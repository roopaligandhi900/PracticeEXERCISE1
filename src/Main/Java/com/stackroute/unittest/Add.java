
package com.stackroute.unittest;

public class Add {

    public int Add(String indata) {

        String data = new String();
        int sum = 0;
        String[] arr;

        data = indata;
        arr = data.split(" ");

        for (String x : arr) {
            sum += Integer.parseInt(x);
        }

        return sum;
    }



}


