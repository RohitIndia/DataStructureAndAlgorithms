package com.ds.simpleMaths;



public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(GCDOfTwoNumbers(100,200));
    }

    public static int GCDOfTwoNumbers(int a, int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static int euclidAlgoForGCD(int a, int b){
    while(a!=b){
        if(a>b){
            a = a-b ;
        }else{
            b = b-a;
        }
    }
    return a;
    }

    public static int efficientEuclid(int a, int b){
        if(b==0){
            return a;
        }
        return efficientEuclid(b, a%b);
    }
}
