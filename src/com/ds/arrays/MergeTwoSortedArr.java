package com.ds.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int not = sc.nextInt();
    while(not>0){
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        sortedMergeArr(arr1,arr2,m,n);
        not--;
    }
    }

    public static void sortedMergeArr(int[] a, int[] b, int m, int n){
        int[] res = new int[m+n];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k]=a[i];
                i++;
            }else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while(j<b.length){
            res[k] = b[j];
            j++;
            k++;
        }
        while(i<a.length){
            res[k] = a[i];
            i++;
            k++;
        }

        for(int l  =0 ;l<res.length;l++){
            System.out.print(res[l]+" ");
        }
    }

}
