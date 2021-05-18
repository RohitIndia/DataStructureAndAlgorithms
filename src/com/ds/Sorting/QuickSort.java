package com.ds.Sorting;

public class QuickSort {
    public static void main(String[] str){
        int[] arr = {5,3,7,1,8,2,12};
        quickSort(arr, 0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
    public static  void quickSort(int[] arr, int lb, int ub){
        if(lb<ub){
            int loc = partition(arr, lb,ub);
            quickSort(arr, lb, loc-1);
            quickSort(arr, loc+1, ub);
        }
    }
    public  static int partition( int arr[], int lb, int ub){
        int pivotElement = arr[lb];
        int start  = lb;
        int end = ub;
        while(start<end){
            while(arr[start]<=pivotElement){
                start++;
            }
            while(arr[end]>pivotElement){
                end--;
            }
            if(start<end){
                swap(arr, start, end);
            }
        }
        swap(arr, lb, end);
        return end;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }
}
