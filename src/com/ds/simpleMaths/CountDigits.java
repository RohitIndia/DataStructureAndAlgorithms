package com.ds.simpleMaths;

public class CountDigits {
    public static void main(String[] args) {

    }
    public static int countDigit(int num){
        int n =num;
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static int countDigitRecursive(int num){
       if(num==0){
           return 0;
       }
       return 1+countDigitRecursive(num/10);
    }
}
