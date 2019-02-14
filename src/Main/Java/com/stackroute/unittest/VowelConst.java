package com.stackroute.unittest;

public class VowelConst {

    public String VowelConst(String indata){
        String data = "";
        String outstr = "";
        int numflag = 0;

        data = indata;
        for (int i=0; i<data.length(); i++){
            char c = data.charAt(i);
            if (Character.isDigit(c)){
                System.out.println("Invalid string");
                numflag =1;
                return ("Invalid String");
            }
            else {
                switch (c){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u': outstr += "Vowel ";break;
                    case ' ': break;
                    default : outstr += "Consonant ";

                }
            }
        }

        if(numflag !=   1)
            return (outstr);

        return ("error");

    }
}