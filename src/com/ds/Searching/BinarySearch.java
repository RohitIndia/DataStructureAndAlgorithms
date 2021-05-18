package com.ds.Searching;

public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr , int x){
        int l=0, r=arr.length,mid=0;
        while(l<=r){
            mid= l+r/2;
            if(arr[mid]==x){
                return mid;
            }else if(x>arr[mid]){
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
}
