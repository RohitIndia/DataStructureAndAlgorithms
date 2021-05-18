package com.ds.Sorting;

import java.util.Arrays;
import java.util.List;

class SortZerosOnesTwos {
    public static void main(String[] args) {
        doSorting(new Integer[] {0,1,1,2,2,1,1,0,0,1,1});
    }

    public static void doSorting(Integer[] arr) {
        int zCount =0;
        int oneCount=0;
        int twoCount=0;
        for(int i=0;i<arr.length;i++){
            switch(arr[i]) {
                case 0:
                    ++zCount;
                    break;
                case 1:
                    ++oneCount;
                    break;
                case 2:
                    ++twoCount;
                    break;
            }
        }
        int i=0;
        while(zCount>0){
            arr[i]=0;
            zCount--;
            i++;
        }
        while(oneCount>0){
            arr[i]=1;
            oneCount--;
            i++;
        }
        while(twoCount>0){
            arr[i]=2;
            twoCount--;
            i++;
        }
        List<Integer> list = Arrays.asList(arr);
        System.out.print(Arrays.asList(arr));
    }

}