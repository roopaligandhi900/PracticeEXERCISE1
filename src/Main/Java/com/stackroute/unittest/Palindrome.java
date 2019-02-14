package com.stackroute.unittest;

public class Palindrome {
    public String Palindrome(long indata)
    {

        String data = "";
        String ext = "";
        long reverse=0 ,num,temp,d,sum=0;
        String outdata = "not a palindrome";

        num = indata;
        temp = num;

        while(temp != 0)
        {
            reverse = reverse * 10;
            d=temp%10;
            if(d%2==0){
                sum+=d;
            }
            reverse = reverse + d;
            temp = temp/10;

        }

        System.out.println(reverse);

        if (num == reverse){

            outdata = "Palindrome";

            if(sum > 25){
                ext = " Number is greater than 25";
            }
            else{
                ext = " Number is less than 25";
            }
            System.out.println(data+" is palindrome and sum of even numbers is"+ext);
        }
        else {
            System.out.println(data+" is not palindrome");
        }

        return (outdata);

    }

}
