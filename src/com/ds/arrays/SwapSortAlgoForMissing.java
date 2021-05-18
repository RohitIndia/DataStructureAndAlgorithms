package com.ds.arrays;

import java.util.regex.Pattern;

public class SwapSortAlgoForMissing {
    public static void main(String[] args) {
      findMissingAndDuplicate(new int[]{1,3,2,1,5});
    }
    public static void findMissingAndDuplicate(int[] arr){
        int size = arr.length;
        int i =0;
        while(i<size){
            if(arr[i]!=arr[arr[i]-1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
        for(int j=0;j<size;j++){
            if(arr[j]!=j+1){
                System.out.println("Missing Number:"+""+(j+1));
                System.out.println("Duplicate Number:"+ arr[j]);
            }
        }
    }


}
