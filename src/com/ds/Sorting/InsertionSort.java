package com.ds.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] str){
        Integer[] arr = {5,1,6,2,4,3};
        Integer[] sortedArr = insertionSort(arr);
        System.out.print(Arrays.asList(sortedArr));
    }
    public static Integer[] insertionSort(Integer[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
