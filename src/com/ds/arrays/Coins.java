package com.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;

class Coins {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int n = 0; n < t; n++) {
            int ta = sc.nextInt();
            int tb = sc.nextInt();
            int tc = sc.nextInt();
            String ans="";
            int arr[] = {ta,tb,tc};
            Arrays.sort(arr);
            int a = arr[0];
            int b = arr[1];
            int c= arr[2];
            if((a*2 < b) && (b*2<c)){
                ans="NO";
            }else{
               if((a+b+c)%4==0){
                   ans="yes";
               }else{
                   ans="np";
               }

            }
            System.out.println(ans);
        }

    }
}
