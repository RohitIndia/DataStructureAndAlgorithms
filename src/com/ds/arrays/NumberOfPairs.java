package com.ds.arrays;

import java.util.Scanner;

public class NumberOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int not = sc.nextInt();

        while(not>0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            for(int i =0;i<m;i++){
                arr1[i] = sc.nextInt();
            }
            for(int i =0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            NumberOfPairs(arr1,arr2,m,n);
            not--;
        }

    }

    public static void NumberOfPairs(int[] arr1,int[] arr2,int m,int n){
        int count = 0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                double xtoy =  Math.pow(arr1[i],arr2[j]);
                double ytox =  Math.pow(arr2[j],arr1[i]);
                if (xtoy>ytox){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
