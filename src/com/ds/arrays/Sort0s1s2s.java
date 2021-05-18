package com.ds.arrays;

import java.util.Arrays;
import java.util.List;

public class Sort0s1s2s {
	public static void main(String[] args) {

		int arr[] = { 0};
		sort(arr);

	}

	public static void sort(int arr[]) {
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}
			if(arr[i]==1) {
				count1++;
			}
			if(arr[i]==2) {
				count2++;
			}
		}
		int arr1[]=new int[arr.length];
		for(int i=0;i<count0;i++) {
			arr1[i]=0;
		}
		for(int i=count0;i<count0+count1;i++) {
			arr1[i]=1;
		}
		for(int i=count0+count1;i<count0+count1+count2;i++) {
			arr1[i]=2;
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
	}
}
