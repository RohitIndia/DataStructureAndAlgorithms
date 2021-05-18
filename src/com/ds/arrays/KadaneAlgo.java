package com.ds.arrays;

import java.util.Scanner;
//Kadane Algorithm to get the maximum sum of contigous subarr

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int not = Integer.parseInt(sc.nextLine());
        while(not>0){
            int length = Integer.parseInt(sc.nextLine());
            String str[] = sc.nextLine().split(" ");
            int arr[] = new int[length];
            for(int i =0;i<length;i++){
                arr[i]= Integer.parseInt(str[i]);
            }
            getMaxSum(arr);
            not--;
        }
    }
    public static void getMaxSum(int[] arr){
        int lsum = arr[0];
        int gsum = arr[0];
        for(int i =1 ;i<arr.length;i++){
            lsum = Math.max(arr[i],arr[i]+lsum);
            gsum = Math.max(gsum,lsum);
        }
        System.out.println(gsum);
    }
}
