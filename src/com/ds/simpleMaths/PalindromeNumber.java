package com.ds.simpleMaths;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(checkPalindrome(9));
    }

    public static boolean checkPalindrome(int num){
        int n =num;
        int rev =0;
        while(n>0){
            rev =(rev*10)+n%10;
            n=n/10;
        }
        return (num==rev);
    }
}
