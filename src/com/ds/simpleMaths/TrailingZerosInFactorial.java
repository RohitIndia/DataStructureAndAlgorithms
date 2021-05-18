package com.ds.simpleMaths;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.println(simpleApproach(10)); // this sol having issues with overflow , coz just for 20! count will be 20 zeros , so wont be able to store fact.
        System.out.println(efficientApproach(10));
    }

    public static int simpleApproach(int n){
        int fact =1;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        int count =0;

        while(fact%10==0){
            count++;
            fact = fact/10;
        }
        return count;
    }

    // Just count the number of 5 and 2 pairs , which will create zeros, so easiest way to find every 5th digit
    // formula will be [n/5]+[n/25]+[n/125] coz there are some number for which 2 times 5 factor like for 25 n so on.
    public static int efficientApproach(int n){
        int count =0;
        for(int i=5 ; i<=n; i=i*5){
            count = count+ n/i;
        }
        return count;
    }

}
