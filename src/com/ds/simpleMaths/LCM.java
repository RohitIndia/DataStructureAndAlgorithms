package com.ds.simpleMaths;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcmOfAGivenNumbers(4,6));
    }

    public static int lcmOfAGivenNumbers(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
    }
}
