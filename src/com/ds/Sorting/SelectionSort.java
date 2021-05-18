package com.ds.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] str){
        Integer[] arr = {39,19,29,12,5};
        Integer[] sortedArr = selectionSort(arr);
        System.out.print(Arrays.asList(sortedArr));

    }
    public static Integer[] selectionSort(Integer[] arr){
        int min =0;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

}
