package com.stackroute.unittest;

public class nIteration {

    public long nIteration (int indata){

        String data = new String(),out ="";
        int num;
        System.out.print("Enter some number : ");

        num = indata;

        for (int i =1 ;i<=num;i++)
            for(int j=1;j<=i;j++){
                out+= i;
            }

        return (Long.parseLong(out));

    }
}