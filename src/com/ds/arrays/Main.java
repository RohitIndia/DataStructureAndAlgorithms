package com.ds.arrays;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        // left shift operator
        // 0000 0101<<2 =0001 0100(20)
        // similar to 5*(2^2)
        System.out.println("a<<2 = " + (a << b));
        System.out.println("a<<2 = " + (1&(1 << 1)));

        System.out.print(findMissingElement(new int[] {1,2,3,4,6,7,8}));
    }

    public static int findMissingElement(int[] arr){
        int l = 0;
        int r = arr.length-1;
        int mid = 0;
        while(l<=r){
            mid = (l+r)/2;
            if(mid == 0 || (arr[mid]!=mid+1 && arr[mid-1]==mid)){
                return mid+1;
            }else if(arr[mid]==mid+1){
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }

}
