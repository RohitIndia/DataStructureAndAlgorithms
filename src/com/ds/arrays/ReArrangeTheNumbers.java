package com.ds.arrays;

public class ReArrangeTheNumbers {
    public static void main(String[] args) {
        reArrange(new int[]{1,2,3,4,5,6,7});
    }
    public static void reArrange(int[] arr){
       int[] temp = arr.clone();
       int small=0;
       int large = arr.length-1;
       boolean flag = true;
       for(int i=0;i<arr.length;i++){
           if(flag){
               arr[i]=temp[small++];
           }else{
               arr[i]=temp[large--];
           }
           flag = !flag;
       }
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
       }
    }
}
