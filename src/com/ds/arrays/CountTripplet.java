package com.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountTripplet {

	// Pairs having sum equivalent to thired element

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int nt = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<nt;i++) {
			
			int size = Integer.parseInt(sc.nextLine());
			String str[]=sc.nextLine().split(" ");
			int arr[] = new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=Integer.parseInt(str[j]);
			}
			Arrays.sort(arr);
			countTripplet(arr);
		}
	}
	
	public static void countTripplet(int[] arr) {
		int count =0;
		for(int i=arr.length-1;i>=0;i--) {
			int j=0;
			int k=i-1;
			while(j<k) {
				if(arr[i]==arr[j]+arr[k]) {
					count++;
					break;
				}
				else if(arr[i]>arr[j]+arr[k]) {
					j=j+1;
				}else {
					k=k-1;
				}
			}
		}
		if(count==0) {
			System.out.println(-1);
			return;
		}
		System.out.println(count);
	}

}
