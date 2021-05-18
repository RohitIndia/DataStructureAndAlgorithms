package com.ds.arrays;

import java.util.Scanner;

public class RearrangeArrayAlternatively {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int not = sc.nextInt();
        while(not>0){
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i =0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            alternateRearrange(arr,size);
            not--;
        }
    }

    public static void alternateRearrange(int[] arr, int size){
        int i = size-1;
        int j = 0;
        int actualSize = size/2;

        while(actualSize>0){
            System.out.print(arr[i]+" ");
            System.out.print(arr[j]+" ");
            i--;
            j++;
            actualSize--;
        }

        if(size%2!=0){
            int mid = size/2;
            System.out.print(arr[mid]);
        }

    }
}
