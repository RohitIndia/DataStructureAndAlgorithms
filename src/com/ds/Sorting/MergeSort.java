package com.ds.Sorting;

public class MergeSort {
    int[] b;
    public static void main(String[] str){
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int lb, int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public static void merge(int arr[], int lb, int mid, int ub){
        // calculate sizes of left arr and right arr
        int n1 = mid-lb+1;
        int n2 = ub-mid;

        // create left and right arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data into Left and right arrays
        for(int i=0;i<n1;i++){
            L[i]=arr[i+lb];
        }
        for(int j=0; j<n2;j++){
            R[j] = arr[mid+1+j];
        }
        int i=0,  j=0;
        int k = lb;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k]= L[i];
                i++;
                k++;
            }else{
                arr[k] = R[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }




}
