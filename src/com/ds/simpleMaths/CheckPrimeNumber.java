package com.ds.simpleMaths;

public class CheckPrimeNumber {
    public static void main(String[] args) {

    }
    public static boolean isPrimeBasicTechnique(int num){
        if(num==1) return false;
        for(int i=0;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeEfficientTechnique(int num){
        if(num==1)return false;
        if(num ==2 || num==3) return true;
        if(num%2==0 || num%3==0 ) return false;

        for(int i=5 ;i*i<num;i=i+6){
            if(num/i==0 || num/i+2==0)return false;
        }
        return true;
    }

}
