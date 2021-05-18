package com.ds.arrays;


// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class SmallestNumber {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int res = 1;
        int size = A.length;
        int i =0;
        while(i<size){
            if(A[i] == res){
                res++;
            }else if(A[i]>res){
                break;
            }
            i++;
        }
        return res;
    }


    public static int solutionsss(int[] A, int K, int L) {
        // write your code in Java SE 8
        int[] sum = new int[A.length];
        sum[0] = A[0];
        if(K+L> A.length){
            return -1;
        }
        for(int i =1; i< A.length; i++){
            sum[i]= sum[i-1]+A[i];
        }
        int max = -1;
        int k=0, l=0;
        for(int i=0;i<A.length-(K-1); ++i){
            if(i>0){
                k = sum[i+K-1]-sum[i-1];
            }else{
                k = sum[i+K-1];
            }
            for(int j = i+K; j<A.length-(L-1); ++j){
                if(j>0){
                    l = sum[j+L-1]-sum[j-1];
                }else{
                    l = sum[j+L-1];
                }
                max = Math.max(max, k+l);
            }
        }
        return max;
    }

    public static void main(String arr[]){
        int ar[] = {6, 1, 4, 6, 3, 2, 7, 4};
        int a = solutionsss(ar, 3,2);
        System.out.println(a);

    }
}

