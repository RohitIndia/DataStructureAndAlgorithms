package com.ds.simpleMaths;

public class Factorial {
    public static void main(String[] args) {
        // n! = n*n-1*n-2..1;
    }

    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
