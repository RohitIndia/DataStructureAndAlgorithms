package com.ds.Sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] str){
        Integer[] arr = {39,19,29,12,5};
        Integer[] sortedArr = bubbleSort(arr);
        System.out.print(Arrays.asList(sortedArr));
    }
    public static Integer[] bubbleSort(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
