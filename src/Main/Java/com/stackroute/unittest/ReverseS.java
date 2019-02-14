package com.stackroute.unittest;

public class ReverseS {

    public String ReverseS(String indata){

        String outdata = "";


        for (int i = indata.length()-1;i>=0;i--){
            outdata += indata.charAt(i);
        }

        return outdata;
    }
}